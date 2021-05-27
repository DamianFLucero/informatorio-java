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
        diaSemana(dia);
    }

    private static void diaSemana(int dia) {
        switch (dia) {
            case 1:
            System.out.println("Domingo");
            break;
            case 2:
            System.out.println("Lunes");
            break;
            case 3:
            System.out.println("Martes");
            break;
            case 4:
            System.out.println("Miércoles");
            break;
            case 5:
            System.out.println("Jueves");
            break;
            case 6:
            System.out.println("Viernes");
            break;
            case 7:
            System.out.println("Sábado");
            break;
        }
    }
}