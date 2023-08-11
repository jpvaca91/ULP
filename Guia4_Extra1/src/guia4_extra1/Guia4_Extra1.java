/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_extra1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author MOLLO RAMIREZ
 */
public class Guia4_Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Barco velero1=new Velero(5, "VLR315", 15.5, "2012-12-23");
        Barco barco1=new BarcoAMotor(45, "BAM418",20, "2001-03-15");
        Barco yate1=new Yate(50,8, "YTE798", 25.5, "2015-11-10");
        
        Barco barcoBase=new Barco("BCO654", 18.5, "1994-03-22");
        
        
        
        Alquiler amarre=new Alquiler("Jorge Schwarzzenneger", 12856789, "2022-08-23", "2022-12-23", 4, velero1);
        
        
        System.out.println("MODULO: " + velero1.calcularModulo());
    
        System.out.println("DIAS ALQUILADO: " + amarre.diasAlquiler());
        
        System.out.println("PRECIO ALQUILER: " + amarre.calcularPrecio(amarre.getBarcoAmarrado()));
        
        
        
        
        
        
    }
    
}
