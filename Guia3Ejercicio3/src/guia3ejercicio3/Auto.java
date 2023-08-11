
package guia3ejercicio3;

import java.util.Scanner;


public class Auto {

    private String color;
    private String patente;
    private double combustible = 50;
    private Rueda rueda1;
    private Rueda rueda2;
    private Rueda rueda3;
    private Rueda rueda4;
    
    
    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public void agregarRueda(Rueda r1) {
        if (rueda1 == null) {
            rueda1 = r1;
            System.out.println("Agregaste la rueda 1" + r1.getMarca());
        } else if (rueda2 == null) {
            rueda2 = r1;
            System.out.println("Agregaste la rueda 2" + r1.getMarca());
        } else if (rueda3 == null) {
            rueda3 = r1;
            System.out.println("Agregaste la rueda 3" + r1.getMarca());
        } else if (rueda4 == null) {
            rueda4 = r1;
            System.out.println("Agregaste la rueda 4" + r1.getMarca());
        } else {
            System.out.println("Todas las ruedas están colocadas");
        }
                
    }
      
        public void avanzar() {
        System.out.print("Cuantos metros quiere avanzar? ");
        Scanner sc = new Scanner(System.in);
        double metros = sc.nextInt();
        double consumo = metros * 0.1;
        
        if (combustible > consumo) {
            combustible = combustible - consumo;
            System.out.println("Avanzó " + metros + " metros, y quedan " + combustible + "litros de combustible");
        } else {
            System.err.println("No hay combustible suficiente para seguir avanzando");
        }
    }

    public void retroceder() {
        System.out.print("Cuantos metros quiere retroceder? ");
        Scanner sc = new Scanner(System.in);
        double metros = sc.nextInt();
        double consumo = metros * 0.1;
        if (combustible > consumo) {
           combustible = combustible - consumo;
            System.out.println("Retrocedió " + metros + " metros, y quedan " + combustible + " litros de combustible");
        } else {
            System.err.println("No hay combustible suficiente para seguir retrocediendo");
        }
    }
    
    public void LlenarTanque(){
        combustible = 50;
        System.out.println("Cargaste 50 litros de combustible");
    }
    
    
    
}
