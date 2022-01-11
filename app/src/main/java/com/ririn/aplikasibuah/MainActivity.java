package com.ririn.aplikasibuah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recylerView;

    String s1[] = {
            "buah1",
            "buah2",
            "buah3",
            "buah4",
            "buah5",
            "buah6",
            "buah7",
            "buah8",
            "buah9",
            "buah10"

    };
    String s2[] = {
            "buah1",
            "buah2",
            "buah3",
            "buah4",
            "buah5",
            "buah6",
            "buah7",
            "buah8",
            "buah9",
            "buah10"

    };
    int image[] = {
            R.drawable.buah1,
            R.drawable.buah2,
            R.drawable.buah3,
            R.drawable.buah5,
            R.drawable.buah4,
            R.drawable.buah6,
            R.drawable.buah7,
            R.drawable.buah8,
            R.drawable.buah9,
            R.drawable.buah10
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recylerView = findViewById(R.id.recylerView);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, image);
        recylerView.setAdapter(myAdapter);
        recylerView.hasFixedSize();
        recylerView.setLayoutManager(new LinearLayoutManager(this));
    }
}