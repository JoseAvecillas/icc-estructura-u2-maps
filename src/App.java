import java.util.Arrays;

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoTreeMap;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Jose Avecillas"); /// Cambiar por su nombre

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
         runEjerccios();
    }

    private static void runMapExamlpe() {
        // Mapa mapa = new Mapa();
        // System.out.println("----Practica Hashmap----");
        // mapa.runHashMap();
        // System.out.println("---------------------------------------------------------");
        // System.out.println("----Practica Linked Hashmap----");
        // mapa.runLinkedHashMap();
        // System.out.println("---------------------------------------------------------");
        // System.out.println("----Practica TreeMap----");
        // mapa.runTreeMap();
        // System.out.println("---------------------------------------------------------");
        // System.out.println("----Practica HashMapObj----");
        // mapa.runHashMapObj();
        // System.out.println("---------------------------------------------------------");
        // System.out.println("----Practica TreeMapObj----");
        // mapa.runTreeMapObj();
    }

    private static void runEmpleadoExample() {
        
        // EmpleadoDAO empleadoDAOTree = new EmpleadoTreeMap(); 
        // EmpleadoContoller empleadoContollerTree = new EmpleadoContoller(empleadoDAOTree);
        // EmpleadoDAO empleadoDaoHash = new EmpleadoDAOHashMap(); 
        // EmpleadoContoller empleadoContollerHashMap = new EmpleadoContoller(empleadoDaoHash);

        // Empleado emp1 = new Empleado(4, "Pedro", "DEV");
        // Empleado emp2 = new Empleado(2, "Pedro", "DEV");
        // Empleado emp3 = new Empleado(5, "Juan", "DEV");
        // Empleado emp4 = new Empleado(3, "Maria", "DEV");
        // Empleado emp5 = new Empleado(1, "Juan", "DEV");

        // Agregar a ambos DAOs
        // System.out.println("== Agregando empleados a TreeMap ==");
        // empleadoContollerTree.agregarEmpleado(emp1);
        // empleadoContollerTree.agregarEmpleado(emp2);
        // empleadoContollerTree.agregarEmpleado(emp3);
        // empleadoContollerTree.agregarEmpleado(emp4);
        // empleadoContollerTree.agregarEmpleado(emp5);

        // System.out.println("\n== Agregando empleados a HashMap ==");
        // empleadoContollerHashMap.agregarEmpleado(emp1);
        // empleadoContollerHashMap.agregarEmpleado(emp2);
        // empleadoContollerHashMap.agregarEmpleado(emp3);
        // empleadoContollerHashMap.agregarEmpleado(emp4);
        // empleadoContollerHashMap.agregarEmpleado(emp5);

        // // Eliminar en ambos
        // System.out.println("\n== Eliminando ID 2 en TreeMap ==");
        // empleadoContollerTree.eliminarEmpleado(2);

        // System.out.println("\n== Eliminando ID 2 en HashMap ==");
        // empleadoContollerHashMap.eliminarEmpleado(2);

        // // Mostrar listas actualizadas
        // System.out.println("\n== TreeMap después de eliminar ==");
        // empleadoContollerTree.mostrarEmpleados();

        // System.out.println("\n== HashMap después de eliminar ==");
        // empleadoContollerHashMap.mostrarEmpleados();
    }

    private static void runEjerccios() {
        System.out.println("\n----Ejercicios ----");
        // Ejercicio 1
        System.out.println("Ejercicio 1:");
        System.out.println("Ejercicio 1: ¿Son anagramas?");
        System.out.println("listen & silent => " + Ejercicios.areAnagrams("listen", "silent"));     
        System.out.println("hello & bello => " + Ejercicios.areAnagrams("hello", "bello"));        
        System.out.println("triangle & integral => " + Ejercicios.areAnagrams("triangle", "integral"));
        // Ejercicio 2 
        System.out.println("\nEjercicio 2: Sumatoria de dos");
        int[] resultado1 = Ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
        int[] resultado2 = Ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 10);
        System.out.print("Input: [9, 2, 3, 6], objetivo = 5 → ");
        System.out.println(resultado1 != null ? Arrays.toString(resultado1) : "null");
        System.out.print("Input: [9, 2, 3, 6], objetivo = 10 → ");
        System.out.println(resultado2 != null ? Arrays.toString(resultado2) : "null");
        // Ejercicio 3 
        System.out.println("\nEjercicio 3: Contar caracteres");
        Ejercicios.contarCaracteres("hola");
        Ejercicios.contarCaracteres("banana");
        // Ejercicio 4
        System.out.println("\nEjercicio 4: ¿Son anagramas? (versión 2)");
        System.out.println("roma & amor → " + Ejercicios.sonAnagramas("roma", "amor")); 
        System.out.println("roma & ramo → " + Ejercicios.sonAnagramas("roma", "ramo")); 
        System.out.println("roma & rana → " + Ejercicios.sonAnagramas("roma", "rana")); 
        
    }
}
