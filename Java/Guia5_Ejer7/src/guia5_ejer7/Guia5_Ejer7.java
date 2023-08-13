package guia5_ejer7;

public class Guia5_Ejer7 {

    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int[][] matrix = new int[3][3];

// A) creamos la matriz grande con valores aleatorios:
        System.out.println("Matriz grande:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (int) (Math.random() * 10+10);

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("- - - - - - - - - - - ");

// B) ahora creamos la matriz chica con valores aleatorios:
        System.out.println("Matriz chica:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (int) (Math.random() * 10+10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

// C) creamos un contador para contar la cantidad de coincidencias a partir de que coincida el primer nro de la matriz chica
        int contCoinc = 0;

        //D) empezamos a recorrer la matriz grande
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                //E) evaluamos si hay coincidencia con el primer nro de la matriz chica
                if (matriz[i][j] == matrix[0][0]) {
                    System.out.println("Puede haber una coincidencia en ("+i+","+j+")");

                    //F) ahora creamos un nuevo recorrido para buscar en ese cuadrante
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {

                            if (matriz[i + k][j + l] != matrix[k][l]) {
                                break;

                            } else {

                                contCoinc++;
                            }
                        }
                    }
                    if (contCoinc != 9) {
                        System.out.println("No era tan igual..");
                    } else {
                        System.out.println("\033[41;31m"+"Siiii!! La coincidencia es EXACTA en la posición: (" + i + "," + j + ")  !!!!"+"\033[0m");
                    }
                    contCoinc=0;
                }
            }

        }

    }

}
