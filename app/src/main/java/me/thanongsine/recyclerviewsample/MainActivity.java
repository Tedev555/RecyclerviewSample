package me.thanongsine.recyclerviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Integer> imgResList = new ArrayList<>();
        imgResList.add(R.drawable.sunset01);
        imgResList.add(R.drawable.sunset01);
        imgResList.add(R.drawable.sunset01);
        imgResList.add(R.drawable.sunset01);
        imgResList.add(R.drawable.sunset01);
        imgResList.add(R.drawable.sunset01);
        imgResList.add(R.drawable.sunset01);
        imgResList.add(R.drawable.sunset01);
        imgResList.add(R.drawable.sunset01);
        imgResList.add(R.drawable.sunset01);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(imgResList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
    }
}
