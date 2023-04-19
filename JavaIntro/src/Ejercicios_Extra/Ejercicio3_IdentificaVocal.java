/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;
/**
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata 
 de una vocal. Caso contrario mostrar un mensaje. 
 * Nota: investigar la función equals() de la clase String.
 */
public class Ejercicio3_IdentificaVocal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        
        
        System.out.println("Ingrese una letra");
        letra = leer.nextLine();
        
        if (letra.equalsIgnoreCase("a") ||letra.equalsIgnoreCase("e") 
               ||letra.equalsIgnoreCase("i") ||letra.equalsIgnoreCase("0") 
                ||letra.equalsIgnoreCase("u")) {
            System.out.println("La letra ingresada corresponde a una vocal");
        } else {
            System.out.println("La letra ingresada no corresponde a una vocal");
        }
}

   

}
