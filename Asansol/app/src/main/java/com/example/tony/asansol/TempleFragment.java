package com.example.tony.asansol;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class TempleFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragmentlist, container, false);

        ArrayList<Words> words = new ArrayList<>();

        words.add(new Words(R.string.Ghabar_Buri_Chandi_Temple, R.string.Ghabar_Buri_Chandi_Temple_desc, R.drawable.ghagarburichanditemple));

        WordsAdapter itemAdapter = new WordsAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list_item);
        listView.setAdapter(itemAdapter);

        return rootView;
    }
}
