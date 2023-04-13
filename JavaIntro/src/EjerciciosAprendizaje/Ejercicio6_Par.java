/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
/**
 *
 * Crear un programa que dado un numero determine si es par o impar.
 */
public class Ejercicio6_Par {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("ingrese un numero");
        num = leer.nextInt();
        validapar(num);
}
    public static void validapar(int num){
        int modulo = num % 2;
       
        if (modulo == 0) {
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
    }
}
