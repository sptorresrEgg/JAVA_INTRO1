/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class Ejemplo_Swich {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int opcion;
        
        System.out.println("ingrese una opcion");
        opcion = leer.nextInt();
         switch (opcion) {
            case 1:
                System.out.println("Esta linea de codigo se ejecuta si la opcion es 1");
                break;
            case 2:
                System.out.println("Esta linea de codigo se ejecuta si la opcion es 2");
                break;    
            default:
                System.out.println("el valor ingresado en la variable opcion es diferente " + 
                        " a todos los casos analizados por el switch");       
        }
    }
}