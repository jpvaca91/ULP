package guia2_parte1_ejer1;

import java.util.Scanner;

public class GuiaA {

    public static Scanner sc = new Scanner(System.in);

    public static void ejercicio01() {

        System.out.println("ingrese 2 numeros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("La sumatoria es: " + (a + b));
    }

    public static void ejercicio02() {

        System.out.println("Ingresa tu nombre");

        String n = sc.nextLine();
        sc.nextLine();
        System.out.println("Tu nombre es: " + n);

    }

    public static void ejercicio03() {

        System.out.println("Ingrese una frase");
        String f = sc.nextLine();
        System.out.println("La frase en mayúscula: " + f.toUpperCase() + "\nLa frase en minuscula: " + f.toLowerCase());
     
    }

    public static void ejercicio04() {
        System.out.println("Ingrese la temperatura en grados centigrados");
        double c = sc.nextDouble();
        System.out.println("La temperatura en Farenheit es: " + (32 + (9 * c / 5)));
    }

    public static void ejercicio05(){
        System.out.println("Ingrese un número");
        int x = sc.nextInt();
        System.out.println("El doble del número es: "+(x*2)+"\nEl triple del número es: "+(x*3)+"\nLa raíz es: "+(Math.sqrt(x)));
    }
}
