package rocks.lechick.android.tourlondon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TheatresFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class TheatresFragment extends Fragment {


    public TheatresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(this.getString(R.string.national_theatre), this.getString(R.string.national_theatre_whats_on),
                this.getString(R.string.national_theatre_address_link), this.getString(R.string.national_theatre_website),
                this.getString(R.string.national_theatre_phone), this.getString(R.string.national_theatre_summary),
                R.drawable.national_theatre,false ));

        locations.add(new Location(this.getString(R.string.roh), this.getString(R.string.roh_whats_on),
                this.getString(R.string.roh_address_link), this.getString(R.string.roh_website),
                this.getString(R.string.roh_phone), this.getString(R.string.roh_summary),
                R.drawable.royal_opera,false ));

        locations.add(new Location(this.getString(R.string.sadlers_wells), this.getString(R.string.sadlers_wells_whats_on),
                this.getString(R.string.sadlers_wells_address_link), this.getString(R.string.sadlers_wells_website),
                this.getString(R.string.sadlers_wells_phone), this.getString(R.string.sadlers_wells_summary),
                R.drawable.sadlers_wells,false ));

        locations.add(new Location(this.getString(R.string.barbican), this.getString(R.string.barbican_whats_on),
                this.getString(R.string.barbican_address_link), this.getString(R.string.barbican_website),
                this.getString(R.string.barbican_phone), this.getString(R.string.barbican_summary),
                R.drawable.barbican_theatre,false ));


        View view = inflater.inflate(R.layout.fragment_theatres,container,false);


        GridView gridview = (GridView) view.findViewById(R.id.gridview);
        final AttractionsAdapter gridAdaptor = new AttractionsAdapter(getActivity(), locations);
        gridview.setAdapter(gridAdaptor);

        //set up onClick listener
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Location selectedAttraction = locations.get(position);
                Intent openDetails = new Intent (getActivity(), AttractionDetailsActivity.class);
                Log.v("Loc Name","It seems to be "+ selectedAttraction.getmAttractionName());
                Bundle attractionDetails = new Bundle();
                attractionDetails.putString("LocationName", selectedAttraction.getmAttractionName());
                attractionDetails.putString("LocationLink", selectedAttraction.getmAttractionAddressWebsite());
                Log.v("addresslink", "This is fucking address link" + selectedAttraction.getmAttractionAddressWebsite());
                attractionDetails.putString("LocationWebsite", selectedAttraction.getmAttractionWebsite());
                Log.v("website", "This is fucking website" + selectedAttraction.getmAttractionWebsite());
                attractionDetails.putString("ExtraBit", selectedAttraction.getmTheatreWhatsOn());
                attractionDetails.putString("LocationSummary", selectedAttraction.getmAttractionSummary());
                attractionDetails.putString("LocationPhone", selectedAttraction.getmAttractionPhone());
                attractionDetails.putInt("Image", selectedAttraction.getmAttractionImage1());
                attractionDetails.putInt("Position", position);
                openDetails.putExtras(attractionDetails);
                startActivity(openDetails);
            }

        });

        view = gridview;
        return view;
    }


}
