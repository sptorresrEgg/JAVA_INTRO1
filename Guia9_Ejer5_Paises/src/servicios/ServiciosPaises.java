/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;
import entidad.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class ServiciosPaises {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
     public ArrayList<Paises> crearListaPaises (){
         ArrayList<Paises> listaPaises = new ArrayList();
         boolean valida = true;
         do {
             Paises pais = new Paises();
             System.out.println("Ingrese el nombre de un pais");
             pais.setNombrePais(leer.next());
             listaPaises.add(pais);
             System.out.println("Desea ingresar otr país S/N");
            if (leer.next().equalsIgnoreCase("N")) {
                valida = false;
            }
         }while(valida);
         return listaPaises;
     }
     
     
}

