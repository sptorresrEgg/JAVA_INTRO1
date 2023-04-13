/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

 /**
       *Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
        pedirá de nuevo hasta que la nota sea correcta.
     */
public class Ejercicio8_DoWhile {
    

   
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int nota;
        System.out.println("Ingrese un nota");
        nota = leer.nextInt();
        
        while (nota<0 || nota>10) {
            
            System.out.println("Ingrese una nota valida");
            nota = leer.nextInt();
        }
        
    }
   
}

