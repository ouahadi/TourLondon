package rocks.lechick.android.tourlondon;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alek on 26/04/2018.
 */

public class LocationAdapter extends BaseAdapter {
    private final Context mContext;
    private final ArrayList<Location> locations;

    public LocationAdapter(Context context, ArrayList<> locations)  {
        this.mContext = context;
        this.locations = locations;
    }

    @Override
    public int getCount() {
        return locations.length;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    // 4
    @Override
    public Object getItem(int position) {
        return null;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1
        final Location currentLoc = locations[position];

        // 2
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.grid_element, null);
        }

        // 3
        final TextView locationName = (TextView) convertView.findViewById(R.id.grid_item_name);
        final ImageView imageView = (ImageView) convertView.findViewById(R.id.grid_thumbnail);


        // 4
        imageView.setImageResource(currentLoc.getmAttractionImage1());
        locationName.setText(currentLoc.getmAttractionName());

        return convertView;
    }



}