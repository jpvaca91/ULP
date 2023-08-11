

package guia1_parte2_ejer2;


public class Cuadrilatero {
    private int largo;
    private int alto;

    public Cuadrilatero(int largo, int alto) {
        this.largo = largo;
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public int calcularPerimetro(){
       
        return this.largo*2+this.alto*2;
    }
    
    public int calcularArea(){
        return  this.largo*this.alto;
    }

    public boolean esUnCuadrado(){
        return this.largo==this.alto;
    }
}
