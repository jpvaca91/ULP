/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2_parte1_ejer3;

import java.util.Scanner;

public class GuiaC {

    public static Scanner sc = new Scanner(System.in);

    public static void ejercicio12() {
        int n;
        do {
            System.out.println("Ingrese una nota entre 1 y 10");
            n = sc.nextInt();
        } while (n < 1 || n > 10);
    }

    public static void ejercicio13() {
        System.out.println("Ingrese un número positivo que sera límite");
        int x = sc.nextInt();
        int a = 0;
        do {
            System.out.println("Ingrese un número");
            int b = sc.nextInt();
            a += b;
        } while (a <= x);
    }

    public static void ejercicio14() {
        System.out.println("Ingrese dos números positivos");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char s = 'N';
        do {
            System.out.println("------------------------");
            System.out.println("|         MENÚ         |");
            System.out.println("|     1. Sumar         |");
            System.out.println("|     2. Restar        |");
            System.out.println("|     3. Multiplicar   |");
            System.out.println("|     4. Dividir       |");
            System.out.println("|     5. Salir         |");
            System.out.println("|     Elija opción     |");
            System.out.println("------------------------");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("La suma es: " + (a + b));
                    break;
                case 2:
                    System.out.println("La resta es: " + (a - b));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (a * b));
                    break;
                case 4:
                    System.out.println("La división es: " + ((double) a / (double) b));
                    break;
                case 5:
                    System.out.println("¿Está seguro que quiere salir (S/N)");
                    s = sc.next().charAt(0);
                    break;
                default:
                    System.out.println("No es una opción valida");
            }
        } while (s != 'S' && s != 's');
    }

    public static void ejercicio15() {
        int c = 1, s = 0;
        do {
            System.out.println("Ingrese el número " + c);
            int x = sc.nextInt();
            c++;
            if (x == 0) {
                System.out.println("Se capturo el cero");
                break;
            } else if (x > 0) {
                s += x;
            }
        } while (c <= 20);
        if (c == 21) {
            System.out.println("La suma de todos los números ingresados es: " + s);
        } else {
            System.out.println("La suma de los números ingresados antes del 0 es: " + s);

        }
    }

    public static void ejercicio16() {
        String f, fde = "&&&&&";
        int c = 0, i = 0;
        do {
            do {
                System.out.println("Ingrese una cadena de 5 caracteres como máximo");
                f = sc.nextLine();
            } while (f.length() > 5);
            if (f.equals(fde)) {
                break;
            }
            if (f.substring(0).equals("X") || f.substring(f.length() - 1).equals("O")) {
                c++;
            } else {
                i++;
            }
        } while (true);
        System.out.println("Las cadenas correctas fuerón: " + c);
        System.out.println("Las cadenas incorrectas fuerón: " + i);
    }

    public static void ejercicio17() {

        System.out.println("Ingrese un número para dibujar un cuadrado:");
        int nro = sc.nextInt();
        int i = 0;
        while (i < nro) {
            int j = 0;
            while (j < nro) {
                if (i == 0 || j == 0 || i == nro - 1 || j == nro - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

                j++;

            }
            System.out.println();
            i++;
        }
    }

    public static void ejercicio18() {

        int cont = 0;
        while (cont < 4) {
            System.out.println("ingrese un numero entre 1 y 20:");
            int nro = sc.nextInt();
            if (nro > 0 && nro <= 20) {
                System.out.print(nro + " ");
                for (int i = 0; i <= nro - 1; i++) {
                    System.out.print("*");
                }
                System.out.println();
                cont++;
            } else {
                System.err.println("no entendiste la consigna");
            }

        }

    }
}
