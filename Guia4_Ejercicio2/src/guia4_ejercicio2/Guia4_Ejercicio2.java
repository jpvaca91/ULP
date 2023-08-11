package guia4_ejercicio2;

public class Guia4_Ejercicio2 {

    public static void main(String[] args) {
        Electrodomestico lavadora = new Lavadora(50, 1000,"violeta" , 'a', 50);
        lavadora.precioFinal();
        Electrodomestico tele = new Televisor (45, true, 1000, "blanco", 'c', 50);
        tele.precioFinal();
    
    }

}
