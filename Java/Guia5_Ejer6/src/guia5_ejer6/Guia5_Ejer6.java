
package guia5_ejer6;

import java.util.Scanner;


public class Guia5_Ejer6 {

   
    public static void main(String[] args) {
        int dim = 3;
        int[][] matriz = new int[dim][dim];
        String pos = "";
        Scanner leer = new Scanner(System.in);
        int r, a, b, c, d, e, f, g, h;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                do {
                    System.out.print("Numero del 1 al 9:");
                    r = leer.nextInt();
                } while (r < 1 || r > 9);
                matriz[i][j] = r;
                pos += "[" + matriz[i][j] + "]";
            }
        }
        a = matriz[0][0] + matriz[0][1] + matriz[0][2];
        b = matriz[1][0] + matriz[1][1] + matriz[1][2];
        c = matriz[2][0] + matriz[2][1] + matriz[2][2];
        d = matriz[0][0] + matriz[1][0] + matriz[2][0];
        e = matriz[0][1] + matriz[1][1] + matriz[2][1];
        f = matriz[0][2] + matriz[1][2] + matriz[2][2];
        g = matriz[0][0] + matriz[1][1] + matriz[2][2];
        h = matriz[0][2] + matriz[1][1] + matriz[2][0];
        if (a == b && a == c && a == d && a == e && a == f && a == g && a == h) {
            System.out.println("Es un cuadrado magico!!!");
        }else{
            System.out.println("No es magico");
        }
    }

}
