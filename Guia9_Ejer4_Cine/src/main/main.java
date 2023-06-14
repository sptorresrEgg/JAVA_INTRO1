/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Pelicula;
import java.util.ArrayList;
import servicios.ServiciosPelicula;

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
        ServiciosPelicula sp = new ServiciosPelicula();
        ArrayList<Pelicula> listaPeliculas=sp.crearListaPeliculas();
        System.out.println("..........................");
        System.out.println("Listado de peliculas");
        System.out.println("..........................");
        sp.mostrarPeliculas(listaPeliculas);
        System.out.println("..........................");
        System.out.println("Peliculas con duración mayor a 1");
        sp.mayorUnaHora(listaPeliculas);
        System.out.println("..........................");
        System.out.println("Peliculas ordenadas de mayor a menor por duracion");
        sp.deMayorAMenor(listaPeliculas);
        System.out.println("..........................");
        System.out.println("Peliculas ordenadas de menor a mayor por duracion");
        sp.deMenorAMayor(listaPeliculas);
        System.out.println("..........................");
        System.out.println("Peliculas ordenadas por titulo alfabeticamente");
        sp.ordenarPorTitulo(listaPeliculas);
        System.out.println("..........................");
        System.out.println("Peliculas ordenadas por director alfabeticamente");
        sp.ordenarPorDirector(listaPeliculas);
        
        
    }
    
}
