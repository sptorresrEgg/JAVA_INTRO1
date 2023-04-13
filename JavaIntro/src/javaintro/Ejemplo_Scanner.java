/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class Ejemplo_Scanner {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Con esta clase guardamos valores ingresados por consola en las variables");
        
        System.out.println("Ingresa tu nombre");
        //nextInt para enteros, nextLine para cadenas
        String nombre = leer.nextLine();
        
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        
        
        
    }
}
