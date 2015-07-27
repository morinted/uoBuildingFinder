package in.tedmor.www.uobuildingfinder;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PopUnderFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PopUnderFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PopUnderFragment extends Fragment {

    private String buildingName;
    private String buildingCode;
    private List<String> buildingAddresses;
    private String url;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.

     * @return A new instance of fragment PopUnderFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PopUnderFragment newInstance() {
        PopUnderFragment fragment = new PopUnderFragment();
        return fragment;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_pop_under, container, false);
        ImageButton site = (ImageButton) v.findViewById(R.id.website);
        // add click listener to dismiss if clicked outside the box
        TextView title = (TextView)v.findViewById(R.id.popUnderTitle);
        title.setText(buildingCode + " - " + buildingName);

        TextView addrView = (TextView)v.findViewById(R.id.popUnderAddress);

        String addrText = new String();

        for (String addr: this.buildingAddresses) {
            addrText = addrText + addr + "\n";
        }

        if (url == null || url.length() == 0) {
            site.setVisibility(View.GONE);
        } else {
            site.setVisibility(View.VISIBLE);
        }

        addrView.setText(addrText);

        return v;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    public void setBuilding(String code, String name, List<String> addrs, String url) {
        this.buildingCode = code;
        this.buildingName = name;
        this.buildingAddresses = addrs;
        this.url = url;
    }


}
