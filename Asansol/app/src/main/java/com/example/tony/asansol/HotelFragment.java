package com.example.tony.asansol;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragmentlist, container, false);

        ArrayList<Words> words = new ArrayList<>();

        words.add(new Words(R.string.The_Hindustan_Residency, R.string.The_Hindustan_Residency_desc, R.drawable.thehindustanresidency));
        words.add(new Words(R.string.The_Asansol_International, R.string.The_Asansol_International_desc, R.drawable.hotelasansolinternational));
        words.add(new Words(R.string.Sormistha_Residency, R.string.Sormistha_Residency_desc, R.drawable.sormistharesidency));
        words.add(new Words(R.string.The_Fern_Residency_Galaxy_Mall, R.string.The_Fern_Residency_Galaxy_Mall_desc, R.drawable.thefernresidencygalaxymall));
        words.add(new Words(R.string.The_Citi_Residenci, R.string.The_Citi_Residenci_desc, R.drawable.thecitiresidenci));


        WordsAdapter itemAdapter = new WordsAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list_item);
        listView.setAdapter(itemAdapter);

        return rootView;
    }
}
