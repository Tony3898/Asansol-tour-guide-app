package com.example.tony.asansol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class ExploreFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragmentlist, container, false);

        final ArrayList<Words> words = new ArrayList<>();

        words.add(new Words(R.string.durgapur, R.string.durgapur_Desc, R.drawable.durgapur));
        words.add(new Words(R.string.bardhaman, R.string.bardhaman_desc, R.drawable.bardhaman));
        words.add(new Words(R.string.maithon, R.string.maithon_desc, R.drawable.maithon));
        words.add(new Words(R.string.nabadwip, R.string.nabadwip_desc, R.drawable.nabadwip));
        words.add(new Words(R.string.kalna, R.string.kalna_desc, R.drawable.kalna));
        words.add(new Words(R.string.katwa, R.string.katwa_desc, R.drawable.katwa));
        words.add(new Words(R.string.chittaranjan, R.string.chittaranjan_desc, R.drawable.chittaranjan));
        words.add(new Words(R.string.raniganj, R.string.raniganj_desc, R.drawable.raniganj));

        WordsAdapter itemAdapter = new WordsAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list_item);
        listView.setAdapter(itemAdapter);


        return rootView;
    }
}
