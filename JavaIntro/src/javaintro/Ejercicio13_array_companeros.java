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
public class Ejercicio13_array_companeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tam;
        System.out.println("Digite la cantidad de compañeros");
        tam = leer.nextInt();
        String[] companeros = new String[tam];
        
        companeros[0]= leer.nextLine();
        
        for (int i = 0; i < (tam); i++) {
            System.out.print("Ingresa al compañero " + (i+1) + ":");
                companeros[i] = leer.nextLine();
        }
        
        for (int i = 0; i < (tam); i++) {
            System.out.println("[" + companeros[i] + "]");
        }
        System.out.println("");
}

}
