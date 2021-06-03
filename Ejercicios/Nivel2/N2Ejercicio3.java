package Nivel2;
import java.util.*;
/*Crear una lista que contenga como elementos la numeración de cartas de una
baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en
orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el
arrayList y volver a imprimir.
Ayuda: ArrayList implementa la interface Collection, existe algún método
que me permita hacer la operación sort (mezclar) aleatoriamente? Idem
para el reverso.*/

public class N2Ejercicio3 {
    
    public static void main (String[] arg) {

    List<Integer> baraja = new ArrayList<Integer>();
    int numero = 2;
    for (int i=0;i<9;i++){
        baraja.add(numero);
        numero++;
    }

    System.out.print("Baraja: ");
    for (int i=0;i<baraja.size();i++) {
        System.out.print(" "+baraja.get(i));
        }

        System.out.println(" ");
        //System.out.println("Para ver la baraja al inverso presione 'Enter'");
        Scanner enter = new Scanner(System.in);
        String continuar;
    try {
        System.out.println("Para ver la baraja al inverso presione 'Enter'");
        continuar = enter.nextLine();
        System.out.print("Baraja inversa: ");
        for (int i = baraja.size()-1;i>=0;i--) {
            System.out.print(" "+baraja.get(i));
        }
        System.out.println(" ");
        System.out.println("Para mezclar la baraja presione 'Enter'");
        }   
    catch(Exception e) { }

    try {
        continuar = enter.nextLine();
        Collections.shuffle(baraja);
        System.out.print("Baraja mezclada: ");
        for (int i=0;i<baraja.size();i++){
            System.out.print(" "+baraja.get(i));
        }
    enter.close();
    }   
    catch(Exception e) { }  
    }
}
