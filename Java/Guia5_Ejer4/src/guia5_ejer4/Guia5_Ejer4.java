
package guia5_ejer4;


public class Guia5_Ejer4 {

   
    public static void main(String[] args) {
        
        int [][] matriz= new int  [2][2];
        
        for(int [] fila: matriz){
            
            for (int elemento: fila){
               fila [elemento]= 10;
            }
        }
        
        for(int [] fila: matriz){
            for (int elemento: fila){
                System.out.print(elemento+" ");
            }
            System.out.println("");
        }
        
    }

}
