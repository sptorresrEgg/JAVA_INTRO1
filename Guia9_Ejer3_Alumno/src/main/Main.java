/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
 */
package main;

import entidad.Alumno;
import java.util.ArrayList;
import serviciosAlumno.ServiciosAlumno;

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
        ServiciosAlumno s1 = new ServiciosAlumno();

        ArrayList<Alumno> alumnos = s1.crearListaAlumno();
        double notafinal = s1.buscarAlumno(alumnos);
        if (notafinal > 0) {
            System.out.println("La nota final es" + notafinal);
        } else {
            System.out.println("El alumno no fue encontrado");
        }

        //System.out.println(alumnos.toString());
    }

}
