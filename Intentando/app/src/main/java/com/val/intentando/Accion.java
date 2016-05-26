package com.val.intentando;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/**
 * Clase que representa el Modelo; es decir, las acciones a llevar a cabo por nuestra aplicación.
 *
 * @author Val
 */
public class Accion {

    private final static String PREFIJO_URI_BUSCA_GOOGLE = "http://www.google.com/#q=";


    /**
     *Lanza una nueva ventana del navegador con la búsqueda del usuario introducida
     *
     * @param context La actividad donde será lanzada la búsqueda
     * @param cadena_busqueda El término de búsqueda a consultar
     */
    public static void buscarEnGoogle (Context context, String cadena_busqueda)
    {
        String url = null;
        Activity a = null;
        Intent intent = null;
        Uri uri = null;


            /*Log.d(Accion.class.getCanonicalName(), "Preparando la búsqueda");

            url = PREFIJO_URI_BUSCA_GOOGLE + cadena_busqueda;//Compongo la cadena
            uri = Uri.parse(url);//y Su URI
            intent = new Intent(Intent.ACTION_VIEW, uri); //creo el intent
            a = (Activity) context; //Subcasting (De clase Padre a hija)

            Log.d(Accion.class.getCanonicalName(), "Lanzando el intent de búsqueda");
            a.startActivity(intent);//lanzo la actividad - INTENT IMPLÍCITO (describo la acción de forma general)*/

        /*Intent i = new Intent(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_TEXT, cadena_busqueda);
        i.putExtra("Clave", cadena_busqueda);
        i.setType("text/plain");
        i.setPackage("com.whatsapp");
        context.startActivity(i);*/


        //creo un intent le meto el texto y se lo paso

        Intent intent1 = new Intent(context, Main2Activity.class);
        intent1.putExtra("NOMBRE", cadena_busqueda);
        a = (Activity) context;
        a.startActivity(intent1);







    }






}
