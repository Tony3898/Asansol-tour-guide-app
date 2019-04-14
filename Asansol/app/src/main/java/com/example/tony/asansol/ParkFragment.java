package com.example.tony.asansol;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ParkFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragmentlist, container, false);

        ArrayList<Words> words = new ArrayList<>();

        words.add(new Words(R.string.Nehru_Park, R.string.Nehru_Park_desc, R.drawable.nehrupark));
        words.add(new Words(R.string.Satabdi_Park, R.string.Satabdi_Park_desc, R.drawable.satabdipark));
        words.add(new Words(R.string.Panorama_Water_Park, R.string.Panorama_Water_Park_desc, R.drawable.panoramaparkasansol));

        words.add(new Words(R.string.Anand_Amusment_Park, R.string.Anand_Amusment_Park_desc, R.drawable.durgapurwaterpark));
        WordsAdapter itemAdapter = new WordsAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list_item);
        listView.setAdapter(itemAdapter);

        return rootView;
    }
}
