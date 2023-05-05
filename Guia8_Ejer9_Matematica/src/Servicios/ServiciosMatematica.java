/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Matematica;
import java.util.Scanner;

/**
 a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class ServiciosMatematica {
    Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    public Matematica crearnumeros(){
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        return new Matematica(num1, num2);
    }
    
    public double devolverMayor(Matematica m1){
        return Math.max(m1.getNumero1(), m1.getNumero2());
    }
    
    public double calcularPotencia(Matematica m1){
        return  Math.pow(Math.max(m1.getNumero1(), m1.getNumero2()), Math.min(m1.getNumero1(), m1.getNumero2()));
        
    }
    
    public double calcularRaiz(Matematica m1){
        return    Math.sqrt(Math.abs(Math.min(m1.getNumero1(), m1.getNumero2())))  ;
    }
    
}
