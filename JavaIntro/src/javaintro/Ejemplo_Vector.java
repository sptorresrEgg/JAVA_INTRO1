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
public class Ejemplo_Vector {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] vector= new int[5];
        //inicializo la primera posicion del vector
        vector[0]=3;
        //asigno valores al vector
        for (int i = 0; i < 5; i++) {
            vector[i] = i + 3;
        }
        //muestro por pantalla el vector
        
        for (int i = 0; i < 5; i++) {
            System.out.println("[" + vector[i] + "]") ;
            
        }
        System.out.println("");
    }

}
