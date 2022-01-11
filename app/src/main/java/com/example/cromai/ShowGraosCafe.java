package com.example.cromai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShowGraosCafe extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_graos_cafe);
        Intent show = getIntent();
        String[] lista = show.getStringArrayExtra("Cafe");

        ListView yourListView = (ListView) findViewById(R.id.list);


       ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,lista);

        yourListView.setAdapter(arrayAdapter);


    }





}
