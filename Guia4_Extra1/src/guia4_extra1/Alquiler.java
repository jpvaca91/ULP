/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_extra1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author MOLLO RAMIREZ
 */
public class Alquiler extends Barco {
    
    private String NombreCliente;
    private int numDNI;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barcoAmarrado;

    public Alquiler(String NombreCliente, int numDNI, String fechaAlquiler, String fechaDevolucion, int posicionAmarre, Barco barcoAmarrado) {
        
        this.NombreCliente = NombreCliente;
        this.numDNI = numDNI;
        this.fechaAlquiler = LocalDate.parse(fechaAlquiler);
        this.fechaDevolucion = LocalDate.parse(fechaDevolucion);
        this.posicionAmarre = posicionAmarre;
        this.barcoAmarrado = barcoAmarrado;
    }

    

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public int getNumDNI() {
        return numDNI;
    }

    public void setNumDNI(int numDNI) {
        this.numDNI = numDNI;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = LocalDate.parse(fechaAlquiler);
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = LocalDate.parse(fechaDevolucion);
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarcoAmarrado() {
        return barcoAmarrado;
    }

    public void setBarcoAmarrado(Barco barcoAmarrado) {
        this.barcoAmarrado = barcoAmarrado;
    }
    
    public long diasAlquiler(){
    
        return ChronoUnit.DAYS.between(fechaAlquiler,fechaDevolucion);
    
    }
    
    public double calcularPrecio(Barco barcoAmarrado){
        
        double modulo=0;
        
        if (barcoAmarrado instanceof Velero) {
            modulo=super.calcularModulo()+((Velero) barcoAmarrado).moduloEspecial();
            
        }else if (barcoAmarrado instanceof BarcoAMotor) {
            modulo=super.calcularModulo()+((BarcoAMotor) barcoAmarrado).moduloEspecial();
            
        }else if (barcoAmarrado instanceof Yate) {
            modulo=super.calcularModulo()+((Yate) barcoAmarrado).moduloEspecial();
            
        }else if (barcoAmarrado instanceof Barco){
            modulo=barcoAmarrado.calcularModulo();
        }
        
        double precio=modulo*diasAlquiler();
        
        return precio;
        }

}
