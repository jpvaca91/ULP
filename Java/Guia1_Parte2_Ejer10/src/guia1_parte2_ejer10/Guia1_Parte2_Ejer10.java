package guia1_parte2_ejer10;

public class Guia1_Parte2_Ejer10 {

    public static void main(String[] args) {
        Pensador A = new Pensador(1395);
        System.out.println("The original number is: " + A.getNro());
        System.out.println("The inverted number is: " + A.invertir());
        System.out.println("The previous pair is: " + A.parAntes());
        System.out.println("The next pair is: " + A.parPosterior());
        System.out.println("The first digit is: " + A.primerDigito());
        System.out.println("The last digit is: " + A.ultimoDigito());
        System.out.println("Thank you! see you soon");
    }

}
