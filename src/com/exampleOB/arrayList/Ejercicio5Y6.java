package com.exampleOB.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio5Y6 {
    public static void main(String[] args) {
        CopiarNombresDeArrayListALinkedList();
        ArraySinLosNumerosPares();
    }

    //5-Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
    public static void CopiarNombresDeArrayListALinkedList() {
        ArrayList<String> nombres = new ArrayList<>();
        Agregar4StringsAlArray(nombres);
        MostarLosNombresDelArray(nombres);
        MostrarElementosCopiadosEnLaLinkedList(nombres);
    }

    public static void MostrarElementosCopiadosEnLaLinkedList(ArrayList<String> nombres) {
        System.out.println("----------------------------------LinkedList----------------------------------------------");
        LinkedList<String> linkedNombres = new LinkedList<>(nombres);
        for (String nombre : linkedNombres) {
            System.out.println(nombre);
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }

    public static void MostarLosNombresDelArray(ArrayList<String> nombres) {
        System.out.println("----------------------------------ArrayList-----------------------------------------------");
        for (String nombre : nombres) {
            System.out.println("El siguiente nombre del ArrayList es " + nombre);
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }

    public static ArrayList<String> Agregar4StringsAlArray(ArrayList<String> nombres) {
        nombres.add("Emanuel");
        nombres.add("Jose");
        nombres.add("Constanza");
        nombres.add("Natalia");
        return nombres;
    }


    /*
      6-Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación
       , con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra
       el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas
       el primer "for" de relleno.
      */
    public static void ArraySinLosNumerosPares() {
        MostrarArray(EliminarNumerosPares(CrearArrayDel1Al10()));
    }

    public static void MostrarArray(ArrayList<Integer> numeros) {
        System.out.println(numeros);
    }

    public static ArrayList<Integer> EliminarNumerosPares(ArrayList<Integer> listaDeNumeros) {
        // hago una copia de la lista original.
        for (int i = 0; i <= listaDeNumeros.size() + 1; i++) {
            // remueve si los numeros son pares.
            listaDeNumeros.removeIf(numero -> numero % 2 == 0);
        }
        return listaDeNumeros;
    }

    public static ArrayList<Integer> CrearArrayDel1Al10() {
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listaDeNumeros.add(i);
        }
        return listaDeNumeros;
    }
}

