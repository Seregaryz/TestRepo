package com.example.vovacheck;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyAdapter.MyCallBack {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView myRecyclerView = findViewById(R.id.RecyclerView);
        RecyclerView.LayoutManager myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);
        RecyclerView.Adapter myAdapter = new MyAdapter(getMyList(), this);
        myRecyclerView.setAdapter(myAdapter);
    }

    public ArrayList<String> getMyList() {
        ArrayList<String> st = new ArrayList<>();
        st.add("Spartak");
        st.add("Zenit");
        st.add("Rubin");
        st.add("Krasnodar");
        st.add("Vadim pidr");
        st.add("Spartak");
        st.add("Zenit");
        st.add("Rubin");
        st.add("Krasnodar");
        st.add("Vadim pidr ");
        st.add("Spartak");
        st.add("Zenit");
        st.add("Rubin");
        st.add("Krasnodar");
        st.add("Vadim pidr");
        st.add("Spartak");
        st.add("Zenit");
        st.add("Rubin");
        st.add("Krasnodar");
        st.add("Vadim pidr");
        st.add("Spartak");
        st.add("Zenit");
        st.add("Rubin");
        st.add("Krasnodar");
        st.add("Vadim pidr");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        st.add("Сабина солнышко");
        return st;
    }


    @Override
    public void itemClick()  {
        Toast.makeText(this, "blalbla", Toast.LENGTH_SHORT).show();
    }

}
