/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sevicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
* 
* Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
* 
* Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
* 
 */
public class ServiciosPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona (){
        char sexo;
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese el edad de la persona");
        int edad = leer.nextInt();
       do {
            System.out.print("Ingrese el sexo (H/M/O): ");
            sexo = leer.next().charAt(0);
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        
        System.out.println("Ingrese altura de la persona");
        double altura = leer.nextDouble();
        System.out.println("Ingrese peso de la persona");
        double peso = leer.nextDouble();
        return new Persona(nombre,edad,sexo,peso,altura);
    }  
    public int  calcularImc(Persona p1){
       
        double imc;
        imc = p1.getPeso() /(p1.getAltura()*p1.getAltura());
        if(imc > 20){
             return -1;
            
        }else if(imc >= 20 && imc <=25 ){
             return 0;
        } else{
             return 1;
        }
       
        
    }    
    
    public boolean mayorEdad(Persona p1){
        return p1.getEdad()>=18;
        
    }

}
    

