/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5_ejer1;


public class PruebaArreglo {
    public static void main(String[] args) {
         int vector[] = {2, 3};
        
        Arreglo.sumarLista(vector);
        Arreglo.sumarLista2(vector);
        
        int matriz[][] = {{2, 3, 9}, {5, 6, 7}};
        
        Arreglo.buscarMayor(matriz);
        
        String cadena = "hola Mundo loco";
        Arreglo.cuentaVocales(cadena);
        Arreglo.cuentaCaracter(cadena, 'o');
    }
}
