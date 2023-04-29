/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;
import Entidad.Rectangulo;
import java.util.Scanner;
/**
 La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class ServiciosRectangulo {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        public Rectangulo crearRectangulo(){
            Rectangulo r1 = new Rectangulo();
            System.out.println("Ingrese la base :");
            r1.setBase(leer.nextInt());
            System.out.println("Ingrese la altura");
            r1.setAltura(leer.nextInt());
            return r1;
        }
        
       public void calcularSuperficie( Rectangulo r1){
           
           System.out.println("La superficie es "+ r1.getBase()*r1.getAltura());
       }
       
       public void calcularPerimetro(Rectangulo r1){
          
           System.out.println( "El perimetro es " + (r1.getBase() + r1.getAltura())*2);
       } 
       
       public void dibujarRectangulo(Rectangulo r1){
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                if (i==0 || i==r1.getAltura()-1 || j==0 || j==r1.getBase()-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
	
       } 
}
