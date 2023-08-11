package guia3.pkg2;

public class Kiosco {

    //Declaración de Atributos
    private String nombre;
    private String direccion;
    private int cuit;
    private Empleado[] empleados; //Arreglo para guardar empleados.

    //Constructor
    public Kiosco(String nombre, String direccion, int cuit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuit = cuit;
        this.empleados = new Empleado[3];//Inicializo el arreglo con 3 espacios para Objetos "Empleado".
    }

//Método Contratar
    public void contratar(Empleado empleado) {
        boolean contratado = false;//Creo variable para saber si se pudo contratar o no.
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] == null) {
                empleados[i] = empleado;
                System.out.println("Empleado " + empleados[i].getNombre() + " " + empleados[i].getApellido() + " agregado a Kiosco.");
                contratado = true;
                break;
            }
        }
        if (!contratado) {
            System.out.println("No se puede contratar más empleados en el kiosco.");
        }
    }

//Método Contratar
    public void contratar2(Empleado empleado) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] == null) {
                empleados[0] = empleado;
                System.out.println("Empleado agregado a Kiosco correctamente.");
            }
        }
    }

    //Empleado más Antiguo...
    public void empleadoMasAntiguo() {
        Empleado mayor = null;
        for (Empleado empleado : empleados) {//Pruebo "For each" en vez de For standar.
            if (empleado != null) {
                if (mayor == null || empleado.getFechaIngreso().compareTo(mayor.getFechaIngreso()) < 0) {
                    mayor = empleado;
                }
            }
        }
        if (mayor != null) {
            System.out.println("El empleado con mayor antigüedad es:");
            System.out.println(mayor.toString());
        } else {
            System.out.println("No hay empleados en el kiosco.");
        }
    }

}
