/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Guia5_Extra_Ejercicio2;


public class Guia5_Extra_Ejercicio2 {

   
    public static void main(String[] args) {
        
        Registro anio =new Registro();
        
        anio.agregarDato("San Luis", "enero", new Datos("Mauro", "Perez", Math.random()*10));
        anio.agregarDato("San Luis", "febrero", new Datos("Mauro", "Perez", Math.random()*10));
       // anio.agregarDato("San Luis", "marzo", new Datos("Mauro", "Perez", Math.random()*10));
        
      //  anio.agregarDato("Merlo", "junio", new Datos("Mauro", "Perez", Math.random()*10));
        anio.agregarDato("Merlo", "julio", new Datos("Mauro", "Perez", Math.random()*10));
        anio.agregarDato("Merlo", "agosto", new Datos("Mauro", "Perez", Math.random()*10));
        anio.agregarDato("Merlo", "septiembre", new Datos("Mauro", "Perez", Math.random()*10));
        anio.agregarDato("Merlo", "octubre", new Datos("Mauro", "Perez", Math.random()*10));
        anio.agregarDato("Merlo", "noviembre", new Datos("Mauro", "Perez", Math.random()*10));
        anio.agregarDato("Merlo", "diciembre", new Datos("Mauro", "Perez", Math.random()*10));
        //anio.agregarDato("Villa Mercedez", "enero", new Datos("Mauro", "Perez", Math.random()*10));
        anio.agregarDato("Villa Mercedez", "noviembre", new Datos("Mauro", "Perez", Math.random()*10));
        anio.agregarDato("Villa Mercedez", "diciembre", new Datos("Mauro", "Perez", Math.random()*10));

        System.out.println(anio.mayorPromedio());
        System.out.println(anio.mayorPromedioLocalidad("San luis"));
        System.out.println(anio.mayorPromedioLocalidad("Merlo"));
        System.out.println(anio.mayorPromedioLocalidad("Villa Mercedez"));
        System.out.println(anio);
        
        
        
        
        
        
    }

}
