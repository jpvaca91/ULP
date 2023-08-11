/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1_ejer3;

/**
 *
 * @author Admin
 */
public class Jugador {
    private String nombre;
    private int puntaje;
    private String nacionalidad;
    private int edad;
    

    public Jugador() {
    }

    
    public Jugador(String nombre, int puntaje, String nacionalidad, int edad) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrar(){
        System.out.println("El nombre es: "+nombre+""
                + " El puntaje es "+puntaje+""
                        + " La nacionalidad es "+ nacionalidad+""
                                + " La edad es "+edad+"");
    }
    
    
}
