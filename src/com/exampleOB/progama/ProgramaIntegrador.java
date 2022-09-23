package com.exampleOB.progama;
import java.io.*;
import java.util.*;

public class ProgramaIntegrador {
    public static void main(String[] args) {
        CrearFicheroDePersonas(CrearArrayDePersonas("33.787.124", "emanuel carballal"));
    }

    public static void CrearFicheroDePersonas(Map<String,String> personas){
            try {
                PrintStream printStream = new PrintStream("destino2.txt");
                for (Map.Entry<String,String> conjunto: personas.entrySet()){
                    printStream.write(conjunto.toString().getBytes());
                }
                printStream.close();
            }catch (IOException e) {
                System.out.println("Error");
            }
    }

    public static Map<String,String>CrearArrayDePersonas(String nroDeDocumento, String nombreYApellido) {
        Map<String, String> personas = new HashMap<>();

        ArrayList<String> documentos = new ArrayList<>();
        documentos.add("25.150.490");
        documentos.add("40.170.390");
        documentos.add("13.420.890");
        documentos.add(nroDeDocumento);

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ramón Gimenez");
        nombres.add("Carlos Dandrea");
        nombres.add("Romina Tolosa");
        nombres.add(nombreYApellido);

        AgregarPersonas(personas, documentos, nombres);
        System.out.println(personas);
        return personas;
    }

    public static void AgregarPersonas(Map<String, String> personas, ArrayList<String> documentos, ArrayList<String> nombres) {
        for (int i = 0; i < documentos.size(); i++) {
            for (int j = 0; j < nombres.size(); j++) {
                if (i == j) {
                    personas.put(documentos.get(i), nombres.get(j));
                }
            }
        }
    }
}
