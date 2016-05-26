package com.val.inflando;

/**
 * Created by vale on 11/05/16.
 */
public class StringUtil {

    public static String mensajeSalida(String nombre) {
        String mensaje = null;

        mensaje = "El nombre tiene " + nombre.length() + " letras";

        return mensaje;
    }

    public static String mensajeAlReves(String nombre) {
        String mensaje = "";

        int n = nombre.length();

        while (n > 0) {

            mensaje = mensaje + nombre.charAt(n - 1);
            n--;
        }

        return mensaje;

    }




}





