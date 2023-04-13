/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaintro;
import java.util.Scanner;
/**
 Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
 * y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter
 * que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen 
 * sin cambios.
 * a e i o u
   @ # $ % *
 */
public class Ejercicio11_FuncionDecodificador {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase;
        do {
            System.out.println("Ingrese una frase y terminela en punto (.)");
            frase = leer.next();
        }while (!frase.endsWith("."));
        System.out.println("voy a borrar pantalla (.)");
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        String retorno=codificar(frase);
        System.out.println("La frase nueva es:" + retorno);

}
    public static String codificar (String frase){
        String frase2 = "";
        
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i,i+1)){
                case "a":
                case "A":
                    frase2 +="@";
                    break;
                case "e":
                case "E":
                    frase2 +="#";
                    break;    
                case "i":
                case "I":
                    frase2 +="$";
                    break;    
                case "o":
                case "O":
                    frase2 +="%";
                    break;    
                case "u":
                case "U":
                    frase2 +="*";
                    break;
                default :
                    frase2 +=frase.substring(i,i+1);
            }
        }
        return (frase2);
        
    }
}
