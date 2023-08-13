package guia3_ejer4;

public class Persona {

    private String humano;
    private Robot robotito;

    public Persona(String humano) {
        this.humano = humano;
    }

    public void adoptarRobot (Robot robotito) {
        this.robotito = robotito;
    }

    public void jugarConRobot() {
        robotito.avanzar(500);
        robotito.retroceder(20);
        robotito.energiaActual();
        robotito.dormir();
    }

}
