package com.example.interfazwhatsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
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

    Intent nuevaVentana ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itCamara =findViewById(R.id.Camara) ;
        itBusqueda =findViewById(R.id.Busqueda) ;
        itNuevoGrupo =findViewById(R.id.NuevoGrupo) ;
        itNuevaDifusion =findViewById(R.id.NuevaDifusion) ;
        itAjustes =findViewById(R.id.Ajustes) ;

        nuevaVentana = new Intent (MainActivity.this, SecActivity.class) ;

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

            nuevaVentana.putExtra("posicion", "Estás en el módulo de cámara") ;
            startActivity(nuevaVentana) ;
            return true ;

        }
        else if (opcion == R.id.Busqueda) {

            nuevaVentana.putExtra("posicion", "Estás en la pantalla de búsqueda") ;
            startActivity(nuevaVentana) ;
            return true ;
        }
        else if (opcion == R.id.NuevoGrupo) {

            nuevaVentana.putExtra("posicion", "Estás en la pantalla para crear un nuevo grupo") ;
            startActivity(nuevaVentana) ;
            return true ;
        }
        else if (opcion == R.id.NuevaDifusion) {

            nuevaVentana.putExtra("posicion", "Estás en en la pantalla de difusión") ;
            startActivity(nuevaVentana) ;
            return true ;
        }
        else if (opcion == R.id.Ajustes) {

            nuevaVentana.putExtra("posicion", "Estás en la pantalla de ajustes") ;
            startActivity(nuevaVentana) ;
            return true ;
        }
        else {

            return super.onOptionsItemSelected(item) ;
        }
    }

}