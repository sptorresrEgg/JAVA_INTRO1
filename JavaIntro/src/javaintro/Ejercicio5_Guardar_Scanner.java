/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
    Scanner
 * @author sptorresr
 */
public class Ejercicio5_Guardar_Scanner {
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
            System.out.println("Ingrese un numero");
            double numero = leer.nextDouble();
            System.out.println("Ingrese una letra");
            char letra = leer.next().charAt(0);
            System.out.println("Ingrese true o false");
            boolean bandera = leer.nextBoolean();
            System.out.println("bandera es " + bandera);
        
    }
}
