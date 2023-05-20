/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import serviciosahorcado.ServiciosAhorcado;

/**
 *
 * @author sptorresr
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosAhorcado as = new ServiciosAhorcado();
        char salida = 'a';
        do {
            System.out.println("1- Iniciar Juego");
            System.out.println("2- Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    as.juego();
                    break;
                case 2:
                    System.out.println("Seguro desea salir? (S para confirmar)");
                    salida = leer.next().charAt(0);
                    if (salida == 'S') {
                        System.out.println("Gracias por participar!");
                    }
                    break;
                default:
                    System.out.println("No se reconoce la opcion ingresada");
            }
        } while (salida != 'S');
        
    }
    
}
