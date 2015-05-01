package com.bxs.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by bhupinder on 1/5/15.
 */
public class CardListView extends Activity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_list);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new MyAdapter(getApplicationContext()));

    }
}
