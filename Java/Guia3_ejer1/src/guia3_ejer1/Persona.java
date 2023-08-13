package guia3_ejer1;

public class Persona {

    private String Nombre;
    private int Edad;
    private int DNI;
    private String Apellido;
    private Perro perro1;
    private Perro perro2;
    private Perro perro3;

    public Persona(String Nombre, int Edad, int DNI, String Apellido) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.DNI = DNI;
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Perro getPerro1() {
        return perro1;
    }

    public void setPerro1(Perro perro1) {
        this.perro1 = perro1;
    }

    public Perro getPerro2() {
        return perro2;
    }

    public void setPerro2(Perro perro2) {
        this.perro2 = perro2;
    }

    public Perro getPerro3() {
        return perro3;
    }

    public void setPerro3(Perro perro3) {
        this.perro3 = perro3;
    }

    public void adoptarPerro(Perro perro) {
        if (perro1 == null) {
            perro1 = perro;
            System.out.println("Adoptaste a " + perro.getNombre() + "!!");
        } else if (perro2 == null) {
            perro2 = perro;
            System.out.println("Adoptaste a " + perro.getNombre() + "!!");
        } else if (perro3 == null) {
            perro3 = perro;
            System.out.println("Adoptaste a " + perro.getNombre() + "!!");
        } else {
            System.out.println("Ya no tenes lugar en tu casa para adoptar a " + perro.getNombre() + " :(");
        }
    }

    public String perroMasGrande() {
        Perro perroMayor;
        if (perro1.getEdad() > perro2.getEdad()) {
            perroMayor = perro1;
        } else {
            perroMayor = perro2;
        }
        if (perro3.getEdad() > perroMayor.getEdad()) {
            perroMayor = perro3;
        }
        return perroMayor.getNombre();
    }
}
