package Nivel2.N2Ejercicio6;

public class Empleado {
    String ApellidoNombre;
    int DNI;
    int horasTrabajadas;
    int valorPorHora;

    public Empleado(String ApellidoNombre, int DNI, int horasTrabajadas, int valorPorHora){
        this.ApellidoNombre = ApellidoNombre;
        this.DNI = DNI;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return this.ApellidoNombre+"  "+String.valueOf(this.DNI+"  "+
        this.horasTrabajadas+"  "+this.valorPorHora);
    }

    public int getDNI(){
        return this.DNI;
    }

    public int getSueldo(){
        return this.horasTrabajadas * this.valorPorHora;
    }
}
