/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_ejercicioextra2;

public class Viaje {

    private String lugarOrigen;
    private String lugarDestino;
    private double distancia;
    private Vehiculos vehiculo;
    private int cantPeajes;
    private double km;

    public Viaje(String lugarOrigen, String lugarDestino, double distancia, Vehiculos vehiculo, int cantPeajes, Combustible combustible) {
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.distancia = distancia;
        this.vehiculo = vehiculo;
        this.cantPeajes = cantPeajes;
    }       
    public Viaje(String lugarOrigen, String lugarDestino, Vehiculos vehiculo, int cantPeajes, double km,Combustible combustible) {
       
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.vehiculo = vehiculo;
        this.cantPeajes = cantPeajes;
        this.km = km;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Vehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCantPeajes() {
        return cantPeajes;
    }

    public void setCantPeajes(int cantPeajes) {
        this.cantPeajes = cantPeajes;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

   
    public double calculoDistancia() {
        if (distancia == 0.0) {

            System.out.println("La distancia a recorrer es de: " + km + " Kms");
            return km;
        } else {
            System.out.println("La distancia a recorrer es de: " + distancia + " Kms");
            return distancia;
        }

    }

    public double calculoCostoPeajes() {
        if (vehiculo instanceof Auto || vehiculo instanceof Camioneta) {
            System.out.println("El costo de peajes es: $" + cantPeajes * 200);
            return cantPeajes * 200.0;
        } else {
            System.out.println("El costo de peajes es: $" + cantPeajes * 500);
            return cantPeajes * 500.0;
        }
    }

    public double calculoCostoCombustible() {
        double costo;
        if (vehiculo instanceof Auto) {
            costo = ((Auto) vehiculo).calcularCosto() * calculoDistancia();
            System.out.println("El costo del combustible para el Auto es: $" + costo);
            return costo;
        } else if (vehiculo instanceof Camioneta) {
            costo = ((Camioneta) vehiculo).calcularCosto() * calculoDistancia();
            System.out.println("El costo del combustible para la Camioneta es: $" + costo);
            return costo;
        } else {
            costo = ((Camion) vehiculo).calcularCosto() * calculoDistancia();
            System.out.println("El costo del combustible para el Camion es: $" + costo);
            return costo;
        }

    }

    public void costoTotal() {

        System.out.println("El costo total del viaje es de: $" + (calculoCostoPeajes() + calculoCostoCombustible()));

    }

}
