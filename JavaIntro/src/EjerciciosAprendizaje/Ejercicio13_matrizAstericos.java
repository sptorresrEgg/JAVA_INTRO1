/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
/**
 *
 * @author sptorresr
 */
public class Ejercicio13_matrizAstericos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [][] matriz =  new String [4][4];
        matriz [0][0] = " ";
        llenarMatriz(matriz);

}
    public static void llenarMatriz (String [][] matriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //(matriz[i][j].equals(matriz[0][j])  || j=0 || j=3 || i=3)
                //if(matriz[i][j].equals(matriz[0][j]) /*|| matriz[i][j].equals(matriz[i][0]) || matriz[i][j].equals(matriz[i][3]) || matriz[i][j].equals(matriz[3][j])*/) {
                  if(i==0 || j==0 || j==3 || i==3){
                    matriz[i][j]= "*";
                }
                else {
                   matriz[i][j]=" ";
                }
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print( matriz[i][j] );
            }
            System.out.println("");
       }
        System.out.println(""); 
    }   
    
}