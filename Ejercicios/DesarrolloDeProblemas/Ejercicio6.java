package DesarrolloDeProblemas;
import java.util.*;
/*Debemos realizar un programa que nos realizará una pregunta 
si queremos realizar una operación dada o si deseamos salir/terminar el programa.
Utilizaremos en este caso una simple operación que nos pide un número y luego lo imprime.*/


public class Ejercicio6 {
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();     
    }
    public static void main(String[] str){
        int salida = 1;
        Scanner scan = new Scanner(System.in);
        
        while (salida == 1){
            System.out.println("Ingrese un numero: ");
            int numero = scan.nextInt();
            clearScreen();
            System.out.println("El numero ingresado es: "+numero);
            System.out.println("Para continuar ingrese 1, para salir ingrese 2.");
            salida = scan.nextInt();
            clearScreen();
        }
        scan.close();
    }
}
