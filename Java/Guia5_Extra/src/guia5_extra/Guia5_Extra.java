/*
 *En un nuevo proyecto implementaremos una Pila, una Pila es una estructura de datos donde las
inserciones y recuperaciones/borrados de datos se hacen en uno de los finales, que es conocido
como tope de la pila. Como el último elemento insertado es el primero en recuperarse/borrarse,
los desarrolladores se refieren a estas pilas como pilas LIFO (last-in, first-out).
 */

package guia5_extra;


public class Guia5_Extra {

   
    public static void main(String[] args) {
        
        Pila bateria = new Pila(10);
        
        bateria.agregar("Hola");
        bateria.agregar("Hola2");
        bateria.agregar("Hola3");
        bateria.agregar("Hola4");
        bateria.agregar("Mundo5");
        bateria.agregar("Mundo6");
        bateria.agregar("Mundo7");
        bateria.agregar("Mundo8");
        bateria.agregar("Mundo9");
        bateria.agregar("Mundo10");
        bateria.agregar("Mundo11");
        bateria.agregar("Mundo loco12");
       
     
        
        for (String num : bateria.getElementos()){
            if (num!=null) {
             System.out.println(num);   
            }

        }
    }

}
