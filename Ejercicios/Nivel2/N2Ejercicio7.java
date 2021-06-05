package Nivel2;
import java.util.*;
/*Crear una función que dado 2 argumentos (int, siendo el primero menor al
segundo), nos devuelva un array de Strings. Con la secuencia de números
enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
“FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4

Input (Entrada):
fizzBuzzFuncion(1,6) // 6 si marca el límite y no se lo incluye
fizzBuzzFuncion(1,8)

Output (Salida):
[“1”, “Fizz”, “Buzz”, “Fizz”, 5]
[“1”, “Fizz”, “Buzz”, “Fizz”, 5, “FizzBuzz”, 7] */

public class N2Ejercicio7 {
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();     
    }

    public static void verMultiplos (int n, int m){
        List<Integer> listaNumeros = new ArrayList<Integer>();
        if(n < m){
            for (int i = n; i < m; i++){
                listaNumeros.add(i);
            }
        }else{
            clearScreen();
            System.out.print("Error! El primer numero debe ser menor al mayor");
        }

        String[] resultado = new String[listaNumeros.size()];
        for (int i=0;i<listaNumeros.size();i++){
            if (listaNumeros.get(i) % 2 == 0 && listaNumeros.get(i) % 3 == 0) {
                resultado[i] = "FizzBuzz"; 
            } 
            else if (listaNumeros.get(i) % 3 == 0) {
                resultado[i] = "Buzz";
            }
            else if (listaNumeros.get(i) % 2 == 0) {
                resultado[i] = "Fizz";
            } else {
                String numero = String.valueOf(listaNumeros.get(i));
                resultado[i] = numero;
            }
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(resultado));
    }
    public static void main (String[] arg) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el número menor:");
        int a = scan.nextInt();
        System.out.println("Ingrese el número mayor:");
        int b = scan.nextInt();
        scan.close();

        verMultiplos(a, b);
    }
}
