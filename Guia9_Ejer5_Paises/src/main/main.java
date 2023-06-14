/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import entidad.Paises;
import java.util.ArrayList;
import servicios.ServiciosPaises;
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
     ArrayList<Paises> listaPaises = sp.crearListaPaises();
     
        
    }
    
}
