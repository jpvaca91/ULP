package guia3.pkg2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Empleado {
    //Atributos
    private String nombre;
    private String apellido;
    private LocalDate fechaIngreso;
    private int dni;

// Creamos un objeto de la clase DateTimeFormatter para cambiar el formato de salida de Fechas.
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
//Constructor

    public Empleado(String nombre, String apellido, LocalDate fechaIngreso, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
        this.dni = dni;
    }
    
//Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    //To String
    // Un método para mostrar los datos del empleado en forma de cadena
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nFecha de ingreso: " + fechaIngreso.format(formato) + "\nDNI: " + dni;
    }
    


}
