/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import servicios.ServiciosPass;

/**
 *
 * @author sptorresr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosPass sp = new ServiciosPass();
        int opc;
        do {
            System.out.println("----------Menu Usuario -----");
            System.out.println("");
            System.out.println("          1. Ingresar Password");
            System.out.println("          2. Nivel Password");
            System.out.println("          3. Cambiar Contraseña");
            System.out.println("          4. Cambiar Nombre");
            System.out.println("          5. Cambiar DNi");
            System.out.println("          6. SALIR");
            System.out.println("");
            System.out.println("Ingrese una Opcion");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    sp.crearPass();
                    break;
                case 2:
                    sp.analizarPass();
                    break;
                case 3:
                    sp.modificarPass();
                    break;
                case 4:
                    sp.modicarNombre();
                case 5:
                    sp.modicarDNI();
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
            }

        } while (opc != 6);

    }
}
