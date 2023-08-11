package guia3_ejer4;

public class Robot {

    private String robot;
    private boolean dormido = false;
    private Bateria bat;

    public Robot(String robot) {
        this.robot = robot;
    }

    public String getRobot() {
        return robot;
    }

    public void setRobot(String robot) {
        this.robot = robot;
    }

    public void agregarBateria(Bateria bat) {
        this.bat = bat;
    }

    public void dormir() {
        dormido = true;
        System.out.println("El robotito se fue a mimir");

    }

    public void despertar() {
        dormido = false;
        bat.setCarga(1000);
        System.out.println("El robotito se despertó con la batería llena");
    }

    public void avanzar(int pasos) {
        if (dormido == false) {
            if (bat.getCarga() > (pasos / 10)) {
                bat.setCarga(bat.getCarga()-(pasos/10));
                System.out.println("Avanzaste " + pasos + " pasos");
                System.out.println("Te quedan "+bat.getCarga()+" de batería");
            } else {
                System.out.println("No te alcanza la bateria");
            }
        } else {
            System.out.println("El robotito está dormido, no se puede mover");
        }
    }

    public void retroceder(int pasos) {
        if (dormido == false) {
            if (bat.getCarga() > (pasos / 10)) {
                bat.setCarga(bat.getCarga()-(pasos/10));
                System.out.println("Retrocediste " + pasos + " pasos");
                System.out.println("Te quedan "+bat.getCarga()+" de batería");
            } else {
                System.out.println("No te alcanza la bateria");
            }
        } else {
            System.out.println("El robotito está dormido, no se puede mover");
        }
    }
    
    
    public void recargar() {
        bat.setCarga(1000);
        System.out.println("Se recargó la batería al 100%");
    }

    public boolean bateriaLlena() {
        return bat.getCarga() == 1000;

    }

    public boolean bateriaVacia() {
        return bat.getCarga() == 0;
    }
    
    public void energiaActual(){
        System.out.println("Tu batería tiene una carga de "+bat.getCarga());
        
    }

    
}
