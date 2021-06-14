package Ejercicio5;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmpleadosUtils {

    public static void creaEmpleados() throws IOException {
        
        List<Empleados> listaEmpleados = new ArrayList<>();
        String[] empleados;
        String path = "D:/RepositorioInfo/informatorio-java/Ejercicios/Ejercicio5/ListaEmpleados.txt";
        
        try (BufferedReader r = new BufferedReader(new FileReader(path))) {
            String linea = r.readLine();

            while(linea != null){
                empleados = linea.split(",");
                linea = r.readLine();
                listaEmpleados.add(new Empleados(empleados[0], empleados[1], empleados[2], empleados[3]));
            }
        }
    }
}
