/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import Entidad.Cafetera;
import Servicios.ServiciosCafetera;
import java.util.*;
/**
 *
 * @author sptorresr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        // TODO code application logic here
        ServiciosCafetera sc1 = new ServiciosCafetera();
        Cafetera c1 = sc1.crearCafetera();
        
        int opc;
        do{
            System.out.println("----Menu Operaciones Bancarias----");
            System.out.println("             1. Llenar Cafetera");
            System.out.println("             2. Servir Taza");
            System.out.println("             3. Vaciar Cafetera");
            System.out.println("             4. Agregar Cafe");
            System.out.println("             5. Salir");
            System.out.println("");
            System.out.println("Ingrese una Opcion");
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    sc1.llenarCafetera(c1);
                    break;
                    
                case 2:
                     System.out.println("Ingrese el tamaño de la taza");
                     int size = leer.nextInt();
                     sc1.servirtaza(size,c1);
                     break;
                
                case 3:
                    sc1.vaciarCafetera(c1);
                    break;
                
                case 4:
                    System.out.println("Cuanto cafe le vas a echar a la cafetera");
                    int size1 = leer.nextInt();
                    sc1.agregarCafe(size1, c1);
                    break;
                    
                case 5:
                    break;
                default:
                    System.out.println("La opción ingresada no es valida, intente de nuevo");
                    break;
            }
                
        }while(opc!=5);
        
    
        
        
        
       
        
        
        
       
    }
    
}
