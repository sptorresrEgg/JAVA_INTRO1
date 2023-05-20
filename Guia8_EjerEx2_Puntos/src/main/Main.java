/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class Main {

    /**
        calcular y devolver la distancia
        que existe entre los dos puntos que existen en la clase Puntos
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Puntos p1 = new Puntos();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese las coordenadas del primer punto, primero x y enter para ingresar y");
        p1.setX1(leer.nextInt());
        p1.setY1(leer.nextInt());
        System.out.println("Ingrese las coordenadas del segundo punto, primero x y enter para ingresar y");
        p1.setX2(leer.nextInt());
        p1.setY2(leer.nextInt());
        calcular(p1);
        
        
    }
    
    public static void calcular(Puntos p1){
        double distancia;
        distancia = Math.sqrt((Math.pow((p1.getX2()- p1.getX1()),2))+(Math.pow((p1.getY2()- p1.getY1()),2)));
        System.out.println("La distancia entre los dos puntos es "+ distancia);
        
    }
    
}
