package com.example.vovacheck;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView tvBook;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        tvBook = itemView.findViewById(R.id.textView);
    }

    public void bind(String name) {
        tvBook.setText(name);
    }
}
