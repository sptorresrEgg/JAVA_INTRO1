/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;
/**
 Crear un programa que dibuje una escalera de números, donde cada línea de números 
 comience en uno y termine en el número de la línea. Solicitar la altura de la escalera
 al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
public class Ejercicio13_escaleraNumeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int numero= leer.nextInt();
        for (int i = 0; i < numero+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
                
            }
            System.out.println("");
           
        }
        
}

}
