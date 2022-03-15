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
        arrayList.add(new Goods("Pink Donut","Spicy tasty donut family",20,R.drawable.tasty_donut_1));
        arrayList.add(new Goods("Floating Donut","Spicy tasty donut family",30,R.drawable.green_donut_1));
        arrayList.add(new Goods("Tasty Donut","Spicy tasty  donut family",10,R.drawable.donut_red_1));
        adt = new CustomGoodApdapter(this, R.layout.item_listview, arrayList);
        lvGoods.setAdapter(adt);
    }
}