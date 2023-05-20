/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Persona;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
* 
* Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
* 
* Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 */
public class ServiciosPersona {
    
    public Persona CrearPersona (String nombre, int anio, int mes, int dia){
       GregorianCalendar c1 = new GregorianCalendar();
       c1.set(anio, mes-1, dia, 0, 0);
       Date fecha = c1.getTime();
       return new Persona(nombre, fecha);
    }
    
     public int CalcularEdad (Persona p1){
         Date fechaActual = new Date();
         int anios = (int) ((fechaActual.getTime() - p1.getFechaNacimiento().getTime()) / (1000 * 60 * 60 * 24 * 365.25));
         return anios;
     }
     public boolean menorQue(Persona p1,int edad ){
        int edadPersona = CalcularEdad (p1);
         
        
         if(edad < edadPersona)
         {  
            return true ;
         }else {
                 return false;
                }
         
         
     }  
     public void mostrarPersona(Persona p1){
         System.out.println(p1.toString());
         
     }
    
}
