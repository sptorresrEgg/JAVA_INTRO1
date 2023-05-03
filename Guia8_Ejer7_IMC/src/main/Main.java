/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidad.Persona;
import Sevicios.ServiciosPersona;
import java.util.ArrayList;

/**
 *
 * @author sptorresr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // ArrayList<String> lista = new ArrayList<String>();
        ArrayList<Persona> personas = new ArrayList<>();
        ServiciosPersona sp = new ServiciosPersona();
        Persona p1 = sp.crearPersona();
        Persona p2 = sp.crearPersona();
        Persona p3 = sp.crearPersona();
        Persona p4 = sp.crearPersona();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);

   
        double sobrepeso=0, debajoPesoIdeal=0,pesoIdeal=0; 
        double mayor=0 , menor=0;
        
        for (int i = 0; i < personas.size(); i++) {
            double imc;
            
            
            //System.out.println(personas.get(i));
            imc = sp.calcularImc(personas.get(i));

            if (imc == 1) {
                System.out.println("Esta persona tiene SOBREPESO");
                sobrepeso++;
            } else if (imc == -1) {
                System.out.println("Esta person esta por debajo de su peso ideal");
                debajoPesoIdeal++;    
            } else {
                System.out.println("Esta persona esta en su peso ideal");
                pesoIdeal++;
            }
             if(sp.mayorEdad(personas.get(i))){
                 mayor++;
             }else{
                 menor++;
             }
        }
        System.out.println("En sobrepeso estan el " +  ((sobrepeso/4)*100)+ "%");
        System.out.println("En debajo de su peso ideal estan el " +  ((debajoPesoIdeal/4)*100)+ "%");
        System.out.println("En su peso ideal estan el " +  ((pesoIdeal/4)*100)+ "%");
        System.out.println("El porcentaje de mayores de edad es " +  ((mayor/4)*100)+ "%");
        System.out.println("El porcentaje de menores de edad es " +  ((menor/4)*100)+ "%");

    }

    
}


