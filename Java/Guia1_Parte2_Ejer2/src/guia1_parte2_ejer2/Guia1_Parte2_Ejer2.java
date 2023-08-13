
package guia1_parte2_ejer2;


public class Guia1_Parte2_Ejer2 {

   
    public static void main(String[] args) {
       
        Cuadrilatero recto=new Cuadrilatero(50,70);
        
        System.out.println("El perimetro es: "+recto.calcularPerimetro());
        System.out.println("El Área es: "+recto.calcularArea());
        System.out.println("Es un cuadrado? "+recto.esUnCuadrado());
        
        recto.setAlto(50);
        
        System.out.println("y ahora es un cuadrado? "+recto.esUnCuadrado());
        
    }

}
