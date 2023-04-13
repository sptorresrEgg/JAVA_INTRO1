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
public class Ejemplo_Condicionales {
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la pelicula de 1 a 5 estrellas");
        opinion = leer.nextInt();
        if (opinion >= 1 && opinion <= 5) {
            switch (opinion){
                case 1:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado la peli...");
                    break;
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado la peli...");
                    break;
                case 3:
                    System.out.println("Has calificado la peli como buena");
                    break;    
                case 4:
                    System.out.println("Has calificado la peli como  muy buena");
                    break;    
                case 5:
                    System.out.println("Has calificado la peli como EXCELENTE, te esperamos de nuevo");
                    break;
            }        
            } else if (opinion < 0) {
                System.out.println("Negativos no vale, no fue tan mala");
            } else if (opinion == 0) {
                System.out.println("El valor "+ opinion + " no es valido y no se tomara en cuenta :(");
            } else {
                System.out.println(opinion + "! en serio esa calificacion, piensalo!!! :D");
            }
            System.out.println("Hasta la proxima!");        
   
        }
    
    }


