package com.example.androi_week05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvGoods;
    CustomGoodApdapter adt;
    ArrayList<Goods> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods = findViewById(R.id.lvGoods);

        arrayList = new ArrayList<>();
        arrayList.add(new Goods("Tasty Donut","Spicy tasty  donut family",10,R.drawable.donut_yellow_1));
        arrayList.add(new Goods("Cook","Cook tasty  donut family",10,R.drawable.ca_nau_lau));
        arrayList.add(new Goods("Tasty Donut","Spicy tasty  donut family",10,R.drawable.donut_yellow_1));
        arrayList.add(new Goods("Tasty Donut","Spicy tasty  donut family",10,R.drawable.donut_yellow_1));
        arrayList.add(new Goods("Tasty Donut","Spicy tasty  donut family",10,R.drawable.donut_yellow_1));
        arrayList.add(new Goods("Tasty Donut","Spicy tasty  donut family",10,R.drawable.donut_yellow_1));
        adt = new CustomGoodApdapter(this, R.layout.item_listview, arrayList);
        lvGoods.setAdapter(adt);
    }
}