/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidades.Producto;
import entidades.Cliente;
import entidades.Vendedor;

/**
 *
 * @author enzob
 */
public class TestComercio {
    public static void main(String[] args) {
        Producto p1=new Producto("Yogur", "lacteo", 20, 310.99);
        Producto p2=new Producto("Lavandina", "limpieza", 10, 350.99);
        Producto p3=new Producto("Pan", "panificacion", 5, 200);
        
        Cliente c1 = new Cliente ("Juan", "San Luis");
        
        Vendedor v1= new Vendedor("Andres");
        Venta s1=new Venta(c1, v1, p1, p2, p3);
        System.out.println("El precio total es: " +s1.calcularTotal());
        
        
        
        


    }
    
}
