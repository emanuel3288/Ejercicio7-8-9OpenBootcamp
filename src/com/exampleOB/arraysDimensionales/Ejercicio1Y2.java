package com.exampleOB.arraysDimensionales;

public class Ejercicio1Y2 {
    public static void main(String[] args) {
        //ARRAY UNIDIMENSIONAL DE STRINGS.
        MostrarElementosArrayUnidimensional(CrearArrayUnidimensionalDe5Nombres());

        //ARRAYS BIDIMENSIONALES DE ENTEROS.
        System.out.println("--------------------------PRIMER ARRAY BIDIMENSIONAL---------------------------------------");
        MostrarElementos(ArrayBidimensionalDeEnteros());
        System.out.println("--------------------------SEGUNDO ARRAY BIDIMENSIONAL--------------------------------------");
        MostrarElementos(ArrayBidimensionalDeEnteros2());
    }

    //1 -crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    public static void MostrarElementosArrayUnidimensional(String[] nombres) {
        for (String nombre : nombres) {
            System.out.println("El señor " + nombre + " estudia en OB.");
        }
    }

    public static String[] CrearArrayUnidimensionalDe5Nombres() {
        return new String[]{"Daniel", "Rene", "Ismael", "Eleonora", "Beatriz"};
    }


    //2-Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
    public static void MostrarElementos(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            // Importante.
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("En la posicion " + i + j + " se encuentra el valor " + matriz[i][j] + ".");
            }
        }
    }

    public static int[][] ArrayBidimensionalDeEnteros() {
        int[][] matriz = new int[2][3];
        //fila 1
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        // fila 2
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        return matriz;
    }

    // otra forma de definir una array bidimensional
    public static int[][] ArrayBidimensionalDeEnteros2() {
        int[][] segundaMatriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        return segundaMatriz;
    }
}
