/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import servicios.ServiciosFraccion;

/**
 *
 * @author sptorresr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
            System.out.println("Ingrese los datos de la primer fraccion, primero numerador luego denominador");
            int num1 = leer.nextInt();
            int den1= leer.nextInt();
            System.out.println("Ingrese los datos de la segunda fraccion, primero numerador luego denominador");
            int num2 = leer.nextInt();
            int den2= leer.nextInt();
            ServiciosFraccion sf = new ServiciosFraccion();
            sf.crear(num1, den1, num2, den2);
            do{
                System.out.println("----------Menu Operaciones -----");
                System.out.println("");
                System.out.println("          1. Sumar");
                System.out.println("          2. Restar");
                System.out.println("          3. Multiplicar");
                System.out.println("          4. Dividir");
                System.out.println("          5. Salir");
                System.out.println("");
                System.out.println("Ingrese una Opcion");
                opc = leer.nextInt();
                 switch(opc){
                     case 1:{
                         sf.sumar();
                         break;
                     }
                     case 2:{
                         sf.restar();
                         break;
                     }
                     case 3:{
                         sf.multiplicar();
                         break;
                     }     
                     case 4:{
                         sf.dividir();
                     }
                 }
        }while(opc!=5);
           
    }
    
}
