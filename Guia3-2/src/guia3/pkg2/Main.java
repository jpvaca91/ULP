package guia3.pkg2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //instancio Kiosco
        Kiosco k1 = new Kiosco("24-HS", "Av. Libertador  Norte 2023", 105554446);

        //Se crean los tres empleados con valores
        Empleado e1 = new Empleado("José", "de San Martin", LocalDate.of(1778, 2, 25), 01222333);
        Empleado e2 = new Empleado("Juan", "Milenial", LocalDate.of(2001, 4, 01), 35111777);
        Empleado e3 = new Empleado("Pandemia", "Global", LocalDate.of(2022, 03, 20), 30505505);

        //Se contratan los empleados
        k1.contratar(e1);
        System.out.println("------------------------------------------");
        k1.contratar(e2);
        System.out.println("------------------------------------------");
        k1.contratar(e3);

        //Se muestra el de más Antiguedad
        System.out.println("\n/////////////////////////////////////////\n");
        k1.empleadoMasAntiguo();

    }

}
