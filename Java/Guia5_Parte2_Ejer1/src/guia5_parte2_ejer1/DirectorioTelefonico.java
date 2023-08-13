/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_parte2_ejer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DirectorioTelefonico {

    private String telefono;
    private Cliente cliente;
    private TreeMap<String, Cliente> directorio;

    public DirectorioTelefonico() {
        this.directorio = new TreeMap();
    }

    public void agregarCliente(String tel, Cliente c) {
        System.out.println("Cliente "+ c.getApellido()+" agregado correctamente");
        this.directorio.put(tel, c);

    }

    public void buscarClientePorTelefono(String tel) {
        //List<String> telef = new ArrayList();

        for (Map.Entry<String, Cliente> var : directorio.entrySet()) {
            if (var.getKey().equalsIgnoreCase(tel)) {
                System.out.println("Cliente encontrado.. Los datos son:");
                System.out.println(var.getValue().toString());

            }
        }
        
    }

    public List buscarTelefono(String apellido) {
        List<String> telefonos = new ArrayList();

        for (Map.Entry<String, Cliente> var : directorio.entrySet()) {
            if (var.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(var.getKey());

            }
        }
        return telefonos;
    }

    public List buscarCliente(String ciudad) {
        List<Cliente> client = new ArrayList();
        for (Map.Entry<String, Cliente> var : directorio.entrySet()) {
            if (var.getValue().getCiudad().equalsIgnoreCase(ciudad)) {
                client.add(var.getValue());

            }
        }
        return client;
    }

    public void borrarCliente(String tel) {
        directorio.remove(tel);
    }

   

}
