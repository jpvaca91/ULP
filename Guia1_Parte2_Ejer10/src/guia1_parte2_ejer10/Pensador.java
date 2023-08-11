package guia1_parte2_ejer10;

public class Pensador {

    private int nro;

    public Pensador(int nro) {
        this.nro = nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getNro() {
        return nro;
    }

    public int invertir() {
        int nro1 = nro; // creo una variable nueva para no modificar el valor original (o atributo del objeto)
        int invertido = 0;
        int resto;
        while (nro1 > 0) {
            resto = nro1 % 10; //esto es igual al último digito del nro
            invertido = invertido * 10 + resto; //al nro invertido lo multiplico por 10 para crear un espacio vacío, que va a guardar el ultimo digito del nro (o resto)
            nro1 = (nro1 / 10); // al nro original le saco el ultimo digito para que comience el proceso de vuelta
        }
        return invertido;
    }

    public int parAntes() {
        if (nro % 2 == 0) {
            return nro - 2;
        } else {
            return nro - 1;
        }
    }

    public int parPosterior() {
        if (nro % 2 == 0) {
            return nro + 2;
        } else {
            return nro + 1;
        }
    }

    public int primerDigito() {
        return invertir() % 10;
    }

    public int ultimoDigito() {
        return nro % 10;
    }

}
