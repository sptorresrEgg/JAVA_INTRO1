/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Nif;
import java.util.Scanner;
import serviciosNif.ServiciosNif;

/**
 Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosNif sn = new ServiciosNif();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        long numero;
        System.out.println("Ingrese el numero de dni (8 digitos)");
            numero = leer.nextLong();
           
           Nif n1 = sn.crearNif(numero);
           //System.out.println(n1.toString());
           sn.mostrarNif(n1);
    }
    
}
