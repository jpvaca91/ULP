/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia4_ejercicioextra2;


public class Camion extends Vehiculos {

    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }
public double calcularCosto(){
    return super.calcularCosto()*(0.12);
}

}
