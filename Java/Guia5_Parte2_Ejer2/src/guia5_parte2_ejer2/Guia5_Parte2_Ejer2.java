
package guia5_parte2_ejer2;

import java.util.Scanner;


public class Guia5_Parte2_Ejer2 {

   
   public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
   
        Cine cineasta = new Cine("Roma SRL", "Rivadavia 325");
        char nuevo;
        do {            
            System.out.print("Ingrese el nombre de la pelicula: ");
            String nombre = leer.nextLine();
            System.out.print("Ingrese el nombre de su director: ");
            String direc = leer.nextLine();
            System.out.print("Ingrese la duracion de la peli: ");
            int dura = leer.nextInt();
            
            Pelicula peli = new Pelicula(nombre, direc, dura);
            cineasta.agregarPelicula(peli);
            
            leer.nextLine();  // renovando
            System.out.print("Desea agrear otra pelicula (S/N): ");
            nuevo = leer.nextLine().toUpperCase().charAt(0);
            
        } while (nuevo != 'N');
        
        System.out.println("Ingrese la cantidad de horas minimas de la pelicula: ");
        int X = leer.nextInt();
        System.out.println("Pelis de mas de "+X+" hora(s)");
        cineasta.listarDuranMas(X);
        
        System.out.println("Todas las pelis del cine");
        cineasta.listarTodo();
    }
    

}
