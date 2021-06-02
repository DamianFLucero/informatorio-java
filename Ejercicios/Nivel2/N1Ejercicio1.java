package Nivel2;
import java.util.*;
/*Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego
imprimir por pantalla el ranking*/

public class N1Ejercicio1 {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();     
    }
    public static void main (String[] arg) {

    List<String> ciudad = new ArrayList<String>();

    Scanner scan = new Scanner(System.in);
    int posicion = 1;
    for (int i=0;i<3;i++){
        System.out.println("Ingrese "+posicion+"° ciudad favorita:");
        String respuesta = scan.nextLine();
        ciudad.add(respuesta);
        posicion++;
        }
    scan.close();

    clearScreen();

    System.out.println("Ranking de ciudades favoritas:");
    int posicionRespuesta = 1;
    for (int i=0;i<3;i++){
        System.out.println("#"+posicionRespuesta+" - "+ciudad.get(i));
        posicionRespuesta++;
        }
    }
}
