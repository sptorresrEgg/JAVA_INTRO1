/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaintro;
import java.util.Scanner;
/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 
 */
public class Ejercicio10_For {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, num3, num4;
        
        do {
        System.out.println("Ingrese cuatro numeros entre 1 y 20: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        num4 = leer.nextInt();
        }while ((num1 > 20 || num1 <1) || (num2 > 20 || num2 <1)|| (num3 > 20 || num3 <1)|| (num4 > 20 || num4 <1));
        
        
        System.out.print(num1 + " "); 
        for (int i = 0; i < num1; i++) {
            System.out.print("X"); 
        }
        System.out.println();
        System.out.print(num2 + " "); 
        for (int i = 0; i < num2; i++) {
            System.out.print("X"); 
        }
        System.out.println();
        System.out.print(num3 + " "); 
        for (int i = 0; i < num3; i++) {
            System.out.print("X"); 
        }
        System.out.println();
        System.out.print(num4 + " "); 
        for (int i = 0; i < num4; i++) {
            System.out.print("X"); 
        }
        System.out.println();
    }
}