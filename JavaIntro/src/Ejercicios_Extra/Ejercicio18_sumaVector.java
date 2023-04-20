/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;
/**
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector
 de tamaño N, con los valores ingresados por el usuario.
 */
public class Ejercicio18_sumaVector {
    public static void main(String[] args) {
        int size, vector[];
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        size = leer.nextInt();
        llenar(size);

}
    public static void llenar(int size){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int suma=0;
        int [] vector= new  int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("INgrese el valor para la pocision " + (i+1));
            vector[i] = leer.nextInt();
            suma+=vector[i];
        }
        System.out.println("La suma de los elementos del vector es " + suma);
        
    }
}
