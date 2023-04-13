/*
 * To change this license header, choose License Headers in Project Properties.
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class Ejercicio6_Condicioneles {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Ingrese dos numeros");
        
        num1 = leer.nextInt();
        
        num2 = leer.nextInt();
        
        if (num1>25 && num2>25)  {
            System.out.println("Los dos numeros son mayor que 25");
        } 
        else if(num1>25 || num2>25 ){
            System.out.println("Uno de los numeros es mayor que 25");
        }
        
    }
}
