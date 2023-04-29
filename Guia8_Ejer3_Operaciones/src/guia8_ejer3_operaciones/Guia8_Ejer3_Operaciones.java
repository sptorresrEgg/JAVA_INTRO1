/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia8_ejer3_operaciones;
import Entidad.Operacion;
import Servicios.ServiciosOperaciones;
import java.util.Scanner;
/**
 
 */
public class Guia8_Ejer3_Operaciones {

    
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner leer = new Scanner(System.in);  
      ServiciosOperaciones s1 = new ServiciosOperaciones();
      Operacion o1 = s1.crearOperacion();
      System.out.println(o1.toString());
      s1.menuOperaciones(o1);
        
    }

}
