/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_extra1;

import java.time.LocalDate;

/**
 *
 * @author MOLLO RAMIREZ
 */
public class Barco {
    
    protected String matricula;
    protected double slora;
    protected LocalDate fechaFabricacion;

    public Barco() {
    }

    public Barco(String matricula, double slora, String fechaFabricacion) {
        this.matricula = matricula;
        this.slora = slora;
        this.fechaFabricacion = LocalDate.parse(fechaFabricacion);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSlora() {
        return slora;
    }

    public void setSlora(double slora) {
        this.slora = slora;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = LocalDate.parse(fechaFabricacion);
    }
    
    public double calcularModulo(){
        
        return slora*10;
    
        
    }
    
    
}
