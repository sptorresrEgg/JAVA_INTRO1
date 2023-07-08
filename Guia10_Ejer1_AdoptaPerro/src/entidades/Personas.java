/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
 */
public class Personas {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private Mascotas mascota;

    public Personas() {
    }

    public Personas(String nombre, String apellido, int edad, int dni, Mascotas mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Mascotas getMascota() {
        return mascota;
    }

    public void setMascota(Mascotas mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", mascota=" + mascota.getNombre() + 
                ", raza=" + mascota.getRaza()+ ", tamaño=" + mascota.getTamano()+ '}';
    }
    
}
