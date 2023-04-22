/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;
/**
 Realizar un programa que complete un vector con los N primeros números de la 
 sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión 
 de los siguientes números:
 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 */
public class Ejercicio24_fibonacci {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int numero;
        System.out.println("Ingrese el numero que desea calcular para fibonacci");
        numero= leer.nextInt();
        int [] vector = new int [numero];
        calcularFibonacci(numero,vector);
        mostrarFibonacci(numero,vector);
        
    }
    
    public static void calcularFibonacci(int numero, int [] vector){
        int a ,b , c;
        a=1;
        b=1;
        for (int i = 0; i < numero; i++) {
            vector[i]=a;
            c=a+b;
            a=b;
            b=c;
        }
    }
    
    public static void mostrarFibonacci(int numero, int [] vector){
        System.out.println("La susescion de terminos para fibonacci del numero " + numero + " es:");
        for (int i = 0; i < numero; i++) {
            System.out.print(vector[i] + ", ");
            
        }System.out.println("");
    }

}
