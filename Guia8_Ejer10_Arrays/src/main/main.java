/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;


/**
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales.
* El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.

Luego, el arreglo A se debe ordenar de menor a mayor

 y copiar los primeros 10 números ordenados al arreglo B de 20 elementos,
y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.round(Math.random()*100);
        }
       
        System.out.println("ARREGLO A SIN ORDENAR");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.print("[" + arregloA[i] + "] ");
        }
        System.out.println("");
        
        System.out.println("ARREGLO A ORDENADO");
        Arrays.sort(arregloA);
        
         for (int i = 0; i < arregloA.length; i++) {
            System.out.print("[" + arregloA[i] + "] ");
        }
        System.out.println(""); 
        
        
        arregloB = Arrays.copyOfRange(arregloA, 0, 20);
        Arrays.fill(arregloB, 11, 20, 0.5);
        
        System.out.println("ARREGLO B");
        
        for (int i = 0; i < arregloB.length; i++) {
            System.out.print("[" + arregloB[i] + "] ");
        }
        System.out.println("");
        
        
    }
    
}
