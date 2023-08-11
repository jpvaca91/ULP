
package guia1_parte2_ejer3;


public class Circulo {
    public final static double PI=3.14;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getPI() {
        return PI;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
        return PI*this.radio*this.radio;
    }
    
    public double calcularPerimetro(){
        return PI*this.radio*2;
    }
    
}
