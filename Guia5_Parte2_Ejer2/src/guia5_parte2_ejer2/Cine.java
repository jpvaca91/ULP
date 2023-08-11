/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5_parte2_ejer2;

import java.util.HashSet;


public class Cine {

    private String nombre;
    private String direccion;
    private HashSet<Pelicula> proyecciones;

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        proyecciones = new HashSet();
    }

    public void agregarPelicula(Pelicula peli) {
        proyecciones.add(peli);
    }

    public void listarTodo() {
        for (Pelicula variable : proyecciones) {
            System.out.println(variable.getTitulo());
            //  System.out.println(variable.toString());
        }
    }

    public void listarDuranMas(int horas) {
        for (Pelicula variable : proyecciones) {
            if (variable.getDuracion() > horas) {
                System.out.println(variable.getTitulo());
                //   System.out.println(variable.toString());
            }
        }
    }

}
