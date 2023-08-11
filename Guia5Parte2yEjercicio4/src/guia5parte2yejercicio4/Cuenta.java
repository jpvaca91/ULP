/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia5parte2yejercicio4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;

/**
 *
 * @author john
 */
public class Cuenta {
    private long numero;
    private double saldo;
    private double interesAnual;
    private Cliente titular;
    private LinkedList<Movimiento> movimientos;

    public Cuenta(long numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.movimientos=new LinkedList();
    }
    
    public void depositar(double cantidad){
        saldo+=cantidad;
        movimientos.add(new Movimiento(LocalDateTime.now().toLocalDate(),'D', cantidad, saldo));
        System.out.println("Se ha depositado "+cantidad+ " con un nuevo saldo de "+saldo);
    }
    
    public void extraer(double cantidad){
        if(this.saldo>=cantidad)
        {
            saldo-=cantidad;
            movimientos.add(new Movimiento(LocalDateTime.now().toLocalDate(),'E', cantidad, saldo));
            System.out.println("Se ha extraido "+cantidad+ " con un nuevo saldo de "+saldo);
        }
        else
            System.out.println("Saldo insuficiente");
        
    }
    
    public void cambiarInteresAnual(double valor){
        this.interesAnual=valor;
    }
    
    public Cliente verTitular(){
        return this.titular;
        
    }
    
    public double verSaldo(){
        return this.saldo;
    }
    
    public void listarMovimientos(){
        /*
        for(Movimiento M: this.movimientos){
            System.out.println(M.toString());
        }
        */
        this.movimientos.forEach(m ->{
            System.out.println(m);
        });
            
       // System.out.println(this.movimientos.iterator());
        
    }
}
