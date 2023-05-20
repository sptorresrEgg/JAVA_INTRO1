/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. 
 */
public class Curso {
    private String nombreCurso;
    private int cantidadHorasDia;
    private int cantidadDiasSemana;
    private String turno;
    private int precioHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }

   

    public Curso(String nombreCurso, int cantidadHorasDia, int cantidadDiasSemana, String turno, int precioHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasDia = cantidadHorasDia;
        this.cantidadDiasSemana = cantidadDiasSemana;
        this.turno = turno;
        this.precioHora = precioHora;
    }
      public Curso(String nombreCurso, int cantidadHorasDia, int cantidadDiasSemana, String turno, int precioHora,String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasDia = cantidadHorasDia;
        this.cantidadDiasSemana = cantidadDiasSemana;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
    }
   

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasDia() {
        return cantidadHorasDia;
    }

    public void setCantidadHorasDia(int cantidadHorasDia) {
        this.cantidadHorasDia = cantidadHorasDia;
    }

    public int getCantidadDiasSemana() {
        return cantidadDiasSemana;
    }

    public void setCantidadDiasSemana(int cantidadDiasSemana) {
        this.cantidadDiasSemana = cantidadDiasSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    public void cargarAlumnos(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre de alumno");
            String alum = leer.next();
            alumnos[i]=alum;
            
            
        }
    }
    
    public void mostraralumnos(){
         for (int i = 0; i < 5; i++) {
             System.out.println(alumnos[i]);
            
            
        }
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantidadHorasDia=" + cantidadHorasDia + ", cantidadDiasSemana=" + cantidadDiasSemana + ", turno=" + turno + ", precioHora=" + precioHora + ", alumnos=" + alumnos + '}';
    }
    
    
    
    
}
