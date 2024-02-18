package com.example.interfazwhatsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MenuItem itCamara ;
    MenuItem itBusqueda ;
    MenuItem itNuevoGrupo ;
    MenuItem itNuevaDifusion ;
    MenuItem itAjustes ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itCamara =findViewById(R.id.Camara) ;

        if(getSupportActionBar() != null){
            getSupportActionBar().show() ;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.action_bar,menu) ;

        return true ;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){

        int opcion = item.getItemId() ;

        if(opcion == R.id.Camara){

            Toast.makeText(this,"Todo va bien", Toast.LENGTH_SHORT).show() ;
            return true ;
        }
        else{

            return super.onOptionsItemSelected(item) ;
        }
    }

}