package com.val.inflando;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class EscuchaBoton extends Activity implements View.OnClickListener{


    private Context ct;




    public EscuchaBoton (Context context)
    {
        this.ct = context;
    }

    @Override
    public void onClick(View v) {

        if(v.getId() ==R.id.button) {

            //CAPTURO el mensaje introducido
            Log.d(getClass().getCanonicalName(), "Ha tocado el botón");

            Activity a = (Activity) ct;

            EditText editText = (EditText) a.findViewById(R.id.editText);

            String nombre = editText.getText().toString();

            Log.d(getClass().getCanonicalName(), "Ha introducido el nombre = " + nombre);

            //Fin de la captur

            String mensaje = StringUtil.mensajeAlReves(nombre);


            //Llamada a la funcionalidad que realiza


            //Mostrar Resultado

            ViewGroup caja_resultado = (ViewGroup) a.findViewById(R.id.resultado);

            if (caja_resultado.getChildCount() > 0) //la lista ya ha sido inflada if (a.findViewById(r.id.mensaje_salida=null!)
            {
                TextView text = (TextView) a.findViewById(R.id.mensaje_salida);
                text.setText(mensaje);

            } else  {


                LayoutInflater layoutInflater = a.getLayoutInflater(); //o LayoutInflater.from(a)
                View vista_inflada = layoutInflater.inflate(R.layout.mensaje_salida, caja_resultado);
                TextView text = (TextView) vista_inflada.findViewById(R.id.mensaje_salida);
                text.setText(mensaje);
                this.finish();

            }

            //Fin de monstrar resultado

            mostrarLayout(a.findViewById(R.id.principal_layout));


        } else {
            
        Log.d(getClass().getCanonicalName(), "Ha tocado el Salir");




        }



    }

    private void mostrarLayout(View vista)
    {
        Log.d(getClass().getCanonicalName(), vista.getClass().getCanonicalName());

        if (vista instanceof ViewGroup)
        {
            ViewGroup viewGroup = (ViewGroup) vista;

            for (int i = 0; i<viewGroup.getChildCount(); i++)
            {
                View vistahija = viewGroup.getChildAt(i);
                mostrarLayout(vistahija);

            }
        }
    }

    private void kill_activity()
    {

        finish();
    }


}
