/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos
de las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */

package Ejercicios_Extra;
import java.util.Scanner;
/**
 *
 * @author sptorresr
 */
public class Ejercicio16_funcionMayorEdad {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String continuar;
        do{
            System.out.println("Ingrese el nombre de la persona");
            String nombre= leer.next();
            System.out.println("Ingrese la edad de "+ nombre);
            int edad= leer.nextInt();
            mayorMenor(edad, nombre);
            System.out.println("Desea continuar S o N");
            continuar = leer.next();
        }while(!(continuar.equalsIgnoreCase("N")));
      

}
    public static void mayorMenor(int edad, String nombre){
        if (edad > 18) {
            System.out.println(nombre + " es mayor de edad");
        }else{
            System.out.println(nombre + " es menor de edad");
        }
    }
}
