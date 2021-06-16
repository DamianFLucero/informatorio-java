package Ejercicio5;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ClaseEmpleados {
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private float sueldo;

    public ClaseEmpleados(String nombre, String apellido, String fechaNac, String sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = LocalDate.parse(fechaNac, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.sueldo = Float.parseFloat(sueldo);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return apellido;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = LocalDate.parse(fechaNac, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public int getEdad() {
        Period periodo = Period.between(this.fechaNac, LocalDate.now());
        return periodo.getYears();
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    public float getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return apellido + " " + nombre + " - " + fechaNac.toString() + " - $" + sueldo;
    }
}
