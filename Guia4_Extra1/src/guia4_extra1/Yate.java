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
public class Yate extends Barco {
    
    private int potenciaCV;
    private int numCamarotes;

    public Yate(int potenciaCV, int numCamarotes, String matricula, double slora, String fechaFabricacion) {
        super(matricula, slora, fechaFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }
    
    
    public double moduloEspecial(){

        return super.calcularModulo()+potenciaCV+numCamarotes;

    }
    
}
