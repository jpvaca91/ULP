package guia5_parte2_ejer4;

import java.time.LocalDate;

public class Guia5_Parte2_Ejer4 {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juan", "Lucero", "Merlo", LocalDate.of(1978, 7, 25));
        Cuenta cuenta = new Cuenta(1234L, c1);
        cuenta.depositar(60000);
        cuenta.extraer(10000);
        System.out.println("Saldo de la cuenta es " + cuenta.verSaldo());
        cuenta.listarMovimientos();

    }

}
