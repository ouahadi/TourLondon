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
 */
public class WalksFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(this.getString(R.string.regents_canal), this.getString(R.string.regents_canal_address_link),
                this.getString(R.string.regents_canal_summary),
                R.drawable.ldn_tube, false ));
        locations.add(new Location(this.getString(R.string.primrose_hill), this.getString(R.string.primrose_link),
                this.getString(R.string.primrose_summary),
                R.drawable.primrose_hill, false ));
        locations.add(new Location(this.getString(R.string.new_river_path), this.getString(R.string.new_river_path_address_link),
                this.getString(R.string.new_river_path_summary),
                R.drawable.new_river_path, false ));


        View view = inflater.inflate(R.layout.fragment_walks,container,false);


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
