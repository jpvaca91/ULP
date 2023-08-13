package guia5_ejer3;

import java.util.Scanner;

public class Guia5_Ejer3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector..");
        int N = leer.nextInt();
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 20);
        }
        for (int i = 0; i < N; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("\nIngrese numero a buscar");
        int X = leer.nextInt();
        int contador = 0;
        for (int i = 0; i < N; i++) {
            if (vector[i] == X) {
                System.out.println("Se encontro en la posicion " + (i + 1));
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No se encontro el numero.");
        } else {
            System.out.println("Se repitio " + contador);
        }
    }

}
