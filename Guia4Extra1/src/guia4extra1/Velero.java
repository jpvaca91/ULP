/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia4extra1;

/**
 *
 * @author andre
 */
public class Velero extends Barco{
    private int mastiles;

    public Velero(int mastiles, String matricula, double eslora, int fabric) {
        super(matricula, eslora, fabric);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    
   public double moduloEspecial(){
       
       return super.moduloBarco()+mastiles;
   }
}
