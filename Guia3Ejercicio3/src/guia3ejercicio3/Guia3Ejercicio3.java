package guia3ejercicio3;

import java.util.Scanner;

public class Guia3Ejercicio3 {

    public static void main(String[] args) {

        Auto Ferrari = new Auto("Rojo", "FGH 536");

        Rueda rue1 = new Rueda("Michelin", 28.0);
        Rueda rue2 = new Rueda("Pirelli", 28.0);
        Rueda rue3 = new Rueda("Bridgestone", 28.0);
        Rueda rue4 = new Rueda("Goodyear", 28.0);

        Scanner sc = new Scanner(System.in);
        sc.reset();
        int op = 0;

        do {
            System.out.println("*--------------------------------------------*");
            System.out.println("|        Elija una de las opciones:          |");
            System.out.println("|          1 - Avanzar                       |");
            System.out.println("|          2 - Retroceder                    |");
            System.out.println("|          3 - LLenar tanque                 |");
            System.out.println("|          4 - Inflar                        |");
            System.out.println("|          5 - Pinchar                       |");
            System.out.println("|          6 - Desinflar                     |");
            System.out.println("|          7 - Mostrar presión de las Ruedas |");
            System.out.println("|          8 - Salir                         |");
            System.out.println("*--------------------------------------------*");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    Ferrari.avanzar();
                    break;
                case 2:
                    Ferrari.retroceder();
                    break;
                case 3:
                    Ferrari.LlenarTanque();
                    break;
                case 4:
                    System.out.print("Que rueda quieres inflar? 1 - 2 - 3 - 4: ");
                    int opcionRueda = sc.nextInt();
                    sc.reset();
                    switch (opcionRueda) {
                        case 1:
                            rue1.Inflar();
                            break;
                        case 2:
                            rue2.Inflar();
                            break;
                        case 3:
                            rue3.Inflar();
                            break;
                        case 4:
                            rue4.Inflar();
                            break;
                        default:
                            System.err.println("Opción incorrecta");
                    }
                    break;
                case 5:
                    System.out.print("Que rueda quieres pinchar? 1 - 2 - 3 - 4: ");
                    int opcionRuedaPin = sc.nextInt();
                    sc.reset();
                    switch (opcionRuedaPin) {
                        case 1:
                            rue1.Pinchar();
                            break;
                        case 2:
                            rue2.Pinchar();
                            break;
                        case 3:
                            rue3.Pinchar();
                            break;
                        case 4:
                            rue4.Pinchar();
                            break;
                        default:
                            System.err.println("Opción incorrecta");
                    }
                    break;
                case 6:
                    System.out.print("Que rueda quieres desinflar? 1 - 2 - 3 - 4: ");
                    int opcionRuedaDes = sc.nextInt();
                    sc.reset();
                    switch (opcionRuedaDes) {
                        case 1:
                            rue1.desinflarRueda();
                            break;
                        case 2:
                            rue2.desinflarRueda();
                            break;
                        case 3:
                            rue3.desinflarRueda();
                            break;
                        case 4:
                            rue4.desinflarRueda();
                            break;
                        default:
                            System.err.println("Opción incorrecta");
                    }
                    break;
                case 7:
                    System.err.println("Mostrando el estado de las 4 Ruedas: ");
                    System.out.println("La rueda " + rue1.getMarca() + " tiene " + rue1.getPresion() + " PSI");
                    System.out.println("La rueda " + rue2.getMarca() + " tiene " + rue2.getPresion() + " PSI");
                    System.out.println("La rueda " + rue3.getMarca() + " tiene " + rue3.getPresion() + " PSI");
                    System.out.println("La rueda " + rue4.getMarca() + " tiene " + rue4.getPresion() + " PSI");
                    break;
                case 8:
                    System.err.println("Saliendo del sistema.. ");
                    break;

                default:
                    System.err.println("Opción incorrecta");
                    break;
            }
        } while (op != 8);
    }
}
