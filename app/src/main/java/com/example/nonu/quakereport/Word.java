package com.example.nonu.quakereport;

/**
 * Created by Nonu on 08-01-2017.
 */

public class Word {
    private String mPlace;
    private String mMagnitude;
    private String mDate;

    public Word(String magnitude, String place,  String date){
        mMagnitude = magnitude;
        mPlace = place;
        mDate = date;
    }

    public String getPlace(){
        return mPlace;
    }

    public String getMagnitude(){
        return mMagnitude;
    }

    public String getDate(){
        return mDate;
    }
}
