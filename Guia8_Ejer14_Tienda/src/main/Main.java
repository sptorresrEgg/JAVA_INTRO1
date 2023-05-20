/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import ServiciosMovil.ServiciosMovil;
import entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiciosMovil sm = new ServiciosMovil();
        
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int []codigo = new int [6];
        System.out.println("Ingrese Marca del Celular");
        String marca = leer.next();
        System.out.println("Ingrese El precio del celular");
        int precio = leer.nextInt();
        System.out.println("Ingrese el modelo del celular");
        String modelo = leer.next();
        System.out.println("Ingrese la memoria del celular");
        int memoria = leer.nextInt();
        System.out.println("Ingrese el almacenamiento del celular");
        int almacenamiento = leer.nextInt();
        Movil m1= sm.cargarCelular(marca, precio, modelo, memoria, almacenamiento);
        sm.cargarCodigo(m1);
        
        m1.mostrarCodigo();
        
    }
    
}
