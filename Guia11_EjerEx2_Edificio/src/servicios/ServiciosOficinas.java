/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.EdificioOficinas;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class ServiciosOficinas {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EdificioOficinas eo1 = new EdificioOficinas();
    
    public void crearEdificioOficinas(){
        System.out.println("Ingrese el ancho del edificio");
        eo1.setAncho(leer.nextInt());
        System.out.println("Ingrese el alto del edificio");
        eo1.setAlto(leer.nextInt());
        System.out.println("Ingrese el largo del edificio");
        eo1.setLargo(leer.nextInt());
        System.out.println("Ingrese el numero de oficinas por piso del edificio");
        eo1.setNumeroOficinas(leer.nextInt());
        System.out.println("Ingrese la cantidad de personas que caben en una oficina");
        eo1.setPersonasPorOficina(leer.nextInt());
        System.out.println("Ingrese el numero de pisos");
        eo1.setNumeroPisos(leer.nextInt());
        
    }
    
    public void cantPersonas(){
        int cantPersonas;
        cantPersonas= eo1.getPersonasPorOficina()*eo1.getNumeroOficinas();
        System.out.println("Las personas que caben por piso son : " + cantPersonas);
        System.out.println("La cantidad de personas que caben en el edificio son " + cantPersonas * eo1.getNumeroPisos());
        
    }
}
