package com.exampleOB;

public class MetodoReverse {
    public static void main(String[] args) {
        System.out.println(reverse("hola mundo"));
    }

    /*
    Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    */
    public static String reverse(String texto) {
        // lo puedo declarar de las dos maneras.
        String newString = "";
        for (int i = texto.length(); 1 <= i; i--) {
            newString += texto.charAt(i - 1);
        }
        return newString;
    }
}
