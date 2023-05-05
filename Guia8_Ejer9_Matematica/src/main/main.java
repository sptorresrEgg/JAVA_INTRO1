/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidades.Matematica;
import Servicios.ServiciosMatematica;

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
        ServiciosMatematica sm = new ServiciosMatematica();
        Matematica m1 = sm.crearnumeros();
        System.out.println(m1);
        System.out.println("El mayor de los dos numeros es " + sm.devolverMayor(m1));
        System.out.println("El resultado de la potencia del mayor elevado al menor es " + sm.calcularPotencia(m1));
        System.out.println("La raiz cuadrada del menor es " + sm.calcularRaiz(m1));
        
    }
    
}
