package guia5_extra;

public class Pila {

    private int tope = -1;
    private String elementos[];

    public Pila(int tamaño) {
        this.elementos = new String[tamaño];
    }

    public String[] getElementos() {
        return elementos;
    }

    public void agregar(String elem) {
        tope++;
        if (tope < elementos.length) {

            elementos[tope] = elem;
            System.out.println("elemento " +elem + " agregado");
        } else {
            System.out.println("La pila esta llena para guardar el elemento "+elem);
        }

    }

    public String verTope() {
        return elementos[tope];
    }

    public String quitar() {
        String aux = elementos[tope];
        elementos[tope] = null;
        tope--;
        System.out.println("Se esta eliminando el siguiente String " + aux);
        return aux;
    }

    public boolean pilaVacia() {
        return tope == -1;
    }

    public boolean pilaLLena() {
        return tope == elementos.length - 1;

    }

}
