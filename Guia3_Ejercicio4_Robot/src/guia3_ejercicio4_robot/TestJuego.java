/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_ejercicio4_robot;

/**
 *
 * @author MOLLO RAMIREZ
 */
public class TestJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Robot alberto=new Robot(new Bateria());
        
        Hombre jorge=new Hombre();
        
        jorge.jugarConRobot1(alberto);
        jorge.jugarConRobot2(alberto);
        
       
    }
    
}
