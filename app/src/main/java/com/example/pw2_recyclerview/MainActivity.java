package com.example.pw2_recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        ArrayList<Groups> listGroups = new ArrayList<>();
        listGroups.add(new Groups("Джорно", R.drawable.jorno, "главный герой ДжоДжо 5 сезон")); // Используйте идентификаторы ресурсов
        listGroups.add(new Groups("Джотаро", R.drawable.jotaro, "главный герой ДжоДжо 3 сезон"));
        listGroups.add(new Groups("Джолин", R.drawable.jolin, "главный герой ДжоДжо 6 сезон"));
        listGroups.add(new Groups("Какёин", R.drawable.kakein, "друг Джотаро"));
        listGroups.add(new Groups("Наруто", R.drawable.naruto, "новый крутой хокаге"));
        listGroups.add(new Groups("Слава КПСС", R.drawable.slava, "андерграунд рэпер"));
        listGroups.add(new Groups("Путин", R.drawable.put, "СЛАВА РОССИИ"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerAdapter(this, listGroups));
    }
}