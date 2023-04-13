/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
/**
 *
 * @author sptorresr
 */
public class Ejercicio2_Nombre {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.print("Ingrese su nombre :");
        nombre = leer.nextLine();
        String retorno = nombres (nombre);
        System.out.println("Su nombre es " + retorno);
}
    public static String nombres(String nombre){
        String nombre1=nombre;
        return  nombre1;
    }
}