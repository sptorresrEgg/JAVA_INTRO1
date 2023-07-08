/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
 */
public class Jugador {
    private int id;
    private String nombre;
    boolean mojado;

    public Jugador(int id) {
        
        this.nombre="Jugador"+id;
        this.mojado=false;
        this.id=id;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
     public void disparo(Revolver r1, Jugador j1){
        j1.setMojado(r1.mojar());
        r1.siguienteChorro();
        
        
    }
    

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
    
}
