/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidad.Curso;
import java.util.Scanner;

/**
 * método cargarAlumnos(): este método le permitirá al usuario ingresar los
 * alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta
 * información en un arreglo e iterar con un bucle, solicitando en cada
 * repetición que se ingrese el nombre de cada alumno.
 
 * Método crearCurso(): el método crear curso, le pide los valores de los atributos al
   usuario y después se le asignan a sus respectivos atributos para llenar el objeto
   Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
   al atributo alumnos
   * 
   *Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
    en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
    día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
    se repite el encuentro.
 */
public class ServiciosCurso {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Curso crearCurso(String nombreCurso, int cantHorasDia, int cantDiasSemana, String turno, int valorHora) {
        String [] alumnos = new String[5];
        alumnos = cargarAlumnos();
        return new Curso(nombreCurso, cantHorasDia, cantDiasSemana, turno, valorHora, alumnos);

    }

    public  String [] cargarAlumnos(){
    String[] alumnos = new String [5];
        
    for (int i = 0;i< 5; i++) {
            
            System.out.println("Ingrese nombre del alumno");
            alumnos[i] = leer.next();
    }
    return alumnos;
    
    }
    
    public int calcularGananciaSemanal(Curso c1){
        
        int ganancia = c1.getCantidadHorasDia()*c1.getCantidadDiasSemana()*c1.getPrecioHora()*c1.getAlumnos().length;
        
        return ganancia;
    }
   
}
