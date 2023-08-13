/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidades.Cliente;
import entidades.Producto;
import entidades.Vendedor;

/**
 *
 * @author enzob
 */
public class Venta {
    private Cliente cliente;
    private Vendedor vendedor;
    private Producto producto1,producto2,producto3;

    public Venta(Cliente cliente, Vendedor vendedor, Producto producto1, Producto producto2, Producto producto3) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.producto3 = producto3;
    }
    
    
    
    public double calcularTotal(){
        double total=producto1.calcularPrecioPublico()
                +producto2.calcularPrecioPublico() 
                +producto3.calcularPrecioPublico();
        if (cliente.getProvincia().equalsIgnoreCase("San Luis")) {
            return total*0.9;
            
        }else{
            return total*0.85;
            
        }
        
    }
    
   
}
