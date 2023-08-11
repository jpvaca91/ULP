
package guia1_ejer2;

/*En un nuevo proyecto crear una clase que represente una Computadora, usted determine
que atributos describirían mejor a dicho objeto y luego agregue un constructor para
inicializar sus atributos y los respectivos métodos getter y setter. Desde el método main de
la clase principal del proyecto, instanciar una Computadora y mostrar por consola el estado
de todos sus atributos.*/

public class Computadora {
    private String marca;
    private int modelo;
    private int memoria;
    
    
    public Computadora(String marca, int modelo, int memoria){
        this.marca=marca;
        this.modelo=modelo;
        this.memoria=memoria;
    }

    Computadora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void Computadora(){}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getModelo(){
        return modelo;
    }
    
    public void setModelo(int modelo){
        this.modelo=modelo;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    
    public void mostrar(){
        System.out.println("La marca es "+marca+", el modelo es"
                + ": "+modelo+", la memoria es "+memoria+" gigas");
    }
    
}
