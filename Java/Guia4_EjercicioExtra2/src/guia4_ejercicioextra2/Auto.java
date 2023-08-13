
package guia4_ejercicioextra2;

public class Auto extends Vehiculos {

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    public double calcularCosto() {
        
        return super.calcularCosto()*(0.07);

    }

}
