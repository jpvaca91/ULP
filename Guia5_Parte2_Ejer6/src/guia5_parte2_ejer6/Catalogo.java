/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5_parte2_ejer6;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Catalogo {

    private Map<String, ArrayList<Producto>> lista_productos = new HashMap();
    private ArrayList<Producto> lista_ropa = new ArrayList();
    private ArrayList<Producto> lista_electro = new ArrayList();
    private ArrayList<Producto> lista_perfumeria = new ArrayList();

    public void agregarProducto(Producto producto) {
        if (producto instanceof Ropa) {
            lista_ropa.add(producto);
            lista_productos.put("Ropa", lista_ropa);
        } else if (producto instanceof Electro) {
            lista_electro.add(producto);
            lista_productos.put("Electro", lista_electro);

        } else if (producto instanceof Perfume) {
            lista_perfumeria.add(producto);
            lista_productos.put("Perfumeria", lista_perfumeria);
        }
    }

    //Informar la cantidad de productos que posee de cada categoría: Ropa, Perfumería y
//Electrodomésticos.
    public void informeProductos() {
        System.out.println("--- Cant. de productos ---");

        for (Map.Entry<String, ArrayList<Producto>> entry : lista_productos.entrySet()) {
            System.out.println("Categoria: " + entry.getKey() + " / Cantidad: "
                    + entry.getValue().size());
        }
        System.out.println();
    }

    public void listarElectro() {
        System.out.println("*** ELECTRO ***");
        for (Map.Entry<String, ArrayList<Producto>> entry : lista_productos.entrySet()) {

            if (entry.getKey().equals("Electro")) {
                for (Producto producto : entry.getValue()) {
                    System.out.println(producto.toString());
                }
            }
        }
        System.out.println();
    }

    public void listarRopa() {
        System.out.println("*** VESTIMENTA ***");
        for (Map.Entry<String, ArrayList<Producto>> entry : lista_productos.entrySet()) {

            if (entry.getKey().equals("Ropa")) {
                for (Producto producto : entry.getValue()) {
                    System.out.println(producto.toString());
                }
            }
        }
        System.out.println();
    }

    public void listarPerfumeria() {
        System.out.println("*** PERFUMERIA ***");
        for (Map.Entry<String, ArrayList<Producto>> entry : lista_productos.entrySet()) {

            if (entry.getKey().equals("Perfumeria")) {
                for (Producto producto : entry.getValue()) {
                    System.out.println(producto.toString());
                }
            }
        }
        System.out.println();
    }

}
