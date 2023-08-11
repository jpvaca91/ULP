/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author enzob
 */
public class Producto {
    private String descripcion,tipoProducto;
    private double stock,precioLista;

    public Producto(String descripcion, String tipoProducto, double stock, double precioLista) {
        this.descripcion = descripcion;
        this.tipoProducto = tipoProducto;
        this.stock = stock;
        this.precioLista = precioLista;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(double precioLista) {
        this.precioLista = precioLista;
    }
    
    public double calcularPrecioPublico(){
        double precioPublico = precioLista;
        if (tipoProducto.equalsIgnoreCase("lacteo")) {
            precioPublico+=precioLista*0.25;
        }else if   (tipoProducto.equalsIgnoreCase("limpieza")) {
            precioPublico+=precioLista*0.35;   
        }else{
            precioPublico+=precioLista*0.45;
                    
        }
        return precioPublico;
    }
}
