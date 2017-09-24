package com.bp.pruebaanimacionestransicion;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*TRANSICION ENTRE ACTIVIDADES*/
                /*Se crea el intent*/
                //Intent i = new Intent(MainActivity.this, ActivityB.class);
                /*Se inicia la nueva actividad con la transicion*/
                //startActivity(i, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());

                /*TRANSICION CON ELEMENTOS COMPARTIDOS*/
                /*Se declara el elemento compartido como vista*/
                final View elementoCompartido = findViewById(R.id.button); //En este caso es un botón
                /*Se crea el intent*/
                Intent i = new Intent(MainActivity.this,ActivityB.class);
                /*Se crea la transición*/
                ActivityOptions transicion = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this
                        ,elementoCompartido,"elemento");
                /*Se inicia la nueva actividad con la transición*/
                startActivity(i,transicion.toBundle());
            }
        });
    }
}
