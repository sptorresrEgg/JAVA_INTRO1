/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Mascotas;
import entidad.Personas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class ServiciosPersonas {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Personas> crearPersona(){
        ArrayList<Personas> persona = new ArrayList();
        do{
            System.out.println("Ingrese el nombre");
            String nombre = leer.next();
            System.out.println("Ingrese apellido");
            String apellido = leer.next();
            System.out.println("Ingrese la edad");
            int edad = leer.nextInt();
            System.out.println("Ingrese el dni");
            int dni = leer.nextInt();
            Personas p1 = new Personas(nombre, apellido, edad, edad);
            persona.add(p1);
            System.out.println("Desea ingresar otra persona s/n");
        }while(leer.next().equalsIgnoreCase("S"));
        return persona;
    }
    
    public void adoptarPerro(ArrayList<Personas> persona, ArrayList<Mascotas> mascota, HashMap<Personas,Mascotas> adoptar){
        
        System.out.println("----------Listado de Mascotas----------");
        for (Mascotas mascotas : mascota) {
            System.out.println(mascotas);
        }
        System.out.println("---------------------------------------");
        
        System.out.println("----------Listado de Personas----------");
        for (Personas personas : persona) {
            System.out.println(personas);
        }
        System.out.println("---------------------------------------");
        
        Iterator<Personas> itper = persona.iterator();
        Iterator<Mascotas> itmascota = mascota.iterator();
        while(itper.hasNext()){
            Personas per = persona.get(0);
            System.out.println("Ingresa el perro que desea adoptar");
            String masBuscar = leer.next();
            
        }
        
    }
    
}
