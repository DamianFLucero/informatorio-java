package DesarrolloDeProblemas;
import java.util.*;
/*Tendremos un sistema que debe clasificar el resultado de una evaluación. 
Como dato de entrada tendremos un entero y como resultado un String de la 
clasificación de la siguiente forma:

Rango       Clasificación
93 - 100    Excelente
85 - 92     Sobresaliente
75 - 84     Distinguido
60 - 74     Bueno
00 - 59     Desaprobado */


public class Ejercicio3 {
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();     
    }

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la nota para saber calificación:");
        int nota = scan.nextInt();
        scan.close();
        
        clearScreen();
        
        if (nota < 0 || nota > 100) {
            System.out.println("Nota fuera de rango");
        } else if (nota > 92) {
            System.out.println("Excelente");
        } else if (nota > 84) {
            System.out.println("Sobresaliente");
        } else if (nota > 74) {
            System.out.println("Distinguido");
        } else if (nota > 59) {
            System.out.println("Bueno");
        } else {
            System.out.println("Desaprobado");
        }
    }
}