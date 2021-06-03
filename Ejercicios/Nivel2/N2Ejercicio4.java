package Nivel2;
import java.util.*;
/*Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
en 3 cursos (3 arrayList) e imprimir dichos cursos.
Ayuda: ArrayList posee un método para particionar en sub-listas?*/

public class N2Ejercicio4 {

    public static void main(String[] args) {

        List<String> estudiantes = Arrays.asList(
        "Ezequiel Garay","Pablo Zabaleta","Marcos Rojo","Martín Demichelis"
        ,"Javier Mascherano","Fernando Gago","Maximiliano Rodríguez","Enzo Pérez",
        "Lionel Messi","Sergio Agüero","Ezequiel Lavezzi","Rodrigo Palacio"
        );

        List<String> cursoA = estudiantes.subList(0, 4);
        List<String> cursoB = estudiantes.subList(4, 8);
        List<String> cursoC = estudiantes.subList(8, estudiantes.size());

        System.out.println("Curso 'A': ");
        for (int i = 0; i < cursoA.size(); i++) {
            System.out.println(cursoA.get(i));
        }
        System.out.println(" ");

        System.out.println("Curso 'B': ");
        for (int i = 0; i < cursoB.size(); i++) {
            System.out.println(cursoB.get(i));
        }
        System.out.println(" ");

        System.out.println("Curso 'C': ");
        for (int i = 0; i < cursoC.size(); i++) {
            System.out.println(cursoC.get(i));
        }
        System.out.println(" ");
    }
}