package com.bxs.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by bhupinder on 1/5/15.
 */
public class CardListView extends Fragment {

    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.card_list, container, false);
        listView = (ListView) view.findViewById(R.id.listView);
        listView.setAdapter(new MyAdapter(getActivity()));

        return view;
    }


}
