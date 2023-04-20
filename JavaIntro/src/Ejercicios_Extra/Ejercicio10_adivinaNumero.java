/*
Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. 
El programa debe indicar al usuario si su respuesta es o no correcta.
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar 
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */

package Ejercicios_Extra;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author sptorresr
 */
public class Ejercicio10_adivinaNumero {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1= (int) (Math.random()*10);
        int numero2= (int) (Math.random()*10);
        boolean retorno = adivina(numero1,numero2);
        if(retorno){
            System.out.println("Felicitaciones adivinaste el numero");
        }
       
       

}
    public static boolean adivina(int numero1, int numero2){
        boolean valida = true;
        int numero;
        Scanner leer = new Scanner(System.in);
        int multiplicacion = (int) (numero1*numero2);
        do {
            System.out.println("Ingresa el numero a adivinar entre 0 y 100");
            numero = leer.nextInt();
            if (numero > multiplicacion){
                System.out.println("Mas bajo");
            }else{
                System.out.println("Mas alto");
            }
        
        }while(multiplicacion != numero);    
        return(valida);
    }
}
