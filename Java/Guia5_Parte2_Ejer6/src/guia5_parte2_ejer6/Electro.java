/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5_parte2_ejer6;


public class Electro extends Producto {
    
    private int consumoEnW;

    public Electro(int consumoEnW, int codigo, String descripcion, String marca, long precioLista, int stock) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.consumoEnW = consumoEnW;
    }

    public int getConsumoEnW() {
        return consumoEnW;
    }

    public void setConsumoEnW(int consumoEnW) {
        this.consumoEnW = consumoEnW;
    }

    @Override
    public long calcularPrecioPublico() {
        return (long) (precioLista*1.25);
    }
    
    
    
}

