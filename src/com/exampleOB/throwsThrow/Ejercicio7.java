package com.exampleOB.throwsThrow;

import java.io.IOException;

public class Ejercicio7 {
    public static void main(String[] args) {
        try {
            DividePorCero(5, 0);
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de codigo.");
        }
    }

    public static void DividePorCero(Integer numeroA, Integer numeroB) throws Exception {
        try {
            int total = numeroA / numeroB;
            System.out.println(total);
        } catch (ArithmeticException e) {
            System.out.println("Hay un error");
            // lanzo una IoException, es decir, que cuando se utilice la funcion dividir siempre va a necesitar un
            // try catch con una IOException.
            throw new IOException();
        }
    }
}
