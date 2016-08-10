package com.example.martin.mylistview;


import android.media.Image;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.*;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewFragment extends Fragment {

    private ListView mListView;

    private List<String> mNewsLists;
    public NewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentView= inflater.inflate(R.layout.fragment_new, container, false);
        mListView= (ListView) fragmentView.findViewById(R.id.MyListView);

        mNewsLists= new ArrayList<String>();
        mNewsLists.add("My First Item on the list");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mNewsLists.add("More Items");
        mListView.setAdapter(new MyAdapter());
        return fragmentView;
    }

    private class MyAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return mNewsLists.size();
        }

        @Override
        public Object getItem(int position) {
            return mNewsLists.get(position);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            View rowView= getActivity().getLayoutInflater().inflate(R.layout.row,null);

            TextView textView= (TextView) rowView.findViewById(R.id.textView);
            textView.setText(mNewsLists.get(position));

            ImageView imageView= (ImageView) rowView.findViewById(R.id.imageViewPicasso);
            Picasso.with(getActivity()).load("http://i.imgur.com/DvpvklR.png").into(imageView);

            return rowView;
        }
    }

}
