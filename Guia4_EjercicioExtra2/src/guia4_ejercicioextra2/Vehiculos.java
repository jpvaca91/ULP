/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia4_ejercicioextra2;


public class Vehiculos {
protected String marca;
protected String patente;
protected Combustible combustible;

    public Vehiculos(String marca, String patente, Combustible combustible) {
        this.marca = marca;
        this.patente = patente;
        this.combustible = combustible;
    }

 public double calcularCosto(){
     return combustible.getPrecio();
 }
}
