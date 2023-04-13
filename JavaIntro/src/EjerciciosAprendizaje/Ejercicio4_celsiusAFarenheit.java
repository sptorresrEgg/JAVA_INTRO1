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
public class Ejercicio4_celsiusAFarenheit {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double gradosC;
        System.out.println("Ingrese los grados centrigrados a converit");
        gradosC = leer.nextDouble();
        double retorno = convertir(gradosC);
        System.out.println(gradosC + " centigrados en grados farenheit son : "+ retorno);
}
public static double convertir (double gradosC){
    double gradosF;
    gradosF = 32 + (9 * gradosC / 5);
    return gradosF;
}
}
