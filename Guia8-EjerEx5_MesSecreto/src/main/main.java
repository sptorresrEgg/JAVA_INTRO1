/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.MesSecreto;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

/**
 A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MesSecreto ms = new MesSecreto();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int messecreto;
        String mesadivinar;
        messecreto=ThreadLocalRandom.current().nextInt(0, 11);
        System.out.println(messecreto);
        //ms.mostrarMeses();
        System.out.println("Ingrese el mes en minusculas");
        String mesUsuario = leer.next();
        //ms.adivinar(mesUsuario);
     
        
        //messadivinar = ms.getMeses([messecreto]);

        //return new Nif(DNI, digito[(int)modulo]);
    }
    
}
