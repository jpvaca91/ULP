
package guia1_parte2_ejer7;


public class Guia1_Parte2_Ejer7 {

   
    public static void main(String[] args) {
        
        Robot tito=new Robot("Tito");
        for(int i=0;i<=5000;i++){
        tito.avanzar(1);
        System.out.println("Bateria: "+tito.getBateria());
        System.out.println("La bateria está vacía: "+tito.bateriaVacia());
        
         }
}
}