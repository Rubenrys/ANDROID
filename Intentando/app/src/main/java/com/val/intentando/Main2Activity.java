package com.val.intentando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //TODO: recupero el texto que me han pasado por el intent y lo muestro en la caja

    String cadena_busqueda = getIntent().getStringExtra("NOMBRE");
        Log.d(getClass().getCanonicalName(), "se ha pasado " + cadena_busqueda);

    //lo meto en la cajita

    View v = findViewById(R.id.cajaEstilos);
        EditText cajatexto = (EditText) v;
        cajatexto.setText(cadena_busqueda);

    }
}
