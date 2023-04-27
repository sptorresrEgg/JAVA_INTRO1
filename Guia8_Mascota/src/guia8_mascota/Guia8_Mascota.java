/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia8_mascota;

import Entidad.Mascota;
import java.util.Scanner;

/**
 
 */
public class Guia8_Mascota {

    
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner leer = new Scanner(System.in);  
      //Mascota m1;  //declarado
      //Mascota m1 = new Mascota(); //nace nuestro objeto
      Mascota m1 = new Mascota("Fernando", "chiquito", "beagle");//creo objeto con valores de atributos
      
      System.out.println(m1.getApodo()+" "+ m1.getEdad() + " " +  m1.getTipo());
        System.out.println(" ");
      
      
        System.out.println("Ingrese nombre de Mascota");
        String nombre = leer.next();
        System.out.println("Ingrese Apodo de Mascota");
        String apodo = leer.next();
        System.out.println("que tipo de Mascota");
        String tipo = leer.next();
        Mascota m2 = new Mascota(nombre , apodo , tipo);
        m1.pasear(100);
        m2.pasear(100, 2);
        System.out.println("La mascota se llama " + m2.getNombre() + ", su apode es " + m2.getApodo() + " y es un " + m2.getTipo());
        
        //impresion de todos los atributos que contiene un objeto
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        
                   
        
      
      
    }

}
