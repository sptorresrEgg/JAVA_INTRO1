/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidad.Cadena;
import Servicios.ServiciosCadena;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServiciosCadena sc = new ServiciosCadena();
        Cadena c1 = sc.crearCadena();
        sc.invertirFrase(c1);
        sc.mostrarVovales(c1);
        System.out.println(c1.toString());
        System.out.println("Ingrese el caracter que desea buscar");
        char letraContar = leer.next().charAt(0);
        sc.vecesRepetido(c1, letraContar);
        System.out.println("Ingrese una segunda frase");
        String frase2 = leer.next();
        sc.compararLongitud(c1, frase2);
        System.out.println("Ingrese una frase que desee unir a la frase original");
        String frase3 = leer.next();
        sc.unirFrase(c1, frase3);
        System.out.println("Ingrese un caracter para buscar si esta contenido");
        String letra2 = leer.next();
        System.out.println(sc.contieneLetra(c1, letra2));
        
    }
    
    
}
