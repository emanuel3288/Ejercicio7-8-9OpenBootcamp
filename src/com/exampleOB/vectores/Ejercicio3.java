package com.exampleOB.vectores;

import java.util.Vector;

public class Ejercicio3 {
    public static void main(String[] args) {

        //3-Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        //ARRAYLIST DE ENTEROS.
        MostarVectorEnteros(CrearVectorCon5Enteros());
        MostarVectorEnteros(EliminarDosElementosDelVector(CrearVectorCon5Enteros()));
        //ARRAYLIST DE STRINGS.
        MostrarVectorString(EliminarDosNombresDelVector(CrearUnVectorCon5Nombres()));

    }

    public static void CrearYMostrarVectorConString() {
        // defino un segundo vector del tipo string y le paso
        Vector<String> segundoVector = CrearUnVectorCon5Nombres();
        //Elimina el segundo y el 3er elemento del vector, y muestra el vector resultante por pantalla.
        EliminarDosNombresDelVector(segundoVector);
        MostrarVectorString(segundoVector);
    }

    public static void MostrarVectorString(Vector<String> segundoVector) {
        System.out.println(segundoVector);
    }

    public static Vector<String> EliminarDosNombresDelVector(Vector<String> segundoVector) {
        Vector<String> tercerVector = new Vector<>();
        for (int i = 0; i < segundoVector.size(); i++) {
            if (i >= 3) {
                tercerVector.add(segundoVector.get(i));
            }
        }
        return tercerVector;
    }

    public static Vector<String> CrearUnVectorCon5Nombres() {
        Vector<String> segundoVector = new Vector<>();
        segundoVector.add("emanuel");
        segundoVector.add("daniel");
        segundoVector.add("rene");
        segundoVector.add("roman");
        segundoVector.add("roxana");
        return segundoVector;
    }

    public static void MostarVectorEnteros(Vector<Integer> vector) {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(vector + "\n");
        System.out.println("------------------------------------------------------------------------------------------");
    }

    public static Vector<Integer> EliminarDosElementosDelVector(Vector<Integer> vector) {
        //Elimina el segundo y el 3er elemento del vector, y muestra el vector resultante por pantalla.
        for (int i = 0; i < vector.size(); i++) {
            vector.removeIf(numero -> numero % 2 == 0);
        }
        return vector;
    }

    public static Vector<Integer> CrearVectorCon5Enteros() {
        // defino vector de tipo entero y le doy valores al vector
        Vector<Integer> primerVector = new Vector<>();
        primerVector.add(1);
        primerVector.add(2);
        primerVector.add(3);
        primerVector.add(4);
        primerVector.add(5);
        return primerVector;
    }
}
