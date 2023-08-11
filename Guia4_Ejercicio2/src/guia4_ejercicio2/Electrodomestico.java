/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_ejercicio2;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;

    public Electrodomestico() {

    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {

        this.precio = precio;
        this.color = color;
        comprobarColor(color);
        this.consumo = consumo;
        comprobarConsumo(consumo);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumo(char letra) {

        if (letra >= 'a' && letra < 'g') {
            this.consumo = letra;
        } else {
            this.consumo = 'f';
        }
        System.out.println("consumo comprobado");
    }

    private void comprobarColor(String col) {
        if (col.equalsIgnoreCase("blanco") || col.equalsIgnoreCase("negro") || col.equalsIgnoreCase("rojo") || col.equalsIgnoreCase("azul") || col.equalsIgnoreCase("gris")) {
            this.color = col;
        } else {
            this.color = "blanco";
        }
        System.out.println("color comprobado");
    }

   
    public void precioFinal() {

        switch (consumo) {
            case 'a':
                precio = precio + 1000;

                break;
            case 'b':
                precio = precio + 800;

                break;
            case 'c':
                precio = precio + 600;

                break;
            case 'd':
                precio = precio + 500;

                break;
            case 'e':
                precio = precio + 300;

                break;
            case 'f':
                precio = precio + 100;
                break;

        }
        
            if (peso > 0 && peso < 20){
                precio=precio+100;
            }else if( peso >19 && peso<50){
                precio=precio+500;
            } else if (peso >49 && peso<80){
                precio=precio+800;
            }else{
                precio=precio+1000;
            }
           System.out.println("El sub total: $"+precio);   
        }
    }

