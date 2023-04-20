/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main.
 */

package Ejercicios_Extra;
import java.util.Scanner;
/**
 *
 * @author sptorresr
 */
public class Ejercicio15_menuOperaciones {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double numero1, numero2;
         do {
            System.out.println("Ingrese dos numeros positivos");
            numero1 = leer.nextDouble();
            numero2 = leer.nextDouble();
        }while( !(numero1 > 0 && numero2 > 0) );
        double retorno = menu(numero1, numero2); 
        System.out.println("este es el resultado " + retorno); 
        
}
    public static double menu( double numero1,  double numero2){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
         int opcion;
         double resultado1=0;
         
         System.out.println("-------------------------");
         System.out.println("|    MENU               |");
         System.out.println("|    1. Sumar           |");
         System.out.println("|    2. Restar          |");
         System.out.println("|    3. Multiplicar     |");
         System.out.println("|    4. Dividir         |");
         System.out.println("|    5. salir           |");
         System.out.println("|                       |");
         System.out.println("|    Elija una opcion : |");
         System.out.println("-------------------------");
         opcion = leer.nextInt();
         switch(opcion){
             case 1:
                 double resultado = suma(numero1, numero2);
                 resultado1=resultado;
                 
                 break;
             case 2:
                 double restar = resta(numero1, numero2);
                 resultado1=restar;
                 break;  
             case 3:
                 double mult = multiplicar(numero1, numero2);
                 resultado1=mult;
                 break;     
             case 4:
                 double div = dividir(numero1, numero2);
                 resultado1=div;
                 break;       
                 
             default:
                 break;
                     
         }
         
       return(resultado1);
    }
    
    public static double suma (double numero1,double numero2){
        return(numero1+numero2);
    }
    
     public static double resta (double numero1,double numero2){
        return(numero1 - numero2);
    }
     
      public static double multiplicar (double numero1,double numero2){
        return(numero1*numero2);
    }
     public static double dividir (double numero1,double numero2){
        return(numero1/numero2);
    }  
   
}

