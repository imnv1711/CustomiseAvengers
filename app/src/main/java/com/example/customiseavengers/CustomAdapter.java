package com.example.customiseavengers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Avengers> {
    Context cont;
    int design;
    ArrayList<Avengers> list;

    CustomAdapter(Context cont, int design, ArrayList<Avengers> list){
        super(cont,design,list);
        this.cont=cont;
        this.design=design;
        this.list=list;
    }

    @Override
    public View getView(final int position, View convetView, ViewGroup parent)
    {
        LayoutInflater inflater = LayoutInflater.from(cont);
        View view = inflater.inflate(design,null,false);

        ImageView iv = view.findViewById(R.id.iv);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvWeapon = view.findViewById(R.id.tvWeapon);
        Button btDel = view.findViewById(R.id.btDel);

        Avengers av = list.get(position);
        // fetch record at given position in list

        tvName.setText(av.getName());
        tvWeapon.setText(av.getWeapon());
        iv.setImageDrawable(cont.getResources().getDrawable(av.getPicture()));


        return view;
    }
}
