/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Raices;
import java.util.Scanner;
import serviciosraices.ServiciosRaices;

/**
 *
 * Método getDiscriminante(): devuelve el valor del discriminante (double). El
   discriminante tiene la siguiente formula: (b^2)-4*a*c
   * 
 */
public class main {

    /**
   
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosRaices sr = new ServiciosRaices();
        
        
        System.out.println("Ingrese el valor de la variable a");
        int a = leer.nextInt();
        System.out.println("Ingrese el valor de la variable b");
        int b = leer.nextInt();
        System.out.println("Ingrese el valor de la variable c");
        int c = leer.nextInt();
        Raices r1 = sr.Crear(a, b, c);
        sr.calcularRaiz(r1);
        
        
    }
    
}
