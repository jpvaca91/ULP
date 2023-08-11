
package guia3ejercicio3;


public class Rueda {
    
    private String marca;
    private double presion;

    public Rueda(String marca, double presion) {
        this.marca = marca;
        this.presion = presion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }
    
    public void Inflar(){
       presion = 28.0;
        System.err.println("Rueda"+ getMarca()  + " completamente inflada");
    }
    
    public void Pinchar(){
        presion = 0;
        System.err.println("Pinchaste "+ getMarca());
    }
    
    public void desinflarRueda(){
        presion = presion - 0.5;
        System.err.println("Desinflar " + getMarca());
    }
}
