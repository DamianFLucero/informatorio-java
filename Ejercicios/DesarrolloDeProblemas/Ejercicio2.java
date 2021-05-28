package DesarrolloDeProblemas;
import java.util.Scanner;
/*Realizar un programa que al ejecutar se pueda ingresar 3 numeros enteros, 
para luego imprimirlos por pantalla de la siguiente manera:
El primer nro ingresado es: 4
El segundo nro ingresado es: 5
El tercer nro ingresado es: 6 */


public class Ejercicio2{
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();     
    }
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int a = scan.nextInt();
        System.out.println("Ingrese el segundo número:");
        int b = scan.nextInt();
        System.out.println("Ingrese el tercer número:");
        int c = scan.nextInt();

        clearScreen();

        System.out.println("El primer número ingresado es: " + a);
        System.out.println("El segundo número ingresado es: " + b);
        System.out.println("El tercer número ingresado es: " + c);        
        scan.close();
    }
}
