package com.example.olympiabardis.washingtondctourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {
    public MuseumsFragment() {
    }

    public static MuseumsFragment newInstance(){
        MuseumsFragment fragment = new MuseumsFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.result_list, container, false);

        final ArrayList<Result> result = new ArrayList<Result>();
        result.add(new Result(R.string.african_american_museum, R.string.african_american_address, R.string.african_american_contact, R.drawable.african_american_museum));
        result.add(new Result(R.string.american_museum, R.string.american_address, R.string.american_contact, R.drawable.american_history));
        result.add(new Result(R.string.nasa_museum, R.string.nasa_address, R.string.nasa_contact, R.drawable.air_space));
        result.add(new Result(R.string.natural_museum, R.string.natural_address, R.string.natural_contact, R.drawable.natural_history));
        result.add(new Result(R.string.gallery_museum, R.string.gallery_address, R.string.gallery_contact, R.drawable.portrait));

        ResultAdapter adapter = new ResultAdapter(getActivity(), result, R.color.categoryMuseums);

        ListView listView = (ListView) rootView.findViewById(R.id.result_list);

        listView.setAdapter(adapter);

        return rootView;
    }
    }


