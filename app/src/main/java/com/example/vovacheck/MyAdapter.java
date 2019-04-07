package com.example.vovacheck;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private ArrayList<String> myList;
    private MyCallBack myCallBack;

    public MyAdapter(ArrayList<String> myList, MyCallBack myCallBack) {
        this.myList = myList;
        this.myCallBack = myCallBack;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.viewer, viewGroup, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bind(myList.get(position));
        holder.itemView.setOnClickListener(view -> myCallBack.itemClick());
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    interface MyCallBack{
        void itemClick();
    }
}
