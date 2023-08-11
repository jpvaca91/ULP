/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5_parte2_ejer6;


public class Perfume extends Producto {

    private double tamanioEnCC;

    public Perfume(double tamanioEnCC, int codigo, String descripcion, String marca, long precioLista, int stock) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.tamanioEnCC = tamanioEnCC;
    }

    public double getTamanioEnCC() {
        return tamanioEnCC;
    }

    public void setTamanioEnCC(double tamanioEnCC) {
        this.tamanioEnCC = tamanioEnCC;
    }

    @Override
    public long calcularPrecioPublico() {
        return (long) (precioLista * (tamanioEnCC * 0.2));
    }

}