/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia4extra1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author andre
 */
public class Alquiler extends Barco{
    private String nombre;
    private int documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevoluc;
    private int posicion;
    private Barco barcoAmarrado;

    public Alquiler(String nombre, int documento, String fechaAlquiler, String fechaDevoluc, int posicion, Barco barcoAmarrado) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = LocalDate.parse(fechaAlquiler);
        this.fechaDevoluc = LocalDate.parse(fechaDevoluc);
        this.posicion = posicion;
        this.barcoAmarrado = barcoAmarrado;
    }

    public Alquiler() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevoluc() {
        return fechaDevoluc;
    }

    public void setFechaDevoluc(LocalDate fechaDevoluc) {
        this.fechaDevoluc = fechaDevoluc;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Barco getBarcoAmarrado() {
        return barcoAmarrado;
    }

    public void setBarcoAmarrado(Barco barcoAmarrado) {
        this.barcoAmarrado = barcoAmarrado;
    }
    
    public void calculoAlquiler(){
        int diasAlquiler = (int)(ChronoUnit.DAYS.between(fechaAlquiler, fechaDevoluc));
        double modulo = 0;
        if(barcoAmarrado instanceof Yate ){
            modulo=super.moduloBarco()+((Yate) barcoAmarrado).moduloEspecial();
            
        } else if ( barcoAmarrado instanceof AMotor) {
            modulo=super.moduloBarco()+((AMotor) barcoAmarrado).moduloEspecial();
        } else if (barcoAmarrado instanceof Velero){
            modulo=super.moduloBarco()+((Velero) barcoAmarrado).moduloEspecial();
        } else {
            modulo=barcoAmarrado.moduloBarco();
        }
        
        System.out.println("Precio total de alquiler $" + (modulo*diasAlquiler));
    }
    
}
