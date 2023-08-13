package guia3_ejercicio4_robot;

import java.nio.charset.Charset;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.constants.SyntaxProperties;


public class Hombre {

    
    
    

    public void jugarConRobot1(Robot robot) {
        
        robot.avanzar(500);
        robot.retroceder(20);
        System.out.println("Mostrando bateria actual...");
        robot.bateriaActual();
        System.out.println("");
        robot.dormir();
    }

    public void jugarConRobot2(Robot robot) {
        Scanner leer=new Scanner(System.in);
        System.out.println("");
        System.out.println("\033[44;37m" + " AHORA PODRAS JUGAR LIBREMENTE CON TU ROBOT!!! " + "\033[0m");
        
        
        int op=0;

        do {
            System.out.println("\n"+"\033[34m"+"MENU DE JUEGO"+"\033[0m");
            System.out.println("1-AVANZAR" + "\n2-RETROCEDER" + "\n3-DORMIR" + "\n4-DESPERTAR" + "\n5-CARGAR BATERIA" + "\n6-BATERIA ACTUAL" + "\n7-SALIR DEL MENU");
            System.out.println("");
            System.out.print("\033[34m" + "OPCION -> " + "\033[0m");
            op=leer.nextInt();
            
            
            
            
            switch(op){
                case 1:
                    
                    if (robot.dormido==false) {
                        System.out.print("Cuantos pasos desea avanzar? -> ");
                    int av=leer.nextInt();
                    robot.avanzar(av);
                    
                    }else{
                        robot.dormir();
                        System.out.println("DESPIERTALO PARA JUGAR!!!");
                    }
                    break;
                    
                case 2:
                    
                    if (robot.dormido==false) {
                       System.out.print("Cuantos pasos desea retroceder? -> ");
                    int ret=leer.nextInt();
                    robot.retroceder(ret); 
                    
                    }else{
                        robot.dormir();
                        System.out.println("DESPIERTALO PARA JUGAR!!!");
                    }
                    break;
                    
                case 3:
                    robot.dormir();
                    break;
            
                case 4:
                    robot.despertar();
                    break;
            
                case 5:
                    robot.recargar();
                    System.out.println("\033[32m" + "AHORA LA BATERIA ESTÁ LLENA" + "\033[0m");
                    break;
                    
                case 6:
                    robot.bateriaActual();
                    
                    break;
                    
                case 7:
                    System.out.println("GRACIAS POR JUGAR. Saliendo del sistema.....");
            
            }

            
         } while (op!=7);
        
    }
}
