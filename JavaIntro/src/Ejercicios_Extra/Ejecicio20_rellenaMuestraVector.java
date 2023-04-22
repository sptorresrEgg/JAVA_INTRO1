/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;

/**
 Crear una función rellene un vector con números aleatorios, pasándole un arreglo
 por parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
public class Ejecicio20_rellenaMuestraVector {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
          int [] vector= new  int[20];
       rellenar(vector);
        mostrar(vector);
}
    public static void rellenar(int [] vector){
        
        for (int i = 0; i < 20; i++) {
            vector[i]=i+1;
        }
    }
    
    public static void mostrar(int [] vector){
        for (int i = 0; i < 20; i++) {
            System.out.println("[" + vector[i] + "]") ;
        }
        
    }

}


