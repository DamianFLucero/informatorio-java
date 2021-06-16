package Ejercicio5;
import java.util.*;
import java.util.function.BiConsumer;

public class UtilEmpleados {

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

    public static void porApellido (List<ClaseEmpleados> listaEmpleados) {

        limpiarConsola();
        System.out.print("Para buscar empleado por apellido:\nIngrese letra: ");
        Scanner scan = new Scanner(System.in);
        String letraA = scan.nextLine();
        String mayus = letraA.toUpperCase();
        char carac = mayus.charAt(0);
        limpiarConsola();
        System.out.print("Empleados de apellido comenzado con '"+ mayus + "':\n\n");
        for(int i = 0; i < listaEmpleados.size(); i++) {
            String apellido = listaEmpleados.get(i).getApellido();
            if (apellido.charAt(0) == carac) {
                System.out.print(listaEmpleados.get(i).getApellido() + " ");
                System.out.print(listaEmpleados.get(i).getNombre() + " - ");
                System.out.print(listaEmpleados.get(i).getFechaNac() + " - $");
                System.out.print(listaEmpleados.get(i).getSueldo() + "\n");
            }
        }
        enterContinuar();
    }

    public static void porNombre (List<ClaseEmpleados> listaEmpleados) {

        limpiarConsola();
        System.out.print("Para buscar empleado por nombre:\nIngrese letra: ");
        Scanner scan = new Scanner(System.in);
        String letraN = scan.nextLine();
        String mayus = letraN.toUpperCase();
        char carac = mayus.charAt(0);
        limpiarConsola();
        System.out.print("Empleados de nombre comenzado con '"+ mayus + "':\n\n");
        for(int i = 0; i < listaEmpleados.size(); i++) {
            String nombre = listaEmpleados.get(i).getNombre();
            if (nombre.charAt(0) == carac) {
                System.out.print(listaEmpleados.get(i).getNombre() + " ");
                System.out.print(listaEmpleados.get(i).getApellido() + " - ");
                System.out.print(listaEmpleados.get(i).getFechaNac() + " - $");
                System.out.print(listaEmpleados.get(i).getSueldo() + "\n");
            }
        }
        enterContinuar();
    }

    public static Map<String, ClaseEmpleados> mayorMenorEdad (List<ClaseEmpleados> empleados) {

        limpiarConsola();
        Map<String, ClaseEmpleados> empleadosEdad = new HashMap<>();
        empleados.sort(Comparator.comparing(ClaseEmpleados::getEdad));
        empleadosEdad.put("Empleado más joven: ", empleados.get(0));
        empleadosEdad.put("Empleado más longevo: ", empleados.get(empleados.size() - 1));
        BiConsumer<String, ClaseEmpleados> biconsumer = (key, val) -> 
		System.out.println(key + val);
		empleadosEdad.forEach(biconsumer);
        enterContinuar();
        return empleadosEdad;
    }

    public static Map<String, ClaseEmpleados> sueldoAltoBajo (List<ClaseEmpleados> empleados) {

        limpiarConsola();
        Map<String, ClaseEmpleados> empleadosSuel = new HashMap<>();
        empleados.sort(Comparator.comparing(ClaseEmpleados::getSueldo));
        empleadosSuel.put("Sueldo más bajo: ", empleados.get(0));
        empleadosSuel.put("Sueldo más alto: ", empleados.get(empleados.size() - 1));
        BiConsumer<String, ClaseEmpleados> biconsumer = (key, val) -> 
		System.out.println(key + val);
		empleadosSuel.forEach(biconsumer);
        enterContinuar();
        return empleadosSuel;
    }

    public static List<ClaseEmpleados> ordenarPorApellido(List<ClaseEmpleados> empleados) {

        limpiarConsola();
        empleados.sort(Comparator.comparing(ClaseEmpleados::getApellido).thenComparing(ClaseEmpleados::getNombre));
        empleados.forEach(System.out::println);
        enterContinuar();
        return empleados;
    }
}