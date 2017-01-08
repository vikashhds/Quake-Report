package com.example.nonu.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nonu on 08-01-2017.
 */

public class EarthQuakeAdapter  extends ArrayAdapter<Word> {

    public EarthQuakeAdapter(Activity context, ArrayList<Word> earthquakes) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, earthquakes);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_format, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentwordtext = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude_text);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        magnitudeTextView.setText(currentwordtext.getMagnitude());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_text);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        placeTextView.setText(currentwordtext.getPlace());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        dateTextView.setText(currentwordtext.getDate());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
