/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

import java.util.Scanner;
/**
 *
 * @author sptorresr
 */
public class Persona {
    private String nombre;
    private int edad;
    private String pais;
    private boolean estudianteEgg;
    
   //Constructor Vacio o por defecto
    public Persona(){
        
    }
    
    //contructor por parametros

    public Persona(String nombre, int edad, String pais, boolean estudianteEgg) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.estudianteEgg = estudianteEgg;
    }
    
    //metodos set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setEstudianteEgg(boolean estudianteEgg) {
        this.estudianteEgg = estudianteEgg;
    }
    
    //metodos get

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPais() {
        return pais;
    }

    public boolean isEstudianteEgg() {
        return estudianteEgg;
    }
    
    
    //metodo tostring

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", pais=" + pais + ", estudianteEgg=" + estudianteEgg + '}';
    }
    
    
    
    


}
