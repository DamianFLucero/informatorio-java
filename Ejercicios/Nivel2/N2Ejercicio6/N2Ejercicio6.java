package Nivel2.N2Ejercicio6;
import java.util.*;
/*Se dispone de una lista de Empleados, de cada empleado se conoce:
○ Nombre y Apellido
○ DNI
○ horasTrabajadas
○ valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el
sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
(value) es el sueldo calculado.*/

public class N2Ejercicio6 {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Pauluzzi Jonathan", 35938501, 6, 350);
        Empleado emp2 = new Empleado("Orecchia Geraldine", 17846306, 7, 345);
        Empleado emp3 = new Empleado("Farias Thiago", 25134457, 8, 550);
        Empleado emp4 = new Empleado("Conde Romina", 33091002, 4, 600);
        Empleado emp5 = new Empleado("Vazquez Agustina", 37489211, 5, 320);

        Set<Empleado> empleados = new HashSet<Empleado>();
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);
        empleados.add(emp5);

        Map<Integer, Integer> sueldo = new HashMap<>();
        sueldo.put(emp1.getDNI(), emp1.getSueldo());
        sueldo.put(emp2.getDNI(), emp2.getSueldo());
        sueldo.put(emp3.getDNI(), emp3.getSueldo());
        sueldo.put(emp4.getDNI(), emp4.getSueldo());
        sueldo.put(emp5.getDNI(), emp5.getSueldo());

        System.out.println("Lista empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
        
        System.out.println(" ");
        System.out.println("Sueldos por DNI:");
        System.out.println(sueldo);
    }
}

