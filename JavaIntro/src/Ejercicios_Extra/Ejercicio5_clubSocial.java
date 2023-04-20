/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;

/**
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
  todos los tipos de tratamientos.
  *
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
   para los mismos tratamientos que los socios del tipo A.
   
o Los socios  tipo ‘C’, no reciben descuentos sobre dichos tratamientos.

* o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real 
  que represente el costo del tratamiento (previo al descuento) y determine el importe 
   en efectivo a pagar por dicho socio
 
 */
public class Ejercicio5_clubSocial {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String opcion;
        int costotratamiento;
        double valorpagar;
        do{
            System.out.println("Ingrese el tipo de socio (A o B o C)");
            opcion=leer.nextLine();
        }
        while(!(opcion.equalsIgnoreCase("A") || opcion.equalsIgnoreCase("B")|| opcion.equalsIgnoreCase("C")));
         
    switch (opcion){
        case "A":
        case "a":
            System.out.println("Ingrese el costo del tratamiento : ");
            costotratamiento=leer.nextInt();
            valorpagar=costotratamiento - (costotratamiento*0.5); 
            System.out.println("El valor a pagar es :" + valorpagar);
            break;
        case "B":
        case "b":
            System.out.println("Ingrese el costo del tratamiento : ");
            costotratamiento=leer.nextInt();
            valorpagar=costotratamiento - (costotratamiento*0.35);
            System.out.println("El valor a pagar es :" + valorpagar);
            break;    
        case "C":
        case "c":
            System.out.println("Ingrese el costo del tratamiento : ");
            costotratamiento=leer.nextInt();
            valorpagar=costotratamiento;
            System.out.println("El valor a pagar es :" + valorpagar);
            break;     
    }    

    }
}
