package com.exampleOB.vectores;

import java.util.Vector;

public class Ejercicio4 {
    public static void main(String[] args) {

        /*4-Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
         El problema es que el vector es un array que tiene una capacidad límite de elementos,
         una vez superada esta capacidad se copian los elementos en un array que tiene el doble de capacidad que el primero.
         Esta operación puede ser muy costosa para la aplicación, ya que ésta utiliza memoria para crear el nuevo array que
         ralentizará la ejecución de la misma.
         */
        //defino vector de tipo entero y le doy valores al vector
        CrearVectorDe1000Elementos();
    }

    public static void CrearVectorDe1000Elementos() {
        Vector<Integer> tercerVector = new Vector<>();
        for (int i = 0; i <= 1000; i++) {
            tercerVector.add(i);
        }
        System.out.println(tercerVector);
        System.out.println("La capacidad del vector es " + tercerVector.capacity());
        System.out.println("Sobran " + (tercerVector.capacity() - tercerVector.size()) + " espacios.");
    }
}
