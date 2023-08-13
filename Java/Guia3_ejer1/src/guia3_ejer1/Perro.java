package guia3_ejer1;

public class Perro {

    private String Nombre;

    private String Raza;

    private int Edad;

    private String Tamanio;

    public Perro(String Nombre, String Raza, int Edad, String Tamanio) {
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Edad = Edad;
        this.Tamanio = Tamanio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getTamanio() {
        return Tamanio;
    }

    public void setTamanio(String Tamanio) {
        this.Tamanio = Tamanio;
    }

 

}
