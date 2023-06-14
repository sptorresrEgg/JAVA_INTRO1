/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosAlumno;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 *
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
 * calcular su nota final y se lo busca en la lista de Alumnos. Si está en la
 * lista, se llama al método. Dentro del método se usará la lista notas para
 * calcular el promedio final de alumno. Siendo este promedio final, devuelto
 * por el método y mostrado en el main.
 */
public class ServiciosAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> crearListaAlumno() {
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        boolean valida = true;
        do {
            Alumno a1 = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            a1.setNombre(leer.next());
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i + 1));
                notas.add(leer.nextInt());

            }
            a1.setNotas(notas);
            listaAlumnos.add(a1);
            System.out.println("Desea ingresar otro alumno S/N");
            if (leer.next().equalsIgnoreCase("N")) {
                valida = false;
            }
        } while (valida);
        return listaAlumnos;

    }

    public double buscarAlumno(ArrayList<Alumno> listaAlumnos) {
        System.out.println("Ingrese el alumno que desea calcular la nota final");
        String alumnoABuscar = leer.next();

        double notafinal = 0;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(alumnoABuscar)) {

                notafinal = notaPromedio(alumno);

            }

        }
        return notafinal;

    }

    public double notaPromedio(Alumno a1) {
        int suma = 0;
        for (Integer nota : a1.getNotas()) {
            suma = suma + nota;
        }

        return (suma / 3);
    }

}
