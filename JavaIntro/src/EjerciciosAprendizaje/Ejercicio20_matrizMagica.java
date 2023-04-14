/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
/**
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde
  la suma de sus filas, sus columnas y sus diagonales son idénticas. 
  Crear un programa que permita introducir un cuadrado por teclado y determine 
  si este cuadrado es mágico o no. 
  El programa deberá comprobar que los números introducidos son correctos,
  es decir, están entre el 1 y el 9.
 */
public class Ejercicio20_matrizMagica {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[ ] [ ]= new int[3][3];
        rellenar(matriz);
        mostrar(matriz);
        magica(matriz);
}
    
     public static void rellenar(int [][] matriz){
         Scanner leer = new Scanner(System.in);
         int num;
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 do{
                     System.out.println("Ingrese el valor #" + i +"," + j);  
                     num = leer.nextInt();
                 }while(num < 1 || num > 9);
                 matriz[i][j]=num;
            }
        }
    }
    
     
     public static void mostrar (int [][] matriz){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ matriz[i][j]+"]" );
            }
            System.out.println("");
       }
        System.out.println(""); 
    }   
    
     public static void magica (int [][] matriz){
         int suma,sumai;
         boolean valida=true;
         suma=0;
         sumai=0;
         //valido la suma de la primera fila para tener como referencia
         for (int i = 0; i < 3; i++) {
             sumai = sumai + matriz[i][i];
         }
         
         //comparo sumai con la suma de las otras filas
         for (int i = 1; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
               suma = suma + matriz[i][j];
             }
             if(suma==sumai){
                 suma=0;
             }else {
             break;
             }
         }
         
         //valido sumai con la suma  de las otras columnas
         if(valida){
             for (int i = 0; i < 3; i++) {
                 suma=0;
                 for (int j = 0; j < 3; j++) {
                     suma=suma+matriz[i][j]; 
                 }
                 if(suma != sumai){
                    valida=false;
                    break;
                 }
             }
             
         //valido sumai con la suma de la diagonal principal    
             if(valida){
                 suma=0;
                 for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                         if(i==j){
                         suma = suma + matriz[i][j];
                         }
                     }
                 }
                 if(suma != sumai){
                    valida=false;
                 }
             }
          
            //valido sumai con la suma de la diagonal secundaria
             if(valida){
                 suma=0;
                 for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                         if(i+j==3-1){
                         suma = suma + matriz[i][j];
                         }
                     }
                 }
                 if(suma != sumai){
                    valida=false;
                 }
             }
             
             
             if(valida){
                 System.out.println("Es una matriz magica y su suma en filas,columnas,diagonales es "+sumai);
             }else{
                 System.out.println("La matriz no es magica");
             }
         }
     }
}
