/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;
/**
 Crea una aplicación que nos pida un número por teclado y con una función se lo 
 pasamos por parámetro para que nos indique si es o no un número primo, 
 debe devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */
public class Ejercicio17_esPrimo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entero");
        numero = leer.nextInt();
        boolean resultado = primo(numero);
        System.out.println("el numero "+ numero + " es primo =" + resultado);
}
    public static boolean primo (int numero){
        boolean valida=true;
        int contador=0;
        for (int i = 1; i < numero; i++) {
            if(numero%i==0){
                contador++;
            }
            
        }
        if (contador > 2) {
            valida=false;
        }
        return(valida);
    }
}
/*definir numprimo como caracter
	definir contador,j Como Entero
	contador=0
	Para j<-1 Hasta num Con Paso 1 Hacer
		Si num mod j =0 Entonces
			contador=contador+1
		Fin Si
		si contador >2 Entonces
			numprimo="no es un numero primo"
		sino	
			numprimo="es un numero primo"
		FinSi
	Fin Para*/