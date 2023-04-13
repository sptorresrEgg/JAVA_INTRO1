/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
/**
 Realizar un algoritmo que rellene un vector con los 100 primeros números 
 * enteros y los muestre por pantalla en orden descendente.
 */
public class Ejercicio15_RellenaVector {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] vector= new  int[100];
       rellenar(vector);
        mostrar(vector);
}
    public static void rellenar(int [] vector){
        for (int i = 0; i < 100; i++) {
            vector[i]=i+1;
        }
    }
    
    public static void mostrar(int [] vector){
        for (int i = 99; i >= 0; i--) {
            System.out.println("[" + vector[i] + "]") ;
        }
        
    }
}
