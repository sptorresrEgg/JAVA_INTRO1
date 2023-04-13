/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
/**
 *Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
 * Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
 * por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
 * Nota: investigar la función Lenght() en Java.
 * @author sptorresr
 */
public class Ejercicio8_largoPalabra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        boolean retorno = contarCaracteres(frase) ;
        if (retorno == true){
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }
            
}
    public static boolean contarCaracteres (String frase){
       
        return (frase.length() == 8);
        
    }
}
