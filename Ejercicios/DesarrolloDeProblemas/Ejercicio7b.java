package DesarrolloDeProblemas;
import java.util.Scanner;
/*En base a los ejercicios 2 al 4, modificar los programas para que 
separe la lógica de negocio (cálculo aritmético, procesamiento, etc) en funciones. */


public class Ejercicio7b{
    
    private static void clearScreen() {
        //Limpia consola
        System.out.print("\033[H\033[2J");
        System.out.flush();     
    }

    private static String descripcion = "Ingrese la nota para saber calificación:";
        //Consigna del sistema
    public static void main (String[] args) {
        //Ingreso de nota
        System.out.println(descripcion);
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt();
        scan.close();
        clearScreen();
        String calificacionFinal = calificacion(nota);
        System.out.println("Calificación final: "+calificacionFinal);
    }

    private static String calificacion(int nota) {
        //Devuelve calificación
        if (nota < 0 || nota > 100) {
            return "Fuera de rango";
        } else if (nota > 92) {
            return "Excelente";
        } else if (nota > 84) {
            return "Sobresaliente";
        } else if (nota > 74) {
            return "Distinguido";
        } else if (nota > 59) {
            return "Bueno";
        } else {
            return "Desaprobado";
        }
    }
}