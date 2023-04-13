/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
import java.lang.Math;
/**
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
 * el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
public class Ejercicio5_Raiz {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entero");
        num = leer.nextInt();
        cuadrada(num);
}
    public static void cuadrada(int num){
        double dnum = num;
        double numdoble;
        double numtriple;
        double raizCuadrada;
        numdoble = Math.pow(dnum, 2);
        numtriple = Math.pow(dnum, 3);
        raizCuadrada = Math.sqrt(dnum);
        System.out.println("El doble de " + num + " es: " + numdoble);
        System.out.println("El triple de " + num + " es: " + numtriple);
        System.out.println("La raiz cuadrada de " + num + " es: " + raizCuadrada);
    }
}
