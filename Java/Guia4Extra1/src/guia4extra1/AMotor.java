/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia4extra1;

/**
 *
 * @author andre
 */
public class AMotor extends Barco {
    private int potencia;

    public AMotor(int potencia, String matricula, double eslora, int fabric) {
        super(matricula, eslora, fabric);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
    public double moduloEspecial(){
        return super.moduloBarco()+potencia;
    }
    
}
