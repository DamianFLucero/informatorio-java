package Nivel2;
import java.util.*;
/* Dados 2 ArrayList que contienen horas-trabajadas (array1) y
valor-por-hora(array2) del resumen de carga de horas semanal de un
empleado. Se debe generar otra lista que contenga los totales y luego
imprimir el total final a cobrar.

Input (Entrada):
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]
## Los arrays son iguales y corresponden a los días trabajados de una
semana Lun-Vie.

Output (Salida):
[2100, 2415, 4400, 2400, 1600]
Total Final: $ 12915*/

public class N2Ejercicio5 {
    
    public static void main(String[] args) {
    List<Integer> horasTrabajadas = new ArrayList<Integer>();
    horasTrabajadas.add(6);
    horasTrabajadas.add(7);
    horasTrabajadas.add(8);
    horasTrabajadas.add(4);
    horasTrabajadas.add(5);
    List<Integer> valorXHora = new ArrayList<Integer>();
    valorXHora.add(350);
    valorXHora.add(345);
    valorXHora.add(550);
    valorXHora.add(600);
    valorXHora.add(320);

    List<Integer> totalDiario = new ArrayList<Integer>();
    for (int i=0;i<horasTrabajadas.size();i++){
        int resultado = horasTrabajadas.get(i) * valorXHora.get(i);
        totalDiario.add(resultado);
        }

    int totalFinal = 0;
    for (int i=0;i<totalDiario.size();i++){
        totalFinal += totalDiario.get(i);
        }

    System.out.println("Total diario:");
    System.out.println(totalDiario);
    System.out.println(" ");
    System.out.println("Total final:");
    System.out.println("$ "+totalFinal);

    }
}