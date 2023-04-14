/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
import java.lang.Math;
/**
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
  muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B 
 y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Ejercicio18_matrizTranspuesta {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[ ] [ ]= new int[4][4];
        rellenar(matriz);
        mostrar(matriz);
        transpuesta(matriz);
        
    }
    public static void rellenar(int [][] matriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                
            }
            
        }
    }

    public static void mostrar (int [][] matriz){
        System.out.println("MATRIZ INICIAL");
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+ matriz[i][j]+"]" );
            }
            System.out.println("");
       }
        System.out.println(""); 
    }   

    public static void transpuesta (int [][] matriz){
        int matrizT[ ] [ ]= new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[i][j]=matriz[j][i];
            }
        }
        mostrarT(matrizT);
    }

    public static void mostrarT (int [][] matrizT){
        System.out.println("MATRIZ TRANSPUESTA");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+ matrizT[i][j]+"]" );
            }
            System.out.println("");
       }
        System.out.println(""); 
    }   
    
}




