package Nivel1;
import java.util.*;

public class Prueba {
    public static void main (String[] arg) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = scan.nextInt();
        scan.close();

        int contador = 1;
        int i = 1;
        int[] repeticiones = new int[numero];
        while (numero != contador){
            repeticiones[i] = contador;
            contador++;
            i++;
            Arrays.stream(repeticiones).forEach(System.out::println);
        }
    }
}
