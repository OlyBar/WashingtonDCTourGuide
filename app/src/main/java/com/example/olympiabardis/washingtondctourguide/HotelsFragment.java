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
public class HotelsFragment extends Fragment {
    public HotelsFragment() {
    }

    public static HotelsFragment newInstance(){
        HotelsFragment fragment = new HotelsFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.result_list, container, false);

        final ArrayList<Result> result = new ArrayList<Result>();
        result.add(new Result(R.string.morrison_hotel, R.string.morrison_address, R.string.morrison_contact, R.drawable.morrison_clark_historic_inn));
        result.add(new Result(R.string.hyatt_hotel, R.string.hyatt_address, R.string.hyatt_contact, R.drawable.grand_hyatt_dc));
        result.add(new Result(R.string.hilton_hotel, R.string.hilton_address, R.string.hilton_contact, R.drawable.hilton));
        result.add(new Result(R.string.sofitel_hotel, R.string.sofitel_address, R.string.sofitel_contact, R.drawable.sofitel_washington_dc));
        result.add(new Result(R.string.mandarin_hotel, R.string.mandarin_address, R.string.mandarin_contact, R.drawable.mandarin));

        ResultAdapter adapter = new ResultAdapter(getActivity(), result, R.color.categoryHotels);

        ListView listView = (ListView) rootView.findViewById(R.id.result_list);

        listView.setAdapter(adapter);

        return rootView;

    }
    }

