/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5_parte2_ejer6;

public abstract class Producto {
    
    //código,
//descripción, marca, precioLista y stock;
    
    protected int codigo;
    protected String descripcion;
    protected String marca;
    protected long precioLista;
    protected int stock;

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", marca=" + marca + ", precioLista=" + precioLista + ", stock=" + stock + '}';
    }
    
    

    public Producto(int codigo, String descripcion, String marca, long precioLista, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.precioLista = precioLista;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public long getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(long precioLista) {
        this.precioLista = precioLista;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public abstract long calcularPrecioPublico();
    
    
    
    
}
