/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia4extra1;

import java.time.LocalDate;

/**
 *
 * @author andre
 */
public class Guia4Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Velero c = new Velero(2, "ABC123", 6, 1997);
        
        AMotor b = new AMotor(4, "BBB223", 6, 2005);
        
        Yate yatecito= new Yate(3, 3, "AAA333", 10, 1998);
        
        Alquiler alq = new Alquiler("Alberto A", 12585554, "2023-05-10", "2023-05-15", 3, yatecito);
        
        
        alq.calculoAlquiler();
    }
    
}
