package com.exampleOB.inputprintStream;

import java.io.*;
import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        //8-Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        //La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        CrearFicheroDePersonas("/home/emanuel/Desktop/practicaOB.txt", "/home/emanuel/Desktop/LaNegraBoluda.txt");
    }

    public static void CrearFicheroDePersonas(String fileIn, String fileOut) {
        try {
            InputStream ficheroEntrada = new FileInputStream(fileIn);
            try {
                //Lee el fichero de entrada y lo guarda en datos.
                byte[] datos = ficheroEntrada.readAllBytes();
                ficheroEntrada.close();

                PrintStream ficheroDeSalida = new PrintStream(fileOut);
                // copia el fichero de entrada en el fichero de salida
                ficheroDeSalida.write(datos);
                ficheroDeSalida.close();
            } catch (IOException e) {
                System.out.println("Error en la direccion del fichero.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero ha copiar no se encuentra en la ruta proporcionada.");
        }
    }
}


