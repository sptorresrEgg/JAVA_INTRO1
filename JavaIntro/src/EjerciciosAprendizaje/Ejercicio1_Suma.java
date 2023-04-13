/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.awt.event.InputEvent;


/**
 Escribir un programa que pida dos números enteros por teclado y calcule la suma 
 * de los dos. El programa deberá después mostrar el resultado de la suma
 */
public class Ejercicio1_Suma {
    public static void main(String[] args) throws AWTException  {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
       
        
      
        int retorno = sumar(num1, num2);
        
        //limpiarpantalla();
        System.out.flush();
        System.out.println("El resultado de la suma de los dos numeros es :" + retorno);
        

}
 public static int sumar (int num1 , int num2){
     int suma;
     suma = num1 + num2;
     return suma;
     
 }
 public static void limpiarpantalla() {
        try{
            System.out.println("Presione enter para continuar...");
            new java.util.Scanner(System.in).nextLine();

            Robot pressbot = new Robot();
            pressbot.keyPress(KeyEvent.VK_CONTROL);
            pressbot.keyPress(KeyEvent.VK_L);
            pressbot.keyRelease(KeyEvent.VK_CONTROL);
            pressbot.keyRelease(KeyEvent.VK_L);
       } catch (Exception e)
       {
           System.out.println(""+e.getMessage());
       }
        
   }
}
