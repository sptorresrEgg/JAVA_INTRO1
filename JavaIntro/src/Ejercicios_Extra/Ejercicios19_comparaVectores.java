/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;
/**
 Escriba un programa que averigüe si dos vectores de N enteros son iguales 
 * (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre
 * los elementos).
 */
public class Ejercicios19_comparaVectores {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int size;
        System.out.println("Digite el tamaño del vector");
        size = leer.nextInt();
        rellenar(size);
        
       //int [][] matrizM = new int [10][10]; 

}   
    public static void rellenar( int size){
        int [] vector1= new  int[size];
        int [] vector2= new  int[size];
        vector1[0]=35;
        vector1[1]=48;
        vector1[2]=99;
        vector2[0]=35;
        vector2[1]=48;
        vector2[2]=999;
       
        /*for (int i = 0; i < size; i++) {
            vector1[i]= (int) (Math.random()*10);
            
        }
         for (int i = 0; i < size; i++) {
            vector2[i]= (int) (Math.random()*10);
            
        }*/
        
        mostrar(vector1, vector2, size);
    }
    
    public static void mostrar( int [] vector1, int [] vector2, int size ){
         for (int i = 0; i < size; i++) {
             System.out.println("[ " + vector1[i] + " ]" );
            
        }
         System.out.println("");
         for (int i = 0; i < size; i++) {
            System.out.println("[ " + vector2[i] + " ]" );
            
        }
        System.out.println(""); 
        boolean valida = compara(vector1, vector2, size);
        if(valida){
            System.out.println("Los dos vectores son iguales");
        }
    }
    
    public static boolean compara (int [] vector1, int [] vector2, int size){
        boolean valida=true;
        int cont=0;
        for (int i = 0; i < size; i++) {
            
                if(!(vector1[i]==vector2[i])){
                    System.out.println("Los vectores no son iguales");
                    cont++;
                    valida=false;
                    break;
                }
        }
        
         return(valida);
        
    }
    
}
