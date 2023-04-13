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
public class Ejemplo_Matriz {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [][] matriz = new String [3][3];
        matriz [0][0] = "A";  //Siempre debo inicializar la primera posicion.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = "B";
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
       }
        System.out.println(""); 
    }   

}
