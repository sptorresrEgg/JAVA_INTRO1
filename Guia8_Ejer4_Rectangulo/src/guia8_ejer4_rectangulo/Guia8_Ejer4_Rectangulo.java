/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia8_ejer4_rectangulo;
import Entidad.Rectangulo;
import Servicios.ServiciosRectangulo;

/**

 */
public class Guia8_Ejer4_Rectangulo {

    
    public static void main(String[] args) {
        // TODO code application logic here
      ServiciosRectangulo s1 = new ServiciosRectangulo();
      Rectangulo r1 = s1.crearRectangulo();
      s1.calcularSuperficie(r1);
      s1.calcularPerimetro(r1);
      s1.dibujarRectangulo(r1);
    }
    
    

}
