package Nivel1;
import java.util.Scanner;
/*Se desea una aplicación que solicite 2 números enteros y 
realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).*/

public class N1Ejercicio5 {
    
    public static void main (String[] arg) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese el primer número:");
            int a = scan.nextInt();
            System.out.println("Ingrese el segundo número:");
            int b = scan.nextInt();
            scan.close();
            
            int resultado = 0;
            for (int i=1; i != b; i++){
                resultado = resultado + a;
            }
            System.out.println("Resultado:"+(resultado+a));
    }
}
