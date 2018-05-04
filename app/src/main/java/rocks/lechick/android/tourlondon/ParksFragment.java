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


public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(this.getString(R.string.hyde_park), this.getString(R.string.hyde_park_address_link),
                this.getString(R.string.hyde_park_summary),
                R.drawable.hyde_park, false ));
        locations.add(new Location(this.getString(R.string.battersea_park), this.getString(R.string.battersea_park_address_link),
                this.getString(R.string.battersea_park_summary),
                R.drawable.battersea_park, false ));
        locations.add(new Location(this.getString(R.string.st_james_park), this.getString(R.string.st_james_park_address_link),
                this.getString(R.string.st_james_park_summary),
                R.drawable.st_james_park, false ));
        locations.add(new Location(this.getString(R.string.regents_park), this.getString(R.string.regents_park_address_link),
                this.getString(R.string.regents_park_summary),
                R.drawable.regents_park, false ));


        View view = inflater.inflate(R.layout.fragment_parks,container,false);


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
                attractionDetails.putString("LocationSummary", selectedAttraction.getmAttractionSummary());
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