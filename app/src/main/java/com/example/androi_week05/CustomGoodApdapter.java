package com.example.androi_week05;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CustomGoodApdapter extends BaseAdapter {

    private Context ctx;
    private int layoutItem;
    private ArrayList<Goods> arrayList;
    private List<Goods> listFilter;
    private int positionSelect = -1;


    public CustomGoodApdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
        this.listFilter = arrayList;
        System.out.println("list view" + listFilter);
    }

    @Override
    public int getCount() {
        if(listFilter.size() !=0 && !listFilter.isEmpty()){
            return  listFilter.size();
        }
        return  0;
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
    public View getView(int i, View convetView, ViewGroup viewGroup) {
        convetView = LayoutInflater.from(ctx).inflate(layoutItem, viewGroup,false);

        TextView txtName = (TextView) convetView.findViewById(R.id.txtname);
        TextView txtdescription = (TextView)convetView.findViewById(R.id.txtdesciption);
        TextView txtprice =(TextView) convetView.findViewById(R.id.txtprice);
        ImageView imageitem = (ImageView) convetView.findViewById(R.id.imageitem);

        View viewItem = convetView.findViewById(R.id.view);

        System.out.println(listFilter.size());
            txtName.setText(listFilter.get(i).getName());
            txtdescription.setText(listFilter.get(i).getDescription());
            txtprice.setText("$ "+listFilter.get(i).getPrice());
            imageitem.setImageResource(listFilter.get(i).getImg());
        convetView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ctx,String.valueOf(i),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ctx,itemDetail.class);

                intent.putExtra("goods",listFilter.get(i));
                ctx.startActivity(intent);
            }
        });

        if(positionSelect == i){
            viewItem.setBackgroundColor(Color.GRAY);
        } else{
            viewItem.setBackgroundColor(Color.WHITE);
        }
        return  convetView;
    }



    public void filterDount(String filter){

        listFilter = new ArrayList<>();
        for(Goods item: arrayList){
            if(item.getName().toLowerCase().indexOf(filter) != -1){
                listFilter.add(item);
            }
        }        System.out.println(listFilter.size());

        notifyDataSetChanged();
    }


    public void filterPinkDonut(){
        filterDount("pink");
    }

    public void filterFloating(){
        filterDount("floating");
    }

    public void allDonut(){
        listFilter = arrayList;
        notifyDataSetChanged();
    }

    public void filterByText(Editable text){
        listFilter = new ArrayList<>();
        for(Goods item: arrayList){
            if(item.getName().toLowerCase().indexOf(text.toString()) != -1){
                listFilter.add(item);
            }
        }
        notifyDataSetChanged();
    }

    public void setActiveButton(Button buttonActive, Button btn1, Button btn2) {
        buttonActive.setBackgroundColor(Color.BLUE);
        buttonActive.setTextColor(Color.WHITE);
        btn1.setBackgroundColor(Color.parseColor("#D1CBCB"));
        btn1.setTextColor(Color.BLACK);
        btn2.setTextColor(Color.BLACK);
        btn2.setBackgroundColor(Color.parseColor("#D1CBCB"));
    }

}
