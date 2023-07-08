/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Mascotas;
import entidades.Personas;

/**
 * Esta es relacion de agregacion uno a uno****
 * 
 * 
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class MainAdopciones {
    public static void main(String[] args){
        Personas[] owner = new Personas[2];
        owner[0] = new Personas("Sandra","Torres",51,52556727,null);
        owner[1] = new Personas("Duvan","Gomez",48,79861046,null);
        
        Mascotas[] dog = new Mascotas[2];
        dog[0] = new Mascotas("Firulays","Snauzer" , 1, "Grande");
        dog[1] = new Mascotas("Akila","Chihuahua" , 1, "pequeño");
        
        for (int i = 0; i < owner.length; i++) {
            owner[i].setMascota(dog[i]);
        }
        
        for (Personas persona : owner) {
            System.out.println(persona.toString());
        }
        
    }
    
}
