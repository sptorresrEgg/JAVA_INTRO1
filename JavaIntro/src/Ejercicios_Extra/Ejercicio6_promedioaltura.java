/*
 * Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */

package Ejercicios_Extra;
import java.util.Scanner;
/**
 *
 * @author sptorresr
 */
public class Ejercicio6_promedioaltura {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidadpersonas;
        System.out.println("Ingrese el numero de personas a evaluar ");
        cantidadpersonas= leer.nextInt();
        double retorno=promediar(cantidadpersonas);
        System.out.print("El promedio de altura de todas las personas es :" );
        System.out.printf("%.2f %n",retorno);
        System.out.println("");
      
}
    public static double promediar (int cantidad){
        Scanner leer = new Scanner(System.in);
       int contador=0;
       double altura;
       double suma1=0;
       double sumtot=0;
       for (int i = 1; i <= cantidad; i++) {
            System.out.println("Ingrese la altura de la persona numero " + i);
            altura = leer.nextDouble();
            if(altura <= 1.60){
                suma1 = suma1 + altura;
                contador=contador + 1;
            }
            sumtot=sumtot + altura;    
        }
         System.out.print("El promedio de altura de las personas de 1.60 o menos es :" );
        System.out.printf("%.2f %n",suma1/contador);
        System.out.println("");
 
        return(sumtot/cantidad);
    }
    
    /*System.out.printf("%1,2",variable);*/
    

}
