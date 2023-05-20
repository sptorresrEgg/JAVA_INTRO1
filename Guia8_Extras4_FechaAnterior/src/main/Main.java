/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import servicios.ServiciosFecha;

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
        ServiciosFecha sf = new ServiciosFecha();
        sf.crearFecha();
        sf.CantidadDias();
        sf.diaAnterior();
        
    }
    
}
