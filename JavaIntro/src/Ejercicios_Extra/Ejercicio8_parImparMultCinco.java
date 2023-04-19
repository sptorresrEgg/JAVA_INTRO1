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
public class Ejercicio8_parImparMultCinco {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidad;
        System.out.println("Ingrese la cantidad de numeros a evaluar");
        cantidad=leer.nextInt();
        evaluar(cantidad);
}
    
    public static void evaluar(int cantidad){
        Scanner leer = new Scanner(System.in);
        int numero;
        int par=0;
        int impar=0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el numero " +(i+1) );
            numero = leer.nextInt();
            if(numero==0){
                i--;
            }
            else {
                int modulo5=numero%5;
                int modulo2=numero%2;
                if(modulo5==0){
                    break;
                }
                else if(modulo2==0){
                   par++; 
                }
                else{
                    impar++;
                }
            }
            
            
        }
        System.out.println("La cantidad de pares ingresados es " + par);
        System.out.println("La cantidad de impares ingresados es " + impar);
    }

}
