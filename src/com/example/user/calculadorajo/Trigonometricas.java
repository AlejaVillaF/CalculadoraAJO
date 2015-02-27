package com.example.user.calculadorajo;


public class Trigonometricas
{
    public static String seno(String cadena)
    {
        float numero = Float.parseFloat(cadena);
        String resultado = "Sen "+numero+": "+(Math.sin(numero));
        return resultado;
    }

    public static String coseno(String cadena)
    {
        float numero = Float.parseFloat(cadena);
        String resultado = "Cos "+numero+": "+(Math.cos(numero));
        return resultado;
    }

    public static String tangente (String cadena)
    {
        float numero = Float.parseFloat(cadena);
        String resultado = "Tan "+numero+": "+(Math.tan(numero));
        return resultado;
    }

    public static String raiz (String cadena)
    {
        float numero = Float.parseFloat(cadena);
        String resultado = "Raíz "+numero+": "+(Math.sqrt(numero));
        return resultado;
    }
}
