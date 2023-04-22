/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;
/**
 Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
 y muestre la suma de sus elementos.
 */
public class Ejercicio22_rellenarMatriz {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int filas, columnas;
        System.out.println("Ingrese el valor de las filas y las columnas de la matriz");
        filas=leer.nextInt();
        columnas=leer.nextInt();
        rellenar(filas, columnas);
}
    public static void rellenar(int f,int c){
        int resultado;
        int [][] matriz= new int [f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j]= (int)(Math.random()*10);
            }
            
        }
        mostrar(matriz);
        int retorno=sumar(matriz);
        System.out.println("El resultado de la suma de todos los elementos es "  + retorno);
    }
    
    public static int sumar(int [][] matriz){
        int suma=0;
        for (int[] recorrido: matriz){
         for( int intorrecorrido : recorrido){
             suma= intorrecorrido + suma;
             
         }
         
     } 
        return(suma);
    
    }
    
    public static void mostrar(int [][] matriz){
     for (int[] recorrido: matriz){
         for( int intorrecorrido : recorrido){
             System.out.print("[ " + intorrecorrido + " ]");
             
         }System.out.println("");
         
     }
    }
    
    

}
