/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;
/**
 Se dispone de un conjunto de N familias, cada una de las cuales tiene una 
 M cantidad de hijos. Escriba un programa que pida la cantidad de familias y 
 para cada familia la cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
public class Ejercicio14_promedioEdadesFamilias {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantFam;
        System.out.println("ingrese el numero familias");
        cantFam=leer.nextInt();
        double  retorno = promediar(cantFam);
        System.out.println("El promedio es "+ retorno);
        
}
    public static  double promediar( int cantFam){
        int SumcantHijos, edadHijos, suma, cantHijos;
        suma=0;
        SumcantHijos=0;
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < cantFam; i++) {
            System.out.println("Ingrese cantidad de hijos para familia "+ (i+1));
            cantHijos = leer.nextInt();
            for (int j = 0; j < cantHijos; j++) {
                System.out.println("Ingrese la edad del hijo " +(j+1) +" de la familia "+ (i+1) );
                edadHijos= leer.nextInt();
                SumcantHijos++;
                suma+=edadHijos;
            }
        }
         double promedio = suma/SumcantHijos;
        return(promedio);
    }
}
