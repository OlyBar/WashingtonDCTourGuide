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
public class MonumentsFragment extends Fragment {
    public MonumentsFragment() {
    }

    public static MonumentsFragment newInstance(){
        MonumentsFragment fragment = new MonumentsFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.result_list, container, false);

        final ArrayList<Result> result = new ArrayList<Result>();
        result.add(new Result(R.string.white_house_monument, R.string.white_house_address, R.string.white_house_contact, R.drawable.white_house));
        result.add(new Result(R.string.lincoln_memorial_monument, R.string.lincoln_memorial_address, R.string.lincoln_memorial_contact, R.drawable.lincoln));
        result.add(new Result(R.string.arlington_monument, R.string.arlington_address, R.string.arlington_contact, R.drawable.arlington));
        result.add(new Result(R.string.scotus_monument, R.string.scotus_address, R.string.scotus_contact, R.drawable.scotus));
        result.add(new Result(R.string.capitol_monument, R.string.capitol_address, R.string.capitol_contact, R.drawable.capitol));

        ResultAdapter adapter = new ResultAdapter(getActivity(), result, R.color.categoryMonuments);

        ListView listView = (ListView) rootView.findViewById(R.id.result_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
