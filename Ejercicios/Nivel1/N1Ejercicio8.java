package Nivel1;
import java.util.*;
/*Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}*/

public class N1Ejercicio8 {
    public static void main (String[] arg) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese:\n\nNombre y apellido:");
            String nombre = scan.nextLine();
            System.out.println("Edad:");
            String edad = scan.nextLine();
            System.out.println("Dirección:");
            String direccion = scan.nextLine();
            System.out.println("Ciudad:");
            String ciudad = scan.nextLine();
            scan.close();
            String output = String.format("\n\n%s - %s - %s - %s", ciudad, direccion, edad, nombre);
            System.out.println(output);
    }
}
