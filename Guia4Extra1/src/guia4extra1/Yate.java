/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia4extra1;

/**
 *
 * @author andre
 */
public class Yate extends Barco{
    private int potencia;
    private int camarotes;

    public Yate(int potencia, int camarotes, String matricula, double eslora, int fabric) {
        super(matricula, eslora, fabric);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
    public double moduloEspecial(){
        return super.moduloBarco()+potencia+camarotes;
    }
    
}
