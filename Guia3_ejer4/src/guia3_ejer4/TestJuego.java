package guia3_ejer4;

import java.util.Scanner;

public class TestJuego {

    public static void main(String[] args) {

        Robot rob = new Robot("Raulito");
        Persona humano = new Persona("Director Carlos");
        Bateria batita = new Bateria("batita", 1000);
        rob.agregarBateria(batita);
        humano.adoptarRobot(rob);
        //humano.jugarConRobot();

        int op = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(" -----------------------------------");
            System.out.println("|    Que hacemos con el Robot?      |");
            System.out.println("|    1- Avanzar                     |");
            System.out.println("|    2- Retroceder                  |");
            System.out.println("|    3- Dormir                      |");
            System.out.println("|    4- Despertar                   |");
            System.out.println("|    5- Cargar Bateria              |");
            System.out.println("|    6- Info de Bateria             |");
            System.out.println("|    7- Salir                       |");
            System.out.println(" -----------------------------------");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Cuantos pasos avanza?:");
                    rob.avanzar(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Cuantos pasos retrocede?:");
                    rob.retroceder(sc.nextInt());
                    break;
                case 3:
                    rob.dormir();
                    break;
                case 4:
                    rob.despertar();
                    break;
                case 5:
                    rob.recargar();
                    break;
                case 6:
                    rob.energiaActual();
                    break;
                case 7:
                    System.err.println("Saliendo del sistema...");
                    break;
                default:
                    System.err.println("Opcion Incorrecta");
            }

            
        } while (op != 7);

    }
}
