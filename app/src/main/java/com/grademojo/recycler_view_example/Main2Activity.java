package com.grademojo.recycler_view_example;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends Activity {

    private RecyclerView recyclerView;

    private Adapter mAdapter;

    private RecyclerView.LayoutManager mLayoutManager;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);



        // Step 1: Store recycler view's reference
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);




        // Step 2: Make adapter object
        List<Pojo_practice> input = new ArrayList<>();

        for (int i = 0; i < 100; i++) {


            Pojo_practice simple_pojo = new Pojo_practice();


            simple_pojo.setValues("Mani" +i);

            simple_pojo.setValues2("Kumar"+i);





            input.add(simple_pojo);
        }
        mAdapter = new Adapter(input);





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

