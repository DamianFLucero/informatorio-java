package DesarrolloDeProblemas;
import java.util.Scanner;
/*En base a los ejercicios 2 al 4, modificar los programas para que 
separe la lógica de negocio (cálculo aritmético, procesamiento, etc) en funciones. */


public class Ejercicio7a{
    
    private static void clearScreen() {
        //Limpia consola
        System.out.print("\033[H\033[2J");
        System.out.flush();     
    }

    private static String descripcion = "Para imprimir tres números\n";
        //Consigna del sistema
    public static void main (String[] args) {
        //Ingreso de números
        System.out.print(descripcion);
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int a = scan.nextInt();
        System.out.println("Ingrese el segundo número:");
        int b = scan.nextInt();
        System.out.println("Ingrese el tercer número:");
        int c = scan.nextInt();
        scan.close();
        clearScreen();
        impresion(a, b, c);
    }

    private static void impresion(int a, int b, int c){
        //Imprime 
        System.out.println("El primer número ingresado es: " + a);
        System.out.println("El segundo número ingresado es: " + b);
        System.out.println("El tercer número ingresado es: " + c);
    }
}