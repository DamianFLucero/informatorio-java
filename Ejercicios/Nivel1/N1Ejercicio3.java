package Nivel1;
import java.util.Scanner;
/*Confeccionar un programa que dado un número entero como dato de entrada
imprima la secuencia de números (incrementos de 1) de la siguiente forma:
(Imput 5):

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

public class N1Ejercicio3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero de filas/columnas: ");
        int filas= scan.nextInt();
        scan.close();
        
        for (int f=1; f<=filas; f++){
            System.out.println();
            for (int c=1; c<=f; c++){
                System.out.print(" "+c);
            }
        }
    }
}