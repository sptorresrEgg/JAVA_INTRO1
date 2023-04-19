/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;
/**
 *
 * @author sptorresr
 */
public class Ejercicio4_numeroRomano {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, decenas, unidades;
        do{
            System.out.println("Ingrese un numero de 1 a 10");
            numero = leer.nextInt();
        }while(!(numero <11 && numero > 0));
       
        String romano="";

      
          
      if (numero ==10){
          romano="X";
            }
      else if(numero==9){
            romano = romano + "IX";
        }
      else if (numero >= 5) {
                 romano = romano + "V";
                 for (int i = 6; i <= numero; i++) {                                                           
                      romano = romano + "I";
                 } 
        }
       else if(numero==4){
           romano = romano + "IV";
         }
       else{
           for ( int i = 1; i <= numero; i++) {
                      romano = romano + "I";
           }          
       } 
    System.out.println("el numero en romano es " + romano);
        
    }

}
