/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
/**
 Crea una aplicación que a través de una función nos convierta una cantidad de euros 
  introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
 
  La función tendrá como parámetros, la cantidad de euros y la moneda a converir 
  que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
public class Ejercicio14_convertirEuros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        double euro;
        String cadena;
        System.out.println("Ingrese la cantidad de euros que desea convertir");
        euro = leer.nextDouble();
        do{
        System.out.println("Escriba la moneda a convertir (dolares, yenes, libras)");
        cadena = leer2.nextLine();
        }while(!(cadena.equalsIgnoreCase("DOLARES")|| cadena.equalsIgnoreCase("YENES") || cadena.equalsIgnoreCase("LIBRAS")));
        convertirMoneda(euro, cadena);
    }
    public static void convertirMoneda (double euro, String cadena){
        String cadena2 = cadena.toUpperCase();
        switch(cadena2) {
            
                case "DOLARES":
                    System.out.println(euro + " Euros en Dolares son : "+ (euro*1.28611));
                    break;
                case "YENES":    
                    System.out.println(euro + " Euros en Yenes son : "+ (euro*129.852));
                    break;
                case "LIBRAS":
                    System.out.println(euro + " Euros en Libras son : "+ (euro*0.86));
                    break;
        }
    }
}
