package Ejercicio5;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Ejercicio5Main {

    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();     
    }

    public static void enterContinuar() { 
        System.out.println("\nEnter para continuar");
        try {
            System.in.read();
        }  
        catch(Exception e) { }  
    }
    public static void main(String args[]) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            limpiarConsola();
            System.out.print("Seleccione opción:\n");
            System.out.print("1 - Para ver empleados de apellido que comience con...\n");
            System.out.print("2 - Para ver empleados de nombre que comience con...\n");
            System.out.print("3 - Para ver empleados más joven y más longevo\n");
            System.out.print("4 - Para ver empleados con menor y mayor sueldo\n");
            System.out.print("5 - Para ver empleados ordenados alfabéticamente\n");
            System.out.print("6 - Para salir\n");
            System.out.print("\nOpción: ");
            int opcion = scan.nextInt();
            limpiarConsola();
            
            switch (opcion) {
                case 1:
                    //Probar con "L"
                    UtilEmpleados.porApellido(definirEmpleados());
                    break;
                case 2:
                    //Probar con "C"
                    UtilEmpleados.porNombre(definirEmpleados());
                    break;
                case 3:
                    UtilEmpleados.mayorMenorEdad(definirEmpleados());
                    break;
                case 4:
                    UtilEmpleados.sueldoAltoBajo(definirEmpleados());
                    break;
                case 5:
                    UtilEmpleados.ordenarPorApellido(definirEmpleados());
                    break;
                case 6:
                    salir=true;
                    break;
                default:
                    System.out.println("Error");
                    enterContinuar();
            }
        }
    scan.close();
    }

    public static List<ClaseEmpleados> definirEmpleados() throws IOException {
        List<ClaseEmpleados> listaEmpleados = new ArrayList<>();
        String[] empleados;
        String path = "D:/RepositorioInfo/informatorio-java/Ejercicios/Ejercicio5/ListaEmpleados.txt";
        
        try (BufferedReader r = new BufferedReader(new FileReader(path))) {
            String linea = r.readLine();
            
            while(linea != null){
                empleados = linea.split(",");
                linea = r.readLine();
                listaEmpleados.add(new ClaseEmpleados(empleados[0], empleados[1], 
                empleados[2], empleados[3]));
            }
        return listaEmpleados;
        }
    }
}
