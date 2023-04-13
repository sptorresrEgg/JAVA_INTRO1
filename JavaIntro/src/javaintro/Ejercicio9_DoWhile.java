/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class Ejercicio9_DoWhile {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        int numero, suma= 0;
        int i = 0;
        do {
            System.out.print("Ingresa un número: ");
            numero = scanner.nextInt();
            if (numero == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            }
            if (numero > 0) {
                suma += numero;
            }
            i++;
        } while (i < 20);
        System.out.println("La suma de los números positivos ingresados es: " + suma);
    }
}
