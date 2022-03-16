package com.example.androi_week05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

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

        EditText txtsearch = findViewById(R.id.txtsearch);

        Button btnD = findViewById(R.id.btnDount);
        Button btnP = findViewById(R.id.btnPink);
        Button btnF = findViewById(R.id.btnFloat);

        arrayList = new ArrayList<>();
        arrayList.add(new Goods("Tasty Donut","Spicy tasty  donut family",10,R.drawable.donut_yellow_1));
        arrayList.add(new Goods("Pink Donut","Spicy tasty donut family",20,R.drawable.tasty_donut_1));
        arrayList.add(new Goods("Floating Donut","Spicy tasty donut family",30,R.drawable.green_donut_1));
        arrayList.add(new Goods("Tasty Donut","Spicy tasty  donut family",10,R.drawable.donut_red_1));
        adt = new CustomGoodApdapter(this, R.layout.item_listview, arrayList);
        lvGoods.setAdapter(adt);



        txtsearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                adt.filterByText(editable);

            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adt.allDonut();
                adt.setActiveButton(btnD,btnF,btnP);
            }
        });


        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adt.filterFloating();
                adt.setActiveButton(btnF,btnD,btnP);
            }
        });

        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adt.filterPinkDonut();
                adt.setActiveButton(btnP,btnD,btnF);
            }
        });
    }
}