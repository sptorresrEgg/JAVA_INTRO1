/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
/**
 *
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” 
 * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
 * Incorrecto. Nota: investigar la función equals() en Java.
 */
public class Ejercicio7_Fraseigual {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("ingrese una frase");
        frase = leer.nextLine();
        comparafrase(frase);

}
public static void comparafrase(String frase){
    String palabra = "eureka";
    //palabra.equalsIgnoreCase(frase) para ignorar si es mayu o minus
    if (palabra.equals(frase) ) {
        System.out.println("La frase ingresada es correcta");
    }
    else{
        System.out.println("La frase ingresada es incorrecta");
    }
}
}
