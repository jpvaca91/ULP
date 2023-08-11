/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author enzob
 */
public class Cliente {
    private String nombre,provincia;

    public Cliente(String nombre, String provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }

    public String getProvincia() {
        return provincia;
    }
    
   
}
