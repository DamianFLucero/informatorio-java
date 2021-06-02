package Nivel1;
import java.util.Scanner;
/*Realizar un Programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas. 
Sin uso de métodos o librerías que realicen toUppercase().*/

public class N1Ejercicio7 {
    public static void main(String[] args) {

        System.out.println("Ingrese texto: ");
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        scan.close();

        for (int e=0;e<texto.length();e++){
            char caracter = texto.charAt(e);
            int ascii = (int) caracter;
            switch (ascii){
                case 65:
                case 97: System.out.print("A"); break;
                case 66:
                case 98: System.out.print("B"); break;
                case 67:
                case 99: System.out.print("C"); break;
                case 68:
                case 100: System.out.print("D"); break;
                case 69:
                case 101: System.out.print("E"); break;
                case 70:
                case 102: System.out.print("F"); break;
                case 71:
                case 103: System.out.print("G"); break;
                case 72:
                case 104: System.out.print("H"); break;
                case 73:
                case 105: System.out.print("I"); break;
                case 74:
                case 106: System.out.print("J"); break;
                case 75:
                case 107: System.out.print("K"); break;
                case 76:
                case 108: System.out.print("L"); break;
                case 77:
                case 109: System.out.print("M"); break;
                case 78:
                case 110: System.out.print("N"); break;
                case 79:
                case 111: System.out.print("O"); break;
                case 80:
                case 112: System.out.print("P"); break;
                case 81:
                case 113: System.out.print("Q"); break;
                case 82:
                case 114: System.out.print("R"); break;
                case 83:
                case 115: System.out.print("S"); break;
                case 84:
                case 116: System.out.print("T"); break;
                case 85:
                case 117: System.out.print("U"); break;
                case 86:
                case 118: System.out.print("V"); break;
                case 87:
                case 119: System.out.print("W"); break;
                case 88:
                case 120: System.out.print("X"); break;
                case 89:
                case 121: System.out.print("Y"); break;
                case 90:
                case 122: System.out.print("Z"); break;
                case 0: System.out.print("Ñ"); break;
                //caracteres con tilde, "ñ", "Ñ" y otros valen 0.
                default: System.out.print(caracter); break;
            }
        }
    }
}
