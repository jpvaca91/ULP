package guia1_parte2_ejer8;

public class Calculo {

    public static boolean esPrimo(int numero) {
        int divisores = 0;
        for (int x = 1; x < numero / 2; x++) {
            if (numero % x == 0) {
                divisores = divisores + 1;
            }
        }
        return divisores < 2;
    }

    public static void valorAbsoluto(int n) {

        System.out.println("El valor absoluto de " + n + " es " + Math.abs(n));
    }

    public static void calcularRaices(int a, int b, int c) {

        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces de la ecuación son: ");
            System.out.println("Raíz 1: " + raiz1);
            System.out.println("Raíz 2: " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuación tiene una única raíz: " + raiz);
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }
    }
}
