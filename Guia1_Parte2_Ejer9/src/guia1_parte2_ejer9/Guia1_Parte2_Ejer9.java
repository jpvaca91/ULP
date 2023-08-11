package guia1_parte2_ejer9;

public class Guia1_Parte2_Ejer9 {

    public static void main(String[] args) {

        Fecha f1 = new Fecha(21, 5, 1991);
        Fecha f2 = new Fecha(01, 06, 2000);
        System.out.print("La fecha 1 es: ");
        f1.mostrarFecha();
        System.out.print("La fecha 2 es: ");
        f2.mostrarFecha();
        System.out.println("La primer fecha es Bisiesto: " + f1.esBiciesto());
        System.out.println("La segunda fecha es Bisiesto: " + f2.esBiciesto());
        System.out.println("La diferencia en años es: " + f1.calcularAños(f2.getAño()));

    }

}
