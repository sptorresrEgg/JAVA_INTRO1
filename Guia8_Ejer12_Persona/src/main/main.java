/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Persona;
import java.util.Scanner;
import servicios.ServiciosPersona;

/**
 *
 * @author sptorresr
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anio;
        int mes;
        int dia;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el nombre de la persona :");
        String nombre = leer.next();
        do {
            System.out.println("Ingrese el año de nacimiento");
            anio = leer.nextInt();
        } while (anio >= 2023);
        do {
            System.out.println("Ingrese el mes de nacimiento");
            mes = leer.nextInt();
        } while (mes > 12);

        System.out.println("Ingrese el dia de nacimiento");
        dia = leer.nextInt();
        int valida = 0;
        do {
            if (mes == 2 && (anio % 2 != 0) && dia > 28) {
                System.out.println("El dia ingresado no corresponde, ingrese nuevamente el dia(año no bisiesto)");
                dia = leer.nextInt();
                continue;
            }
            if (mes == 2 && (anio % 2 == 0) && dia > 29) {
                System.out.println("El dia ingresado no corresponde, ingrese nuevamente el dia(año bisiesto)");
                dia = leer.nextInt();
                continue;
            }
            valida = 1;
        } while (valida != 1);
        ServiciosPersona sp = new ServiciosPersona();
        Persona p1 = sp.CrearPersona(nombre, anio, mes, dia);
        System.out.println("La edad de " + p1.getNombre() + " es " + sp.CalcularEdad (p1) + " años" );
        
        System.out.println("Ingrese la edad a comparar");
        int edad2 = leer.nextInt();
        System.out.println("La edad ingresada es menor que la edad de " + p1.getNombre()+"? :" + sp.menorQue(p1, edad2));
        sp.mostrarPersona(p1);

    }

}
