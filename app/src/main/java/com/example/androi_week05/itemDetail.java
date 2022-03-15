package com.example.androi_week05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class itemDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        Intent intent = getIntent();
        Goods goods = (Goods) intent.getSerializableExtra("goods");

        TextView txtName = (TextView) findViewById(R.id.name);
        TextView txtdescription = (TextView) findViewById(R.id.description);
        TextView txtprice = (TextView) findViewById(R.id.price);
        ImageView img = findViewById(R.id.img);

        txtName.setText(goods.getName());
        txtdescription.setText(goods.getDescription());
        txtprice.setText("$"+goods.getPrice());
        img.setImageResource(goods.getImg());
    }

}