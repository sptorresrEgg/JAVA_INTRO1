/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaración del objeto Perro
        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.alimentarse();
        //Declaración del objeto Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();
        //Declaración del objeto Gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.alimentarse();
        //Declaración del objeto Caballo
        Animal caballo1 = new Perro("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();
        
        
    }
    
}
