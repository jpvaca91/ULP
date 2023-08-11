
package Guia5_Extra_Ejercicio2;


public class Datos {
    private String nombre;
    private String apellido;
    private double milimetrosCaidos;

    public Datos(String nombre, String apellido, double milimetrosCaidos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.milimetrosCaidos = milimetrosCaidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getMilimetrosCaidos() {
        return milimetrosCaidos;
    }

    @Override
    public String toString() {
        
        return "\n"+nombre+" "+apellido+" "+milimetrosCaidos; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

}
