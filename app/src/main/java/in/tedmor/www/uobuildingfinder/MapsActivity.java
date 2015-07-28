package in.tedmor.www.uobuildingfinder;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polygon;

import java.util.ArrayList;

public class MapsActivity extends AppCompatActivity implements GoogleMap.OnMapClickListener, ListView.OnItemClickListener{

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.
    private PopUnderFragment popunder;
    private Polygon highlight;
    private Building currentBuilding;
    private Boolean restorePopunder = false;
    private SearchView searchView;
    private ListView mDrawerList;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private String[] sideMenuList;
    private CharSequence mTitle;
    private final LatLng mainCampus = new LatLng(45.422511, -75.682369);
    private final LatLng rgCampus = new LatLng(45.40278910087822, -75.6459586322307);
    private final LatLng lCampus = new LatLng(45.41599651987494,  -75.6670676171779);
    private final LatLng EMBACampus = new LatLng(45.421326441071535, -75.69806858897209);
    private String defaultCampus;
    private Boolean locationEnabled;


    public void loadSettings() {
            defaultCampus = PreferenceManager
                    .getDefaultSharedPreferences(this)
                    .getString("CAMPUS", "Main");
            locationEnabled = PreferenceManager
                .getDefaultSharedPreferences(this)
                .getBoolean("LOC", true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        loadSettings();
        handleIntent(getIntent());

        setUpMapIfNeeded();

        sideMenuList = getResources().getStringArray(R.array.side_menu_array);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        ObjectDrawerItem[] drawerItem = new ObjectDrawerItem[2];

        drawerItem[0] = new ObjectDrawerItem(R.drawable.ic_action_map,
                getResources().getString(R.string.select_campus));
        drawerItem[1] = new ObjectDrawerItem(R.drawable.ic_action_settings,
                getResources().getString(R.string.action_settings));

        DrawerItemCustomAdapter adapter = new DrawerItemCustomAdapter(this, R.layout.listview_item_row, drawerItem);
        mDrawerList.setAdapter(adapter);
        mDrawerList.setOnItemClickListener(this);

        mTitle = getTitle();
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                mDrawerLayout,         /* DrawerLayout object */
                R.string.drawer_open,  /* "open drawer" description */
                R.string.drawer_close  /* "close drawer" description */
        ) {

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getSupportActionBar().setTitle(mTitle);
            }

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle(mTitle);
            }
        };

        // Set the drawer toggle as the DrawerListener
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);


        if (savedInstanceState != null) {
            restorePopunder = savedInstanceState.getBoolean("restorePopunder");
            if (restorePopunder) {
                currentBuilding =
                        Building.getBuildingByCode(
                                savedInstanceState.getString("currentBuilding"),
                                getResources()
                        );
                restorePopunder = false;

                addPopUnder(currentBuilding);
            }
        }


    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }



    @Override
    protected void onPause() {
        if (popunder != null) {
            removePopunder();
            restorePopunder = true;
        }
        searchView.setIconified(true);
        searchView.setIconified(true);
        super.onPause();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {
        if (Intent.ACTION_VIEW.equals(intent.getAction())) {
            if (searchView != null) {
                searchView.setIconified(true);
                searchView.setIconified(true);
                String code = intent.getDataString();
                if (code != null) {
                    Building selectedBuilding = Building.getBuildingByCode(code, getResources());
                    addPopUnder(selectedBuilding);
                }
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putBoolean("restorePopunder", restorePopunder);
        if (restorePopunder) {
            outState.putString("currentBuilding",
                    getResources().getString(currentBuilding.getCode()));
        }
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
        if (currentBuilding != null) {
            addPopUnder(currentBuilding);
        }
        loadSettings();
        mMap.setMyLocationEnabled(locationEnabled);
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.maps_activity_actions, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setSubmitButtonEnabled(false);
        // Get the SearchView and set the searchable configuration
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        // Assumes current activity is the searchable activity
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // This is to disable handling of the submit function, we only want suggestions.
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    private void setUpMap() {
        mMap.setMyLocationEnabled(locationEnabled);


        LatLng point = mainCampus;
        int zoom = 15;

        if(defaultCampus.equals("Main")) {
            point = mainCampus;
            zoom = 15;
        } else if (defaultCampus.equals("Roger Guindon")) {
            point = this.rgCampus;
            zoom = 15;
        } else if (defaultCampus.equals("Executive MBA")) {
            point = this.EMBACampus;
            zoom = 17;
        } else if (defaultCampus.equals("Lees")) {
            point = this.lCampus;
            zoom = 17;
        }

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(point, zoom));
        mMap.setOnMapClickListener(this);
        Building.setupBuildings();
        Building.attachBuildingsToMap(mMap, getResources());
    }

    public void switchCampus() {
        Resources r = getResources();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        CharSequence[] campuses = new CharSequence[] {r.getString(R.string.campus_main),
                r.getString(R.string.campus_lees), r.getString(R.string.campus_rg),
                r.getString(R.string.campus_mba)};

        builder.setTitle(R.id.switch_campus_title);
        builder.setItems(campuses, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                moveToCampus(which);
            }
        });
        builder.show();
    }

    // 0=main, 1=lees, 2=RGN, 3=EMBA
    private void moveToCampus(int campus) {
        switch (campus) {
            case 0:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(mainCampus, 15));
                break;
            case 1:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lCampus, 17));
                break;
            case 2:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(rgCampus, 15));
                break;
            case 3:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(EMBACampus, 17));
                break;
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        switch (item.getItemId()) {
            case R.id.action_search:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

//   if a building gets clicked, do something with that
    @Override
    public void onMapClick(LatLng point) {
        Building clickedOn;
        boolean onBuilding = false;
        for (int i=0; i < Building.buildings.size(); i++) {
            if (Building.buildings.get(i).containsPoint(point)) {
                clickedOn = Building.buildings.get(i);
                onBuilding = true;

                addPopUnder(clickedOn);
                break;
            }
        }

        // remove description if the popunder was dismissed
        if (!onBuilding && popunder != null) {
            System.out.println("user clicked outside of building");
            removePopunder();
        }
    }
    public void removePopunder(View view) {
        removePopunder();
    }

    public void removePopunder() {
        getFragmentManager().beginTransaction().remove(popunder).commit();
        highlight.remove();
        popunder = null;
    }

    public void addPopUnder(Building building) {
        System.out.println("Building is being added to pop under");
        if (popunder != null) {
            removePopunder();
        }
        highlight = building.highlightOnMap(mMap, getResources());
        currentBuilding = building;

        popunder = new PopUnderFragment();

        ArrayList<String> addrs = new ArrayList<String>();

        for (Integer addr: building.getAddresses()) {
            addrs.add(getString(addr));
        }

        // set the info for the popup to display
        popunder.setBuilding(getString(building.getCode()),
                getString(building.getName()),
                addrs,
                getString(building.getURL()));

        // move the camera focus
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(building.getCenter(), 18), 500, null);


        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.rLayout, popunder);

        ft.commit();
    }

    @Override
    public void onBackPressed() {
        if (popunder != null) {
            removePopunder();
        } else {
            super.onBackPressed();
        }
    }

    public void getDirections(View view) {
        System.out.println("getting directions");

        LatLng point = currentBuilding.getCenter();
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://maps.google.com/maps?" +
                        "&daddr=" + point.latitude + "," + point.longitude + "&mode=walking"));
        startActivity(intent);
    }

    public void openUrl(View view) {
        String URL = getResources().getString(currentBuilding.getURL());
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse(URL));
        startActivity(intent);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        System.out.println("list item was clicked");
        switch ((int)id) {
            case 0:
                switchCampus();
                mDrawerLayout.closeDrawers();
                break;
            case 1:
                System.out.println("open settings");
                openSettings();
                mDrawerLayout.closeDrawers();
                break;
        }
    }

    public void openSettings() {
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
        return;
    }
}
