/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;
import java.util.Scanner;
import Entidad.Libro;
import Servicio.ServiciosLibro;
/**
 
 */
public class main {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        // TODO code application logic here
      ServiciosLibro sl = new ServiciosLibro();
      ServiciosLibro s2 = new ServiciosLibro();
      
      Libro libro1 = sl.crearLibro();
      Libro libro2 = s2.crearLibro();
      
      sl.mostrarLibro(libro1);
      //sl=null; 
      s2.mostrarLibro(libro2);  
      //s2=null;  
        
      
    }

}

