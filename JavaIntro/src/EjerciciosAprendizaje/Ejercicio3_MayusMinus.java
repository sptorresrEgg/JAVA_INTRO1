/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
/**
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después 
* toda en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
public class Ejercicio3_MayusMinus {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        convertir(frase);
}
    public static void convertir(String frase) {
            
            System.out.println("La frase en mayusculas es :" + frase.toUpperCase() );
            System.out.println("La frase en minusculas es :" + frase.toLowerCase() );
}
}
