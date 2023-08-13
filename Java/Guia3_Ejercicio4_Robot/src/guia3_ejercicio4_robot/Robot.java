package guia3_ejercicio4_robot;




public class Robot {

    private Bateria bateria;
    public boolean dormido;

    public Robot(Bateria bateria) {
        this.bateria = bateria;
        dormido = false;
    }

    
    public void avanzar(int pasos) {
        
        double consumo=pasos*0.1;
        
        
        if (!dormido && consumo<=bateria.getCarga()) {
            bateria.setCarga((int)(bateria.getCarga()-consumo));
            System.out.println("El robot avanzó " + pasos + " pasos");
            bateriaActual();
          
            System.out.println("");

        }else{
            System.out.println("\033[31m" + "El robot no tiene suficiente bateria para avanzar esa cantidad de pasos" + "\033[0m");
        }
    }

    public void retroceder(int pasos) {
        double consumo=pasos*0.1;
        
        
        if (!dormido && consumo<=bateria.getCarga()) {
            bateria.setCarga((int)(bateria.getCarga()-consumo));
            System.out.println("El robot retrocedió " + pasos + " pasos");
            bateriaActual();
            
            System.out.println("");
            
        }else{
            System.out.println("\033[31m" + "El robot no tiene suficiente bateria para retroceder esa cantidad de pasos" + "\033[0m");
        }
    }

    public void dormir() {
        dormido=true;
        System.out.println("ESTADO DEL ROBOT: " + "\033[31m" + "DORMIDO" + "\033[0m");
    }

    public void despertar() {
        dormido=false;
        System.out.println("ESTADO DEL ROBOT:" + "\033[32m" + "DESPIERTO" + "\033[0m");
        
    }

    public void recargar() {
        bateria.setCarga(1000);
        bateriaActual();
    }

    public boolean bateriaLlena() {
         return bateria.getCarga()==1000;
    }

    public boolean bateriaVacia() {
        return bateria.getCarga()==0; 
    }

    public void bateriaActual() {
        
        bateria.getCarga();
        
        //DIBUJO BATERIA
        if ((int)(bateria.getCarga()/10)<=10) {
            System.out.print("\033[31m" + (int)(bateria.getCarga()/10) + "% " + "\033[0m");
            
        }else{
            System.out.print((int)(bateria.getCarga()/10) + "% ");
        }
        
        
        
        for (int i = 0; i < (int) (bateria.getCarga() / 100); i++) {

            if (bateria.getCarga() >= 500) {
                System.out.print("\033[42;32m" + " " + "\033[0m" + " ");
            } else {
                System.out.print("\033[41;31m" + " " + "\033[0m" + " ");
            }

        }
        for (int i = (int) (bateria.getCarga() / 100); i < 10; i++) {
            System.out.print("\033[47;37m" + " " + "\033[0m" + " ");

        }
        System.out.println("");
        
        //FIN DIBUJO BATERIA
   
    }
}
