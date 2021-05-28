package DesarrolloDeProblemas;
import java.util.Scanner;
/*Desarrollar un programa que dado un número entero ingresado, 
nos retorne los valores de ese número multiplicado por 1, 2, 3, … y 10.*/


public class Ejercicio5 {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();     
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        int numero = scan.nextInt();
        scan.close();
        clearScreen();

    System.out.println("Tabla del "+numero+":");
    for (int i = 1; i != 11; i++) {
        System.out.println(numero+" x "+i+" = "+numero*i);
        }
    }
}
