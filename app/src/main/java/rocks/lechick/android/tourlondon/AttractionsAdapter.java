package rocks.lechick.android.tourlondon;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alek on 26/04/2018.
 */

public class AttractionsAdapter extends BaseAdapter {
    private final Context mContext;
    private final ArrayList<Location> locations;


    public AttractionsAdapter(Context context, ArrayList<Location> locations) {
        this.mContext = context;
        this.locations = locations;
    }

    @Override
    public int getCount() {
        return locations.size();
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

    public static class ViewHolder {
        public ImageView imageView;
        public TextView locationName;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1
        final Location currentLoc = locations.get(position);
        ViewHolder view;
        final LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        // 2
        if (convertView == null) {
            view = new ViewHolder();
            convertView = layoutInflater.inflate(R.layout.grid_element, null);


            view.locationName = (TextView) convertView.findViewById(R.id.grid_item_name);
            view.imageView = (ImageView) convertView.findViewById(R.id.grid_thumbnail);
            convertView.setTag(view);
        }
        else
        {
            view = (ViewHolder) convertView.getTag();
        }

        view.locationName.setText(currentLoc.getmAttractionName());
        view.imageView.setImageResource(currentLoc.getmAttractionImage1());

        return convertView;
    }



}