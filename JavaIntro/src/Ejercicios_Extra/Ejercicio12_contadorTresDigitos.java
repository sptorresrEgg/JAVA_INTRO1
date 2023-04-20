/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;
/**
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, 
con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
 */
public class Ejercicio12_contadorTresDigitos {
    public static void main(String[] args) {
        String letrai;
        String letraj;
        String letrak;
        for (int i = 0; i < 10; i++) {
            if(i==3){
                
            }
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    letrai = String.valueOf(i);
                    letraj = String.valueOf(j);
                    letrak = String.valueOf(k);
                    letrai = letrai.replace("3", "E");
                    letraj = letraj.replace("3", "E");
                    letrak = letrak.replace("3", "E");
                    System.out.println(letrai + " - "+ letraj +" - "+ letrak);
                }
                
            }
            
        }
        
                
            

}

}

//System.out.print("["+ matrizM[i][j]+"]" );
//int [][] matrizM = new int [10][10];
