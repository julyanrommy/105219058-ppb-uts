package com.example.utsppbrevisi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String se1[], se2[];
    int images[] = {R.drawable.hotel1,R.drawable.hotel2,R.drawable.hotel3,R.drawable.hotel4,
            R.drawable.hotel5,R.drawable.hotel6,R.drawable.hotel7,R.drawable.hotel8,
            R.drawable.hotel9,R.drawable.hotel10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        se1 = getResources().getStringArray(R.array.middle_programming);
        se2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, se1, se2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}