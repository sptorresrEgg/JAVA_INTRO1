/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;
/**
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
 si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente:
 1 día, 2 horas.
 */
public class Ejercicio1_tiempoMinutos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int minutos;
        System.out.println("Escribe los numeros de minutos a calcular");
        minutos = leer.nextInt();
        calcular(minutos);
        
}

    public static void calcular(int minutos){
        int dias=0;
        int horas=0;
        int min=0;
        int tiempo=minutos;
        while(minutos > 0){
            if(minutos > 1440){
             dias++;
             minutos = minutos - 1440;   
            }
            else if(minutos > 60){
               horas++;
               minutos = minutos - 60;
            }
            else if(minutos < 60){
                min++;
                minutos = minutos - 1;
            }            
            
        }
        System.out.println(tiempo + " minutos equivalen a " + dias + " dias y " + horas + " horas y " + min +" minutos"  );
    }
}
