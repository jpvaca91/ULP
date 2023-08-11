

package guia1_parte2_ejer5;


public class Utilitario {

    public static void dibujaCuadrado(int nro){
        
     for(int i=0;i<=nro-1;i++){
         for(int j=0;j<=nro-1;j++){
             
             if(i==0 || i==nro-1 || j==0 || j==nro-1){
                 System.out.print("*");
             }else
                 System.out.print(" ");             
         }
         System.out.println("");
     }
    } 
           
    public static void elMayorEs(int nro1,int nro2,int nro3){
        
        if(nro1==nro2 && nro2==nro3){
            System.out.println("Los 3 números son iguales");
        }else{
                if(nro1>nro2 && nro1>nro3){
                    System.out.println("El mayor es el Nro 1");
                }else if(nro2>nro1 && nro2>nro3){
                    System.out.println("El mayor es el Nro 2");
                }else{
                    System.out.println("El mayor es el Nro 3");
                }
        }
    }
    
    public static void elDiaEs(int nro){
        switch(nro){
            case 1:
                System.out.println("El día Ingresado es Lunes");
                break;                
            case 2:
                System.out.println("El día Ingresado es Martes");
                break;            
            case 3:
                System.out.println("El día Ingresado es Miercoles");
                break;
            case 4:
                System.out.println("El día Ingresado es Jueves");
                break;
            case 5:
                System.out.println("El día Ingresado es Viernes");
                break;
            case 6:
                System.out.println("El día Ingresado es Sabado");
                break;
            case 7:
                System.out.println("El día Ingresado es Domingo");
                break;
            default:
                System.out.println("El día Ingresado no Existe!!");
                           
        }
    }
    
    
}
    
    
