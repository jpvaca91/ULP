/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5_parte2_ejer6;


public class Ropa extends Producto {
    
    private char tipoDeTela;

    public Ropa(char tipoDeTela, int codigo, String descripcion, String marca, long precioLista, int stock) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.tipoDeTela = tipoDeTela;
    }

    public char getTipoDeTela() {
        return tipoDeTela;
    }

    public void setTipoDeTela(char tipoDeTela) {
        this.tipoDeTela = tipoDeTela;
    }

    @Override
    public long calcularPrecioPublico() {
        return (long) (precioLista*1.40);
    }

    @Override
    public String toString() {
        return super.toString()+ "Ropa{" + "tipoDeTela=" + tipoDeTela + '}';
    }

        
}
