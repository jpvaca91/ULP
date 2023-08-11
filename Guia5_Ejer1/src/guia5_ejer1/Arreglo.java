/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ejer1;

public class Arreglo {

    public static void sumarLista(int arreglo[]) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        System.out.println("La suma de los elementos es: " + suma);
    }

    public static void sumarLista2(int arreglo[]) {
        int suma = 0;
        for (int elemento : arreglo) {
            suma += elemento;
        }
        System.out.println("La 2da suma es: " + suma);
    }

    public static void buscarMayor(int arreglo[][]) {
        int mayor = 0;
        for (int[] fila : arreglo) {
            for (int elemento : fila) {
                if (mayor < elemento) {
                    mayor = elemento;
                }
            }
        }
        System.out.println("El elemento mayor es igual a: " + mayor);
    }

    public static void cuentaVocales(String cadena) {
        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("La cantidad de vocales es: " + contador);

    }

    public static void cuentaCaracter(String cadena, char caracter) {
        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if (c == caracter) {
                contador++;
            }
        }
        System.out.println("La cantidad de vocales es: " + contador);

    }

}
