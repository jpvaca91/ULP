package guia2_parte1_ejer2;

import java.util.Scanner;

public class GuiaB {

    private static Scanner sc = new Scanner(System.in);

    public static void ejercicio06(int a, int b) {
        System.out.println("Los numeros son: "+a+" y "+b);
        System.out.println("El mayor es: " + (Math.max(a, b)));
    }

    public static void ejercicio07(int a) {
        if (a % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
       
    }

    public static void ejercicio08() {
        System.out.println("Ingrese una frase");
        String f = sc.nextLine();
        if (f.equals("eureka")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

    public static void ejercicio09() {
        String f;
        do {
            System.out.println("Ingrese una frase o palabra de 8 caracteres de largo");
            f = sc.nextLine();
            if (f.length() == 8) {
                System.out.println("CORRECTO");
            } else {
                System.out.println("INCORRECTO");
            }
        } while (f.length() == 8);

    }

    public static void ejercicio10() {
        System.out.println("Ingrese una frase o palabra");
        String f = sc.nextLine();
        f = f.toUpperCase();
        if (f.charAt(0) != 'A') {
            System.out.println("INCORRECTO");
        } else {
            System.out.println("CORRECTO");
        }
    }

    public static void ejercicio11() {
        System.out.println("Ingrese el número de motor");
        int tipoMotor = sc.nextInt();
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
    }

}
