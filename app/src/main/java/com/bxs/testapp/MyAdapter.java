package com.bxs.testapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by bhupinder on 1/5/15.
 */
public class MyAdapter extends BaseAdapter {

    private Context context;
    public MyAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.adapter_card_list, viewGroup, false);
        TextView textView = (TextView) view.findViewById(R.id.tvColor);
        if(i==2||i==8){
            textView.setBackgroundColor(context.getResources().getColor(R.color.Orange));
        } else{
            textView.setBackgroundColor(context.getResources().getColor(R.color.Green));
        }
        return view;
    }
}
