package com.example.interfazwhatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    TextView tvPosicion ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        String posicion = getIntent().getStringExtra("posicion") ;

        tvPosicion = findViewById(R.id.Tv_posicion) ;
        tvPosicion.setText(posicion) ;
    }
}