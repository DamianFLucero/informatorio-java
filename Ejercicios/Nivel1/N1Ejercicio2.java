package Nivel1;
import java.util.Scanner;
/*Realizar un programa que solicite por consola 2 números enteros. 
Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo 
(resto de la división) de ambos números.*/

public class N1Ejercicio2 {
    
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();     
    }

    public static void main (String[] arg) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese primer numero:");
        int numero1 = scan.nextInt();
        System.out.println("Ingrese segundo numero:");
        int numero2 = scan.nextInt();
        scan.close();
        clearScreen();

        System.out.println(numero1+"+"+numero2+"="+(numero1+numero2));
        System.out.println(numero1+"-"+numero2+"="+(numero1-numero2));
        System.out.println(numero1+"x"+numero2+"="+(numero1*numero2));
        System.out.println(numero1+"/"+numero2+"="+(numero1/numero2));
        System.out.println(numero1+"%"+numero2+"="+(numero1%numero2));
    }
}
