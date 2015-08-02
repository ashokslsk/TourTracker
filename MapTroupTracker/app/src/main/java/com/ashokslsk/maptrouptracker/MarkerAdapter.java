package com.ashokslsk.maptrouptracker;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

import java.util.HashMap;

/**
 * Created by Ashu on 02/08/15.
 */
public class MarkerAdapter implements GoogleMap.InfoWindowAdapter {

    private LayoutInflater mLayoutInflater;
    private View mView;
    private HashMap<String, Memory> mMemories;

    public MarkerAdapter(LayoutInflater layoutInflater, HashMap<String, Memory> memories) {
        mLayoutInflater = layoutInflater;
        mMemories = memories;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        if (mView == null){
            mView = mLayoutInflater.inflate(R.layout.marker,null);
        }
        Memory memory = mMemories.get(marker.getId());

        TextView title = (TextView) mView.findViewById(R.id.title);
        title.setText(memory.city);
        TextView snippet = (TextView) mView.findViewById(R.id.snippet);
        snippet.setText(memory.country);
        TextView notes = (TextView) mView.findViewById(R.id.notes);
        notes.setText(memory.notes);

        return mView;
    }
}
