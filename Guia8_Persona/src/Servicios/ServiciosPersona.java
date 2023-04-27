/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;
import java.util.Scanner;
import Entidad.Persona;
/**
 *
 * @author sptorresr
 */
public class ServiciosPersona {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //funcion que devuelve un objeto persona no recibe parametros, pide los datos al usuario.
    public Persona crearPersona(){
        System.out.println("Ingrese nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese edad de la persona");
        int edad = leer.nextInt();
        System.out.println("Ingrese pais de la persona");
        String pais =leer.next();
        
        Persona Persona4 = new Persona(nombre, edad, pais,false);
        
        
        return Persona4;
    }
    
    //funcion que muestra los datos de la persona que le enviemos por parametro
    public  void mostrarPersona(Persona Persona4){
        System.out.println(Persona4.toString());
}
    

    
}

