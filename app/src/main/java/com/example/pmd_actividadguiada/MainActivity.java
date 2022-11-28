package com.example.pmd_actividadguiada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Datos[] datos = new Datos[]{
                new Datos("Linea sup 1", "Linea inf 1"),
                new Datos("Linea sup 2", "Linea inf 2"),
                new Datos("Linea sup 3", "Linea inf 3"),
                new Datos("Linea sup 4", "Linea inf 4"),
                new Datos("Linea sup 5", "Linea inf 5"),
                new Datos("Linea sup 6", "Linea inf 6"),
                new Datos("Linea sup 7", "Linea inf 7"),
        };

        ListView listado = (ListView) findViewById(R.id.miLista);
        Adaptador miAdaptador = new Adaptador(this,datos);
        listado.setAdapter(miAdaptador);
        View miCabecera = getLayoutInflater().inflate(R.layout.cabecera, null);
        listado.addHeaderView(miCabecera);

        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adaptador, View view, int position, long l) {
                String seleccionado = ((Datos) adaptador.getItemAtPosition(position)).getTexto1();
                Toast.makeText(MainActivity.this,seleccionado,Toast.LENGTH_LONG).show();
            }
        });


    }
}