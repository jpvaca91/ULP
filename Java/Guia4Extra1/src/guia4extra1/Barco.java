/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia4extra1;

/**
 *
 * @author andre
 */
public class Barco {
    private String matricula;
    private double eslora;
    private int fabric;

    public Barco(String matricula, double eslora, int fabric) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabric = fabric;
    }

    public Barco() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getFabric() {
        return fabric;
    }

    public void setFabric(int fabric) {
        this.fabric = fabric;
    }
    
    public double moduloBarco(){
        return eslora*10;
    }
    
}
