package DesarrolloDeProblemas;
import java.util.Scanner;
/*En base a los ejercicios 2 al 4, modificar los programas para que 
separe la lógica de negocio (cálculo aritmético, procesamiento, etc) en funciones. */


public class Ejercicio7c{
    
    private static void clearScreen() {
        //Limpia consola
        System.out.print("\033[H\033[2J");
        System.out.flush();     
    }

    private static String descripcion = "Ingrese número para saber su día de la semana:";
        //Consigna del sistema
    public static void main (String[] args) {
        //Ingreso de nota3
        System.out.println(descripcion);
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt();
        scan.close();
        clearScreen();
        String respuestaDia = diaSemana(dia);
        System.out.println(respuestaDia);
    }

    private static String diaSemana(int dia) {
        //Devuelve el día
        switch (dia) {
            case 1:
                return "Domingo";
            case 2:
                return "Lunes";
            case 3:
                return "Martes";
            case 4:
                return "Miércoles";
            case 5:
                return "Jueves";
            case 6:
                return "Viernes";
            case 7:
                return "Sábado";
            default:
                return "Error";
        }
    }
}