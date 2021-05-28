package Nivel1;
import java.util.Scanner;
/*Solicitar por consola el nombre del usuario 
e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”*/

public class N1Ejercicio1 {
    
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();     
    }
    public static void main (String[] arg) {

        System.out.println("Ingrese nombre:");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.next();
        scan.close();
        clearScreen();
        System.out.println("HOLA "+nombre+"!!!");
    }
}
