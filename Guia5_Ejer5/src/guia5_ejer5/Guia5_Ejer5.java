
package guia5_ejer5;


public class Guia5_Ejer5 {

   
    public static void main(String[] args) {
        int[][] matriz=new int[3][3];
        int[][] matrizt=new int[3][3];
        
        matriz[0]=new int[]{0,-2,4};
        matriz[1]=new int[]{2,0,2};
        matriz[2]=new int[]{-4,-2,0};
        
        
        for (int i = 0; i <3; i++) {
            for (int j = 0;j< 3; j++) {
                matrizt[j][i]=matriz[i][j];
                
            }
        }
        int aux=0;
         for (int i = 0; i <3; i++) {
             
            for (int j = 0;j< 3; j++) {
               if (matrizt[i][j]*(-1)!=matriz[i][j]){
                   aux++;
                }
            } 
        }
        if(aux==0) 
        System.out.println("la matriz es anti simétrica"); 
        else
        System.out.println("la matriz no es anti simétrica");
    }
    
}
    

