package controllers;

import java.util.*;

import models.Empleado;
public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");


    }

    public void runHashMap(){
        Map<String, String> mapa= new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC");
        
        System.out.println(mapa);
        System.out.println(mapa.keySet());
       
        for(String llave: mapa.keySet()){
            System.out.println(mapa.get(llave));
        }
    }

    public void runLinkedHashMap(){
        Map<Integer,  String> mapa= new HashMap<>();
        mapa.put(1, "Jose");
        mapa.put(2, "Andres");
        mapa.put(3, "Mateo");
        mapa.put(4, "Luna");
        mapa.put(5, "Emmanuel");

        for (Integer nombre : mapa.keySet()) {
            System.out.println(mapa.get(nombre));
        }

    }
    
    public void runTreeMap(){
        Map<Integer,  String> items= new TreeMap<>();
        items.put(3, "carro");
        items.put(6, "bicicleta");
        items.put(1, "moto");
        
        for (Integer numero : items.keySet()) {
            System.out.println(items.get(numero));
        }
    }

    public void runHashMapObj(){
        Map<Empleado,  Integer> empleados= new HashMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500);
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);

        for (Empleado emp : empleados.keySet()) {
            System.out.println(empleados.get(emp));
        }
    }

    public void runTreeMapObj(){
        Map<Empleado,  Integer> empleados= new TreeMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 1200);
        empleados.put(new Empleado(1, "Juan", "Senior"), 3000);
        for (Empleado emp : empleados.keySet()) {
            System.out.println(empleados.get(emp));
        }
    }
}
