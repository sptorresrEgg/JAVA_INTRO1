/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Paises;
import java.util.ArrayList;
import java.util.HashSet;
import servicios.ServiciosPaises;
import java.lang.String;

/**
 *
 * @author sptorresr
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ServiciosPaises sp = new ServiciosPaises();
        HashSet<String> listaPaises = sp.crearListaPaises();
        sp.mostrarPaises(listaPaises);
        sp.eliminarPaises(listaPaises);
        sp.mostrarPaises(listaPaises);
        
        

    }

}
