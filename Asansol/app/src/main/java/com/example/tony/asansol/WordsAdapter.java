package com.example.tony.asansol;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordsAdapter extends ArrayAdapter<Words> {

    public WordsAdapter(Activity mActivity, ArrayList<Words> words) {
        super(mActivity, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;

        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.selflist, parent, false);
        }

        Words currentWords = getItem(position);
        TextView firstWord = (TextView) listView.findViewById(R.id.descrption_textview);
        TextView heading = (TextView) listView.findViewById(R.id.Head_textview);
        ImageView image = (ImageView) listView.findViewById(R.id.image_view);

        firstWord.setText(currentWords.getmDescrption());
        heading.setText(currentWords.getmHeading());
        image.setImageResource(currentWords.getmImage());

        return listView;
    }
}
