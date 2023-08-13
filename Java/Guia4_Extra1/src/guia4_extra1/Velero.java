/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_extra1;

/**
 *
 * @author MOLLO RAMIREZ
 */
public class Velero extends Barco {
    public int numMastiles;

    public Velero(int numMastiles) {
        this.numMastiles = numMastiles;
    }

   
    
    
    public Velero(int numMastiles, String matricula, double slora, String fechaFabricacion) {
        super(matricula, slora, fechaFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }
    
    public double moduloEspecial(){
    
        return super.calcularModulo()+numMastiles;
    
    }
}
