/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Mascotas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class ServiciosMascotas {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Mascotas> crearMascota(){
        ArrayList<Mascotas> mascota = new ArrayList();
        do{
            System.out.println("Ingrese el nombre de la mascota");
            String nombre = leer.next();
            System.out.println("Ingrese la raza");
            String raza = leer.next();
            System.out.println("Ingrese la edad");
            int edad = leer.nextInt();
            System.out.println("Ingrese el tamaño");
            String tamanio = leer.next();
            Mascotas ma1 = new Mascotas(nombre, raza, edad, tamanio);
            mascota.add(ma1);
            System.out.println("Desea ingresar otra mascota s/n");
        }while(leer.next().equalsIgnoreCase("S"));
        return mascota;
    }
    
}
