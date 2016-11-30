package com.example.olympiabardis.washingtondctourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPlaceholder extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";


    public FragmentPlaceholder() {
    }

    public static FragmentPlaceholder newInstance(int sectionNumber){
        FragmentPlaceholder fragment = new FragmentPlaceholder();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);
        return rootView;
    }

}
