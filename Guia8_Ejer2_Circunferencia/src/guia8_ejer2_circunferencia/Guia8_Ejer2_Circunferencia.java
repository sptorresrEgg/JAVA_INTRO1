/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia8_ejer2_circunferencia;
import Entidad.Circunferencia;
import java.util.Scanner; 
import servicioCircunferencia.serviciosCircunferencia;
/**
 
 */
public class Guia8_Ejer2_Circunferencia {

    
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner leer = new Scanner(System.in);  
      serviciosCircunferencia sc = new serviciosCircunferencia();
      Circunferencia C1  = sc.crearCircunferencia();
      sc.calcularArea(C1);
      sc.calcularPerimetro(C1);
    }

}
