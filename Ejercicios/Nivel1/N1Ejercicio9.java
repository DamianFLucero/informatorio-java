package Nivel1;
import java.util.*;
/*Dado un String de entrada (frase, texto, etc) 
calcular la cantidad de veces que aparece una letra dada.*/

public class N1Ejercicio9 {
    
    public static void main (String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese texto:");
        String texto = scan.nextLine();
        System.out.println("Ingrese que letra quiere saber cuantas veces se repite:");
        String letra = scan.next();
        scan.close();
        char letraCh = letra.charAt(0);
        int contador = 0;
        for (int i=0;i<texto.length();i++){
            char caracter = texto.charAt(i);
            if (caracter==letraCh) {
                contador++;
            }
        }
        System.out.println("La letra '"+letra+"' se repite "+contador+" veces.");
    }
}