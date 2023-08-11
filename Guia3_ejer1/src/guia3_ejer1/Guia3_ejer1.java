package guia3_ejer1;

public class Guia3_ejer1 {

    public static void main(String[] args) {
        Persona humano = new Persona("Juan", 28, 36897123, "Perez");
        Perro p1 = new Perro("Firulais", "Boxer", 3, "Mediano");
        Perro p2 = new Perro("Huesos", "Gran Danes", 8, "Grande");
        Perro p3 = new Perro("Molesto", "Caniche", 6, "Pequeño");
        Perro p4 = new Perro("Roberto", "Pitbull", 1, "Mediano");
        humano.adoptarPerro(p1);
        humano.adoptarPerro(p3);
        humano.adoptarPerro(p4);
        humano.adoptarPerro(p2);
        System.out.println("el perro mas viejo es: " + humano.perroMasGrande());
    }
}
