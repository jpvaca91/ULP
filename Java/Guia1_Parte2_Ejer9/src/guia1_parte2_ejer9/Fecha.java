package guia1_parte2_ejer9;

public class Fecha {

    private int dia, mes, año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean esBiciesto() {
        return año % 4 == 0 && año % 100 != 0 || año % 400 == 0;
    }

    public int calcularAños(int año2) {
        return Math.abs(año - año2);

    }

    public void mostrarFecha() {
        System.out.println(dia + "/" + mes + "/" + año);
    }

}
