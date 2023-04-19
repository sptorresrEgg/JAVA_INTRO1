/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
import java.lang.Math;
/**
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y 
 * el promedio de n números (n>0). El valor de n se solicitará al principio del
 * programa y los números serán introducidos por el usuario. 
 * Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
public class Ejercicio7_maximoMinimoPromedio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidad;
        System.out.println("Ingrese la cantidad de numeros a evaluar");
        cantidad = leer.nextInt();
        calcular(cantidad);
        
}
    public static void calcular(int cantidad){
        Scanner leer = new Scanner(System.in);
        int cont=0;
        int num;
        int suma=0;
        int max=0;
        int min=0;
        double promedio;
        do {
            System.out.println("Ingrese el valor para el numero "+ (cont+1));
            num = leer.nextInt();
            suma+=num;
            cont++;   
             
             if(num<1){
                cont--;
             }  
            
                max =   Math.max(max,num);
                min =  Math.min(min,num);   
            
        }while(cont < cantidad);
        promedio= suma/cantidad;
        System.out.println("el maximo es " + max);   
        System.out.println("el mimino es " + min);
        System.out.print("El promedio es :" );
        System.out.printf("%.2f %n", promedio);
        System.out.println("");
    }

}
