package com.grademojo.recycler_view_example;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private RecyclerView recyclerView;

    private MyAdapter mAdapter;

    private RecyclerView.LayoutManager mLayoutManager;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        // Step 1: Store recycler view's reference
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);




        // Step 2: Make adapter object
        List<String> input = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            input.add("Test" + i);
        }
        mAdapter = new MyAdapter(input);



        // Step 3: bind the adapter to recycler view
        recyclerView.setAdapter(mAdapter);



        // Step 4: make a layout manager object
        mLayoutManager = new LinearLayoutManager(this);



        // Step 5: bind the layoutManager object to recycler view
        recyclerView.setLayoutManager(mLayoutManager);




        // Optional stuff
        recyclerView.setHasFixedSize(true);
    }
}
