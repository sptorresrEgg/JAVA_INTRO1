/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        System.out.println("Ingrese el titulo de la cancion ");
        String nombre = leer.next();
        System.out.println("Ingrese el Autor ");
        String autor = leer.next();
        Cancion c1 = new Cancion(nombre, autor);
        System.out.println(c1.toString());
        
    }
    
}
