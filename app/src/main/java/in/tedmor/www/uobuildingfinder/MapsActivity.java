package in.tedmor.www.uobuildingfinder;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polygon;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends AppCompatActivity implements GoogleMap.OnMapClickListener{

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.
    private PopUnderFragment popunder;
    private Polygon highlight;
    private Building currentBuilding;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        handleIntent(getIntent());
        setUpMapIfNeeded();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {
        if (Intent.ACTION_VIEW.equals(intent.getAction())) {
            searchView.setIconified(true);
            searchView.setIconified(true);
            String code = intent.getDataString();
            Building selectedBuilding = Building.getBuildingByCode(code, getResources());
            addPopUnder(selectedBuilding);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
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
        mMap.setMyLocationEnabled(true);

        LatLng mainCampus = new LatLng(45.422511, -75.682369);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mainCampus, 15));
        mMap.setOnMapClickListener(this);
        Building.setupBuildings();
        Building.attachBuildingsToMap(mMap, getResources());
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
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

    public void removePopunder() {
        getFragmentManager().beginTransaction().remove(popunder).commit();
        highlight.remove();
        popunder = null;
    }

    public void addPopUnder(Building building) {
        if (popunder != null) {
            removePopunder();
        }
        highlight = building.highlightOnMap(mMap, getResources());
        currentBuilding = building;

        if(this.popunder == null) {
            popunder = new PopUnderFragment();

        } else {
            removePopunder();
            popunder = new PopUnderFragment();
        }

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

    public void getDirections(View view) {
        System.out.println("getting directions");

        LatLng point = currentBuilding.getCenter();
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://maps.google.com/maps?" +
                        "&daddr=" + point.latitude + "," + point.longitude + "&mode=walking"));
        startActivity(intent);
    }

    public void removePopunder(View view) {
        removePopunder();
    }
}
