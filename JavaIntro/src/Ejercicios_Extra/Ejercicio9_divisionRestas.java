/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;
/**
 Simular la división usando solamente restas. Dados dos números enteros mayores que uno,
 realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
 Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
 este resultado es el residuo, y el número de restas realizadas es el cociente.
 */
public class Ejercicio9_divisionRestas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1, numero2;
        do{
            System.out.println("Ingrese dos numeros enteros");
            numero1= leer.nextInt();
            numero2= leer.nextInt();
        }while((numero1<=0 && numero2>=0)||(numero1>=0 && numero2<=0) );
        dividir(numero1, numero2);

    }
    public static void dividir(int numero1, int numero2){
        int conta, residuo;
        conta=0;
        do{
          numero1=numero1-numero2;
          conta++;
        }while(numero1 >= numero2);
        System.out.println("el resido es " + numero1);
        System.out.println("El resultado de dividir es : "+ conta);
    }
    
   
    
    
}