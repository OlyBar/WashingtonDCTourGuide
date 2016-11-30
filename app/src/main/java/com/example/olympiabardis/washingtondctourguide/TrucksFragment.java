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
public class TrucksFragment extends Fragment {
    public TrucksFragment() {
    }

    public static TrucksFragment newInstance(){
        TrucksFragment fragment = new TrucksFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.result_list, container, false);

        final ArrayList<Result> result = new ArrayList<Result>();
        result.add(new Result(R.string.crepes_truck, R.string.crepes_address, R.string.crepes_contact, R.drawable.holy_crepes));
        result.add(new Result(R.string.arepa_truck, R.string.arepa_address, R.string.arepa_contact, R.drawable.arepa_zone));
        result.add(new Result(R.string.donuts_truck, R.string.donuts_address, R.string.donuts_contact, R.drawable.donut_bites));
        result.add(new Result(R.string.rito_truck, R.string.rito_address, R.string.rito_contact, R.drawable.rito_loco));
        result.add(new Result(R.string.fish_truck, R.string.fish_address, R.string.fish_contact, R.drawable.go_fish));

        ResultAdapter adapter = new ResultAdapter(getActivity(), result, R.color.categoryFoodTrucks);

        ListView listView = (ListView) rootView.findViewById(R.id.result_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
