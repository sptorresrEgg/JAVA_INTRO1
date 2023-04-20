/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;
/**
 Escribir un programa que lea un número entero y devuelva el número de dígitos que
 componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
  deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando 
  el operador de división. 
   Nota: recordar que las variables de tipo entero truncan los números o resultados.
 */
public class Ejercicio11_cantidadDigitos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entero");
        numero = leer.nextInt();
        int retorno=  cantidadDigitos(numero);
        System.out.println("La cantidad de digitos de " + numero + " es "+ retorno);

}
    public static int cantidadDigitos(int numero){
        int dividir,i;
        dividir=0;
        i=1;
        while(dividir !=1){
            dividir=numero/10;
            numero=dividir;
            i=i+1;
            
        }
        return(i);
    }
    
    

}
/*definir num, i como entero
	definir dividir Como Real
	escribir "ingrese numero"
	leer num
	dividir =0
	i=1
	Mientras dividir <>1
		dividir = trunc (num / 10)
		num=dividir
		i=i+1
	fin mientras
	Escribir "el numero digitado tiene ", i , " cifras"*/