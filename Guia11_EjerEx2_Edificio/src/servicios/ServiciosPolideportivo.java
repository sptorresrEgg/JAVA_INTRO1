/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class ServiciosPolideportivo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Polideportivo p1 = new Polideportivo();
    
    public void crearEdificioOficinas(){
        System.out.println("Ingrese el ancho del edificio");
        p1.setAncho(leer.nextInt());
        System.out.println("Ingrese el alto del edificio");
        p1.setAlto(leer.nextInt());
        System.out.println("Ingrese el largo del edificio");
        p1.setLargo(leer.nextInt());
        System.out.println("Ingrese el nombre del polideportivo");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el tipo de polideportivo (Techado / Abierto)");
        p1.setTipo(leer.next());
        
    }
    public void cantidadPorTipo(){
       
        
        System.out.println("La superficie del polideportivo " + p1.getNombre() + " es " );
        
        
    }
}
