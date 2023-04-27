/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia8_persona;
import Entidad.Persona;
import java.util.Scanner;
import Servicios.ServiciosPersona;
/**
 
 */
public class Guia8_Persona {

    
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner leer = new Scanner(System.in);  
      /*Persona persona2;  //declaracion del objeto //vacio
      Persona persona1 = new Persona(); //asignacion en memoria para sus atributos. //vacio
      Persona persona3 = new Persona("Sandra", 25 ,"Colombia" , true ); //asigno con contructor con parametros
      
      //asigno con metodos set;
      persona1.setNombre("Claudio");
      persona1.setEdad(25);
      //instanciamos un objeto de la clase servicios*/
      ServiciosPersona servicio1 = new ServiciosPersona();
      // instanciamos un objeto de clase Persona llando la funcion del servicio crearpersona
      Persona persona4 = servicio1.crearPersona();
      //llamamos el servicio para mostrar los datos de la persona
      servicio1.mostrarPersona(persona4);
        
      
      
      //System.out.println("EL nombre es " + persona3.getNombre()+ " y nacio en " + persona3.getPais());
      //System.out.println("");
      
      //System.out.println(persona1.toString());
      //System.out.println(persona3.toString());
      //System.out.println(persona4.toString());
       
        
      
    }
    

}
