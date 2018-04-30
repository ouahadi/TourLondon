package rocks.lechick.android.tourlondon;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(this.getString(R.string.british_museum), this.getString(R.string.british_museum_address),
                this.getString(R.string.british_museum_hours), this.getString(R.string.british_museum_phone),
                this.getString(R.string.british_museum_website), this.getString(R.string.british_museum_summary),
                        R.drawable.british_museum,  R.drawable.british_museum_2,  R.drawable.british_museum_3,
                false ));
        locations.add(new Location(this.getString(R.string.national_gallery), this.getString(R.string.national_gallery_address),
                this.getString(R.string.national_gallery_hours), this.getString(R.string.snational_gallery_phone),
                this.getString(R.string.national_gallery_website), this.getString(R.string.national_gallery_summary),
                R.drawable.national_gallery,  R.drawable.national_gallery_2,  R.drawable.national_gallery_3,
                false ));
        locations.add(new Location(this.getString(R.string.tate), this.getString(R.string.tate_address),
                this.getString(R.string.tate_hours), this.getString(R.string.tate_phone),
                this.getString(R.string.tate_website), this.getString(R.string.tate_summary),
                R.drawable.tate_modern,  R.drawable.tate_modern_2,  R.drawable.tate_modern_3,
                false ));
        locations.add(new Location(this.getString(R.string.transport_museum), this.getString(R.string.transport_museum_address),
                this.getString(R.string.transport_museum_hours), this.getString(R.string.transport_museum_phone),
                this.getString(R.string.transport_museum_website), this.getString(R.string.transport_museum_summary),
                R.drawable.transport_museum,  R.drawable.transport_museum_2,  R.drawable.transport_museum_3,
                false ));
        locations.add(new Location(this.getString(R.string.v_and_a), this.getString(R.string.v_and_a_address),
                this.getString(R.string.v_and_a_hours), this.getString(R.string.v_and_a_phone),
                this.getString(R.string.v_and_a_website), this.getString(R.string.v_and_a_summary),
                R.drawable.victoria_and_albert,  R.drawable.victoria_and_albert_2,  R.drawable.victoria_and_albert_3,
                false ));
        locations.add(new Location(this.getString(R.string.science), this.getString(R.string.science_address),
                this.getString(R.string.science_hours), this.getString(R.string.science_phone),
                this.getString(R.string.science_website), this.getString(R.string.science_summary),
                R.drawable.science_museum,  R.drawable.science_museum_2,  R.drawable.science_museum_london_3,
                false ));
        locations.add(new Location(this.getString(R.string.museum_of_london), this.getString(R.string.museum_of_london_address),
                this.getString(R.string.museum_of_london_hours), this.getString(R.string.museum_of_london_phone),
                this.getString(R.string.museum_of_london_website), this.getString(R.string.museum_of_london_summary),
                R.drawable.museum_of_london,  R.drawable.museum_of_london_2,  R.drawable.museum_of_london_3,
                false ));
        locations.add(new Location(this.getString(R.string.natural_history), this.getString(R.string.natural_history_address),
                this.getString(R.string.natural_history_hours), this.getString(R.string.natural_history_phone),
                this.getString(R.string.natural_history_website), this.getString(R.string.natural_history_summary),
                R.drawable.natural_history_museum,  R.drawable.natural_history_museum_2,  R.drawable.natural_history_museum_3,
                false ));


        View view = inflater.inflate(R.layout.fragment_museums,container,false);


        GridView gridview = (GridView) view.findViewById(R.id.gridview);
        final LocationAdapter gridAdaptor = new LocationAdapter(getActivity(), locations);
        gridview.setAdapter(gridAdaptor);


        view = gridview;
        return view;
    }

}
