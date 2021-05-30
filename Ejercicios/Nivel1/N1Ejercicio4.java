package Nivel1;
import java.util.Scanner;
/*Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.*/

public class N1Ejercicio4 {
    public static void main (String[] arg) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Para saber el factorial de un numero.\n Ingrese numero:");
        int numero = scan.nextInt();
        scan.close();

        int i = 1;
        int resultado = 1;
        while (i < numero || i == numero){
            resultado = resultado * i;
            i++;
        }
        System.out.println("Factorial:"+resultado);
    }
}
