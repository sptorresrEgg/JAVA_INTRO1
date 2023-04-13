/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaintro;
import java.util.Scanner;
/**
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando que el primer
*numero múltiplo del segundo y e imprima si el primer numero es múltiplo del segundo, sino informe que no lo son.
 */
public class Ejercicio12_ProcedimientoMultiplo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        multiplo(num1,num2);
        
        

}
    public static void multiplo(int num1, int num2){
        int residuo;
        residuo = num1%num2;
        if (residuo==0){
            System.out.println(num1+" es multiplo de "+ num2);
        }
        else {
            System.out.println(num1+" no es multiplo de "+ num2);
        }
    }
}
