package guia1_parte2_ejer7;

public class Robot {

    private double bateria = 500.0;
    private String nombre;
  

    public Robot(String nombre) {
        this.nombre = nombre;
    }

    public double getBateria() {
        return this.bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void avanzar(int n) {
       double consumo = n /10.0;

        if (this.bateria >= consumo) {
            System.out.println("AVANZASTE " + n);
            this.bateria = this.bateria - consumo;
        } else {
            System.out.println("No te da la nafta :(");
        }

    }

    public boolean bateriaVacia() {
        return this.bateria <= 0;

    }
}
