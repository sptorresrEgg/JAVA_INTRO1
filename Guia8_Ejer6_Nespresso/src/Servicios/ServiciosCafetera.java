/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.Cafetera;
import java.util.*;

/**
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
* Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
* Método vaciarCafetera(): pone la cantidad de café actual en cero.
* Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class ServiciosCafetera {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Cafetera crearCafetera(){
        System.out.println("Ingrese la capacidad maxima de su cafetera");
        int capMax = leer.nextInt();
       return new Cafetera(capMax);        
    }
   
    public void llenarCafetera(Cafetera c1){
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("Tu cafetera fue llenada con " + c1.getCantidadActual() + " mililitros");
    }
    
    public void servirtaza(int size, Cafetera c1){
        if(c1.getCantidadActual()==0){
            System.out.println("Lo sentimos la cafetera esta desocupada");
        }
        else if(c1.getCantidadActual() > size){
            c1.setCantidadActual(c1.getCantidadActual()-size);
            System.out.println("Cafe servido");
        }else{
            System.out.println("No hay suficiente cafe para llenar la taza, serviremos lo que queda");
            c1.setCantidadActual(0);
            System.out.println("Se acabo el cafe, vuelve a llenar tu cafetera"); 
        }
       
    }
    
    public void vaciarCafetera(Cafetera c1){
        c1.setCantidadActual(0);
        System.out.println("Su cafetera fue Vaciada");
    }
    
    public void agregarCafe(int cantidad, Cafetera c1){
        if(cantidad > c1.getCapacidadMaxima()-c1.getCantidadActual()){
            System.out.println("Es demasiado cafe solo ingresa " +(c1.getCapacidadMaxima()-c1.getCantidadActual()));
        }else{
            c1.setCantidadActual(c1.getCantidadActual()+cantidad);
            System.out.println("Tu cafetera quedo con " + c1.getCantidadActual() + " mililitros");
        }
        
    }
    
    
    
    
}