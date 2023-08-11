/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia5parte2yejercicio4;

import java.time.LocalDate;

/**
 *
 * @author john
 */
public class Movimiento {
    private LocalDate fecha;
    private char tipo;
    private double importe;
    private double saldo;

    public Movimiento(LocalDate fecha, char tipo, double importe, double saldo) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.importe = importe;
        this.saldo = saldo;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public char getTipo() {
        return tipo;
    }

    public double getImporte() {
        return importe;
    }

    public double getSaldo() {
        return saldo;
    }
    @Override
    public String toString(){
        return "fecha "+fecha+ " tipo "+tipo+" saldo "+saldo;
    }
    
    
    
}
