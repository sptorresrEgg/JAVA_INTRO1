/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servicioCircunferencia;
import java.util.Scanner;
import Entidad.Circunferencia;
import java.lang.*;

/**
 *
 * @author sptorresr
 */
public class serviciosCircunferencia {
 
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
    public Circunferencia crearCircunferencia(){
         System.out.println("Ingrese el radio de la circunferencia");
         double radio = leer.nextDouble();
         Circunferencia C = new Circunferencia(radio);
         return (C);
     }
    
    public void calcularArea(Circunferencia C){
        //int area = PI*Math.pow(0, 0);
         double area = (Math.PI)*(Math.pow(C.getRadio(), 2));
         System.out.println("El area es :" + area);
    }
     
    public void calcularPerimetro(Circunferencia C){
        double perimetro = 2*(Math.PI)*C.getRadio();
        System.out.println("El Perimetro es :" + perimetro);
    } 


}
