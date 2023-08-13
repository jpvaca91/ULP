/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia1_parte2_ejer1;


public class Guia1_Parte2_Ejer1 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Numero x=new Numero(3);
        
        if(x.esPar()){
            System.out.println("El numero es par.");
        }else{
            System.out.println("El numero es Impar");
        }
        
        System.out.println("El numero es positivo: "+x.esPositivo());
        
        System.out.println("El numero es multiplo de 3?: "+x.esMultiplo());
        
        
        
    }
    
    

}
