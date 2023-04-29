/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicio;
import java.util.Scanner;
import Entidad.Libro;
/**
 Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
public class ServiciosLibro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");  
    
    public  Libro crearLibro(){
        
        System.out.println("Ingrese el ISBN");
        String ISBN = leer.next();
        System.out.println("Ingrese Titulo");
        String titulo = leer.next();
        System.out.println("Ingrese Autor");
        String autor = leer.next();
        System.out.println("Ingrese Numero paginas");
        int paginas = leer.nextInt();
        return new Libro(ISBN, titulo, autor, paginas);
    }
    
    
    public void mostrarLibro(Libro libro){
        System.out.println(libro.getISBN()); 
        System.out.println(libro.getTitulo()); 
        System.out.println(libro.getAutor());   
        System.out.println(libro.getNumeroPaginas()); 
    }
    

}


