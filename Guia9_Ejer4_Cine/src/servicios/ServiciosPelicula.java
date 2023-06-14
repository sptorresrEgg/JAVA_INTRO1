/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * En el servicio deberemos tener un bucle que crea un objeto ServiciosPelicula
 * pidiéndole al usuario todos sus datos y guardándolos en el objeto
 * ServiciosPelicula. Después, esa ServiciosPelicula se guarda una lista de
 * Peliculas y se le pregunta al usuario si quiere crear otra ServiciosPelicula
 * o no. Después de ese bucle realizaremos las siguientes acciones:
 *

 *
 * • Mostrar en pantalla todas las películas.
 * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora. 
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla. 
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla. 
 * • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla. 
 * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
public class ServiciosPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Pelicula> crearListaPeliculas() {
        ArrayList<Pelicula> listaPeliculas = new ArrayList();
        boolean valida = true;
        do {
            Pelicula peli = new Pelicula();
            System.out.println("Ingrese el nombre de la pelicula");
            peli.setTitulo(leer.next());
            System.out.println("Ingrese el director de la pelicula");
            peli.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula");
            peli.setDuracion(leer.nextInt());
            listaPeliculas.add(peli);
            System.out.println("Desea ingresar otra pelicula S/N");
            if (leer.next().equalsIgnoreCase("N")) {
                valida = false;
            }
        } while (valida);
      
        return listaPeliculas;
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> listaPeliculas){
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
    }
    //Duda para preguntar, por que llamo la lista con un get
    public void mayorUnaHora(ArrayList<Pelicula> listaPeliculas){
        for (Pelicula listaPelicula : listaPeliculas) {
            if(listaPelicula.getDuracion()>1){
                System.out.println(listaPelicula);
            }
        }
    }
    public void deMayorAMenor(ArrayList<Pelicula> listaPeliculas){
        listaPeliculas.sort(Pelicula.compararDuracion);
        mostrarPeliculas(listaPeliculas);
    }
    
    public void deMenorAMayor(ArrayList<Pelicula> listaPeliculas){
        Collections.reverse(listaPeliculas);
        //listaPeliculas.sort(Pelicula.compararDuracion);
        mostrarPeliculas(listaPeliculas);
    }
    
     public void ordenarPorTitulo(ArrayList<Pelicula> listaPeliculas){
        listaPeliculas.sort(Pelicula.compararTitulo);
        mostrarPeliculas(listaPeliculas);
    }
     
      public void ordenarPorDirector(ArrayList<Pelicula> listaPeliculas){
        listaPeliculas.sort(Pelicula.compararDirector);
        mostrarPeliculas(listaPeliculas);
    } 

}
