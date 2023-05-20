/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosMovil;

import entidad.Movil;
import java.util.Scanner;

/**
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 */
public class ServiciosMovil {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
   public Movil cargarCelular(String Marca, int precio, String modelo, int memoriaRam, int almacenamiento){
       
       return new Movil(Marca, precio, modelo, memoriaRam, almacenamiento);
   }
   
   public void cargarCodigo(Movil m1){
       int [] codigo = new int [7];
       for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el digito " + (i+1) + " del codigo" );
            codigo[i]=leer.nextInt();
        }
        m1.setCodigo(codigo);
       
   }
    
}
