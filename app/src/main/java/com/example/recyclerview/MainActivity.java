package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.adaptors.PhotoAdaptor;
import com.example.recyclerview.models.photosModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        ArrayList <photosModel> list = new ArrayList<>();

        list.add(new photosModel(R.drawable.a));
        list.add(new photosModel(R.drawable.b));
        list.add(new photosModel(R.drawable.c));
        list.add(new photosModel(R.drawable.d));
        list.add(new photosModel(R.drawable.e));
        list.add(new photosModel(R.drawable.f));
        list.add(new photosModel(R.drawable.g));
        list.add(new photosModel(R.drawable.h));
        list.add(new photosModel(R.drawable.i));

        PhotoAdaptor adaptor = new PhotoAdaptor(list,this);
        recyclerView.setAdapter(adaptor);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


    }
}