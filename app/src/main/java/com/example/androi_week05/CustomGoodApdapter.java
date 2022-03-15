package com.example.androi_week05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodApdapter extends BaseAdapter {

    Context ctx;
    int layoutItem;
    ArrayList<Goods> arrayList;


    public CustomGoodApdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layoutItem, viewGroup,false);

        TextView txtName =view.findViewById(R.id.txtname);
        TextView txtdescription =view.findViewById(R.id.txtdesciption);
        TextView txtprice =view.findViewById(R.id.txtprice);
        ImageView imageitem =view.findViewById(R.id.imageitem);

        txtName.setText(arrayList.get(i).getName());
        txtdescription.setText(arrayList.get(i).getDescription());
        txtprice.setText("$ "+arrayList.get(i).getPrice());
        return  view;


    }
}
