package com.example.examen01t3videoj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.examen01t3videoj.adapters.NameAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.i("MAIN_APP", "Iniciando Segunda actividad");

        /*Intent intent = getIntent();
        String value = intent.getStringExtra("value");*/

        /*TextView tv = findViewById(R.id.tvMessage);
        tv.setText(value);*/
        RecyclerView rv = findViewById(R.id.rvNames);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        List<String> datos = Arrays.asList("Usuario1","Usuario2","Usuario3","Usuario4","Usuario5","Usuario6","Usuario7","Usuario8","Usuario9","Usuario10");

        List<String> datos2 = Arrays.asList("987654321","978645312","94678154","968652652","945472252","963295855","989691141","912962252","948475232","937757147");

        NameAdapter adapter = new NameAdapter(datos2);

        rv.setAdapter(adapter);
    }
}