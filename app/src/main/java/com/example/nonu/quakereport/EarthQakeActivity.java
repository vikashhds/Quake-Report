package com.example.nonu.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthQakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthQakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth_qake);

        ArrayList<Word> earthquakes = new ArrayList<>();
        Word w = new Word("4.4","San Francisco", "Feb 2 2016");
        earthquakes.add(w);
        Word w1 = new Word("4.5","London", "Feb 3 2016");
        earthquakes.add(w1);
        Word w2 = new Word("4.6","Tokyo", "Jan 10 2016");
        earthquakes.add(w2);
        Word w3= new Word("4.9","Mexico City" ,"Jan 6 2016");
        earthquakes.add(w3);
        Word w4 = new Word("4.9","Moscow", "Jan 2 2016");
        earthquakes.add(w4);
        Word w5 = new Word("4.2","Rio de Janeiro", "Jan 2 2016");
        earthquakes.add(w5);
        Word w6 = new Word("4.0","Paris", "Jan 1 2016");
        earthquakes.add(w6);

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthQuakeAdapter adapter = new EarthQuakeAdapter(this,earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}

