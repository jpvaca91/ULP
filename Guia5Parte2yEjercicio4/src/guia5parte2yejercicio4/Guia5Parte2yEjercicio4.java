/*
Desde el método main de una clase Test, se pide:
-
-
-
-
-
-
Crear el cliente Juan Lucero de la localidad de Merlo, nacido el 25/07/1978
Crear una cuenta nro 1234 para el cliente creado en el punto anterior.
Depositar en la cuenta 60.000 (sesenta mil) pesos.
Extraer de la cuenta 10.000 (diez mil) pesos.
Mostrar por consola el saldo de dicha cuenta.
Mostrar usando el método de cuenta todos los movimientos.
 */
package guia5parte2yejercicio4;

import java.time.LocalDate;

/**
 *
 * @author john
 */
public class Guia5Parte2yEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cliente c1=new Cliente("Juan", "Lucero", "Merlo", LocalDate.of(1978, 7, 25));
       Cuenta cuenta = new Cuenta(1234L, c1);
       cuenta.depositar(60000);
       cuenta.extraer(10000);
        System.out.println("Saldo de la cuenta es "+ cuenta.verSaldo());
        cuenta.listarMovimientos();
        
    }
    
}
