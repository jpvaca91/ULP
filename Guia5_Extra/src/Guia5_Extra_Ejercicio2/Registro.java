package Guia5_Extra_Ejercicio2;

public class Registro {

    private Datos[][] registro = new Datos[12][3];
    private final String[] provincia = {"San Luis", "Merlo", "Villa Mercedez"};
    private final String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    public Registro() {
    }

    public void agregarDato(String provincia, String meses, Datos datos) {
        int f = 0;
        int c = 0;

        for (String datoses : this.provincia) {
            if (datoses.equalsIgnoreCase(provincia)) {
                break;
            }
            c++;
        }
        for (String mese : this.meses) {
            if (mese.equalsIgnoreCase(meses)) {
                break;
            }
            f++;
        }
        registro[f][c] = datos;

    }

    public double mayorPromedio() {
        double mayorValor = Double.MIN_VALUE;
        try {
            for (Datos[] datoses : registro) {
                for (Datos datose : datoses) {
                    if (datose.getMilimetrosCaidos() > mayorValor && datose != null) {
                        mayorValor = datose.getMilimetrosCaidos();
                    }
                }

            }
        } catch (NullPointerException e) {

        }
        /* for (Datos[] datoses : registro) {
            for (Datos datose : datoses) {
                if (datose.getMilimetrosCaidos()>mayorValor && datose!=null) {
                    mayorValor=datose.getMilimetrosCaidos();                    
                }
            }
            
        }*/
        return mayorValor;

    }

    public double mayorPromedioLocalidad(String provincia) {

        double mayorValor = Double.MIN_VALUE;
        int c = 0;
        try {
            for (String datoses : this.provincia) {
                if (datoses.equalsIgnoreCase(provincia)) {
                    break;
                }
                c++;
            }
            for (int i = 0; i < 12; i++) {
                if (registro[i][c].getMilimetrosCaidos() > mayorValor && registro[i][c] != null) {
                    mayorValor = registro[i][c].getMilimetrosCaidos();
                }
            }

        } catch (NullPointerException e) {
        }

        /* for (String datoses : this.provincia) {
            if (datoses.equalsIgnoreCase(provincia)) {
                break;
            }
            c++;
        }
        for(int i =0 ; i<12;i++){
             if (registro[i][c].getMilimetrosCaidos()>mayorValor && registro[i][c]!=null) {
                    mayorValor=registro[i][c].getMilimetrosCaidos();                   
              }
        }*/
        return mayorValor;

    }

    @Override
    public String toString() {
        String aux = "";
        try {

            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 3; j++) {
                    if (registro[i][j] != null) {
                        aux += (registro[i][j] + " ");
                    }
                }
                System.out.println("");
            }

        } catch (NullPointerException e) {
        }

        return aux;
    }

}
