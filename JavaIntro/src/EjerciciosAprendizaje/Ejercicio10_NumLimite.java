/*
 * Escriba un programa en el cual se ingrese un valor límite positivo,
y a continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
/**
 *
 * @author sptorresr
 */
public class Ejercicio10_NumLimite {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numlimite;
        do {
            System.out.println("Ingrese un numero limite");
            numlimite = leer.nextInt();
        }while(numlimite < 0);
        int retorno = sumar(numlimite);
        System.out.println("La suma de los numeros ingresados llego o supero al numero limite " + retorno);
    }
    public static int sumar(int numlimite){
        Scanner leer2 = new Scanner(System.in);
        int suma=0,num;
        do {
            System.out.println("Ingrese los numeros a sumar");
            num =  leer2.nextInt();
            suma+=num;
        }while(suma < numlimite);
        
        return suma;
    }
}
