package com.example.cromai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TiposGraosCafe extends AppCompatActivity {

    Button btnMostra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_graos_cafe);
        btnMostra = findViewById(R.id.btnMostar);


        String[] lista = new String[]{
                "Café Arábica",
                "Café Bourbon",
                "Café Kona",
                "Café Catuaí",
                "Café Acaiá",
                "Café Robusta",
                "Café Geisha"
        };
        btnMostra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent nextScreen = new Intent (TiposGraosCafe.this, ShowGraosCafe.class);
                nextScreen.putExtra("Cafe", lista);
                startActivity(nextScreen);
            }
        });
    }

}