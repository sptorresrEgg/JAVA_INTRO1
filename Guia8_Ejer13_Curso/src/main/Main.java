/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Servicios.ServiciosCurso;
import entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        // TODO code application logic here
        String [] alum = new String[2];
        ServiciosCurso sc = new ServiciosCurso();
        
        System.out.println("Ingrese el nombre del curso");
        String nombreCurso = leer.next();
        System.out.println("Ingrese cantidad de horas al dia");
        int cantidadHorasDia = leer.nextInt();
        System.out.println("Ingrese la cantidad de dias");
        int cantidadDiasSemana = leer.nextInt();
        System.out.println("Ingrese turno Diurno / Nocturno");
        String turno = leer.next();
        System.out.println("Ingrese el valor de la hora");
        int precioHora = leer.nextInt();
        
        Curso c1 = sc.crearCurso(nombreCurso, cantidadHorasDia, cantidadDiasSemana, turno, precioHora);
        System.out.println("La ganacia para el curso " + c1.getNombreCurso() + " es $: " + sc.calcularGananciaSemanal(c1) );
        System.out.println(c1.toString());
        c1.mostraralumnos();
    }
    
}
