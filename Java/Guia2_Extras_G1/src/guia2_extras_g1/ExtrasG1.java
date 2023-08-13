
package guia2_extras_g1;

import java.util.Scanner;

public class ExtrasG1 {

    static Scanner sc = new Scanner(System.in);

    public static void ejercicio1() {
        System.out.println("Ingrese los minutos:");
        int min = sc.nextInt();

        int horas = ((min % 1440) / 60);
        int dias = min / 1440;
        int m = min - dias * 1440 - horas * 60;

        System.out.println("tus minutos son, " + dias + " días, " + horas + " horas, " + m + " minutos");
    }

    public static void ejercicio2() {
        System.out.println("Ingrese el valor de A");
        int A = sc.nextInt();
        System.out.println("Ingrese el valor de B");
        int B = sc.nextInt();
        System.out.println("Ingrese el valor de C");
        int C = sc.nextInt();
        System.out.println("Ingrese el valor de D");
        int D = sc.nextInt();
        int aux;

        System.out.println("Valores iniciales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("Valores finales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);
    }

    public static void ejercicio3() {
        System.out.println("ingrese una letra");
        char voc = sc.next().charAt(0);
        voc = Character.toLowerCase(voc);
        if (voc == 'a' || voc == 'e' || voc == 'i' || voc == 'o' || voc == 'u') {
            System.out.println("la letra ingresada es una vocal");
        } else {
            System.out.println("la letra ingresada no es una vocal");
        }

    }

    public static void ejercicio4() {
        System.out.println("Ingrese un numero entre 1 y 10");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("En Número romano es: I");
                break;
            case 2:
                System.out.println("En Número romano es: II");
            case 3:
                System.out.println("En Número romano es: III");
                break;
            case 4:
                System.out.println("En Número romano es: IV");
                break;
            case 5:
                System.out.println("En Número romano es: V");
                break;
            case 6:
                System.out.println("En Número romano es: VI");
                break;
            case 7:
                System.out.println("En Número romano es: VII");
                break;
            case 8:
                System.out.println("En Número romano es: VIII");
                break;
            case 9:
                System.out.println("En Número romano es: IX");
                break;
            case 20:
                System.out.println("En Número romano es: X");
                break;
            default:
                System.out.println("No entendiste la consigna");
                break;
        }

    }

    public static void ejercicio5() {

        System.out.println("Ingrese una clase de Socio (A, B o C):");
        char clase = sc.next().charAt(0);
        clase = Character.toUpperCase(clase);
        System.out.println("Ingrese el costo del tratamiento");
        int costo = sc.nextInt();

        switch (clase) {
            case 'A':
                System.out.println("El costo a abonar es: " + costo * 0.5);
                break;
            case 'B':
                System.out.println("El costo a abonar es: " + costo * 0.65);
                break;
            case 'C':
                System.out.println("El costo a abonar es: " + costo);
                break;
            default:
                System.out.println("La clase ingresada no es correcta");
                break;
        }

    }

    public static void ejercicio6() {

        System.out.println("ingrese cantidad de personas");
        int cant = sc.nextInt();
        int cont = 0;
        int menores = 0;
        double menorDe = 0;
        double gral = 0;

        while (cont < cant) {
            System.out.println("ingrese la altura");
            double altura = sc.nextDouble();
            if (altura < 1.60) {

                menores = menores + 1;
                menorDe = menorDe + altura;
            }

            gral = gral + altura;
            cont++;
        }

        System.out.println("el promedio menor a 1.60 es de: " + (menorDe / menores));
        System.out.println("el promedio total de alturas es de: " + (gral / cont));
    }

    public static void ejercicio7() {

        int cont = 0;
        double acumulador = 0.0;
        int mayor = 0;
        int N;
        int menor = 0;

        System.out.println("ingrese cantidad de numeros");

        N = sc.nextInt();

        /*while (cont < N) {

            System.out.println("ingrese nro " + (cont + 1));
            int nro = sc.nextInt();

            if (cont == 0) {

                menor = nro;
            }

            if (nro > mayor) {

                mayor = nro;
            } else if (nro < menor) {

                menor = nro;
            }

            acumulador = acumulador + nro;
            cont++;
        }

        System.out.println("mayor: " + mayor + " menor: " + menor + " promedio: " + (acumulador / cont));*/
        do {
            System.out.println("ingrese nro " + (cont + 1));
            int nro = sc.nextInt();

            if (cont == 0) {

                menor = nro;
            }

            if (nro > mayor) {

                mayor = nro;
            } else if (nro < menor) {

                menor = nro;
            }

            acumulador = acumulador + nro;
            cont++;
        } while (cont < N);

        double promedio = acumulador / cont;

        System.out.println("mayor: " + mayor + " menor: " + menor + " promedio: " + promedio);

    }

    public static void ejercicio8() {

        int contPar = 0;
        int contImpar = 0;
        int n = 0;
        do {
            System.out.println("Ingrese un numero entero positivo");
            n = sc.nextInt();

            if (n < 0) {
                System.err.println("Numero incorrecto");
            } else {

                if (n % 5 == 0) {
                    break;
                } else if (n % 2 == 0) {
                    contPar++;

                } else if (n % 2 != 0) {
                    contImpar++;
                }
            }
        } while (n % 5 != 0);

        System.out.println("La cantidad de numeros ingresados fueron: " + (contPar + contImpar));
        System.out.println("La cantidad de pares: " + contPar);
        System.out.println("La cantidad de impares: " + contImpar);

    }

    public static void ejercicio9() {

        System.out.print("Ingrese un dividendo:");
        int dividendo = sc.nextInt();
        System.out.print("Ingrese un divisor:");
        int divisor = sc.nextInt();

        int resultado = 0;
        int resto = 0;
        int aux = 0;

        while (dividendo > divisor) {
            resto = dividendo - divisor;
            dividendo = resto;
            resultado++;

        }
        System.out.println("El resultado es " + resultado + ", el resto es: " + resto);

    }

    public static void ejercicio10() {

        int secreto = ((int) (Math.random() * 10)) * ((int) (Math.random() * 10));

        //System.out.println(secreto);
        int rta = 0;
        do {
            System.out.println("Adivine la respuesta de la multiplicacion entre dos numeros Randoms");
            rta = sc.nextInt();
            if (rta == secreto) {
                System.out.println("Respuesta correcta!");
                break;
            } else if (rta > secreto) {
                System.out.println("Casi: te pasaste");

            } else {
                System.out.println("Casi: mas arriba wacho");
            }

        } while (rta != secreto);

    }

    public static void ejercicio11() {
        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();
        int cont=0;
        
        do {
            n=n/10;
            cont++;
        } while (n!=0);
              
        System.out.println("La cantidad de digitos son: " +cont);
    }

    public static void ejercicio12() {
//        for (int i = 0; i < 1000; i++) {
//
//            int centena = i / 100;
//            int decena = (i / 10) % 10;
//            int unidad = i % 10;
//
//            String cambio = String.format("%d - %d - %d", centena, decena, unidad);
//            cambio = cambio.replace("3", "E");
//
//            System.out.println(cambio);
//        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {

                    if (i == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(i);
                    }
                    System.out.print("-");

                    if (j == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(j);
                    }
                    System.out.print("-");

                    if (k == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(k);
                    }

                    System.out.println();
                }

            }

        }
    }

    public static void ejercicio13() {

        System.out.print("Ingrese el alto de la escalera:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);

            }
            System.out.println();
        }

    }

}
