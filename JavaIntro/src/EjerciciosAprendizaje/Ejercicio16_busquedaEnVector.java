/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
import java.lang.Math;


     
/**
 *Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios 
 * y le pida al usuario un numero a buscar en el vector. El programa mostrará 
 * donde se encuentra el numero y si se encuentra repetido
 */
public class Ejercicio16_busquedaEnVector {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int size;
        int valorBuscado;
        do{
            System.out.println("Ingrese el tamaño del vector, debe ser positivo");
            size = leer.nextInt();
        }while(size<0);
        int [] vector = new int [size];
        vector[0]=0;
        System.out.println("Ingrese el valor a buscar");
        valorBuscado = leer.nextInt();
        rellenar(vector,size);
        mostrar(vector,size);
        buscar(vector, size, valorBuscado);
}
     public static void rellenar(int [] vector, int size){
        for (int i = 0; i < size; i++) {
            
            vector[i]=(int)(Math.random()*10);
            
        }
    }
    
    public static void mostrar(int [] vector, int size){
        for (int i = 0; i < size; i++) {
            System.out.println("[" + vector[i] + "]") ;
        }
        
    }
    
    public static void buscar (int [] vector, int size, int valorBuscado){
        int contador=0;
        for (int i = 0; i < size; i++) {
            if(vector[i] == valorBuscado){
                contador++;
                System.out.println("El " + valorBuscado + " Se encuentra en la posicion " +(i+1));
            }
        }   if(contador == 0){
            System.out.println("El " + valorBuscado + " NO se encuentra dentro del vector");
        }else if(contador > 1) {
        System.out.println("El " + valorBuscado + " esta repetido " + contador + " veces");
        }
    }
}    
