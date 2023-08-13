package guia4_ejercicioextra2;

public class Guia4_EjercicioExtra2 {

    public static void main(String[] args) {

        Combustible gas = new Combustible("Gas", 100);
        Auto fiesta = new Auto("Ford", "MWX056", gas);
        Viaje v1 = new Viaje("Cordoba", "Potrero", fiesta, 2, 81, gas);
        v1.costoTotal();

        System.out.println("----");

        Combustible nafta = new Combustible("Nafta", 300);
        Vehiculos chatita = new Camioneta("Fiat", "AA056WD", nafta);
        Viaje v2 = new Viaje("Córdoba", "Villa Maria", 150, chatita, 3, nafta);
        v2.costoTotal();

        System.out.println("----");

        Combustible gasoil = new Combustible("Gasoil", 250);
        Vehiculos mionca = new Camion("Scania", "zzz000", gasoil);
        Viaje v3 = new Viaje("Córdoba", "Rio Grande", mionca, 5, 3089, gasoil);
        v3.costoTotal();

    }

}
