package com.example.adityacomputers.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ADITYA COMPUTERS on 8/29/2018.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    ArrayList<String> arraylist;
    public MyAdapter(ArrayList<String> arrayList) {
        this.arraylist=arrayList;
    }
//method to create the viewholder for each item
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        ViewHolder viewholder=new ViewHolder(view);
        return new ViewHolder(view);
    }

    //method to bind the data
    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {

        holder.textview.setText(arraylist.get(position));
    }

    //method to return the arraylist size
    @Override
    public int getItemCount() {
        return arraylist.size();
    }

    //class for viewholder
    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textview;
        public ViewHolder(View itemView) {
            super(itemView);
            textview=(TextView)itemView.findViewById(R.id.tvversion);
        }
    }
}
