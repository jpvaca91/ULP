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
public class BarcoAMotor extends Barco {
    
    private int potenciaCV;


    public BarcoAMotor(int potenciaCV, String matricula, double slora, String fechaFabricacion) {
        super(matricula, slora, fechaFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    
    public double moduloEspecial(){
    
       return super.calcularModulo()+potenciaCV;
    
    }
}
