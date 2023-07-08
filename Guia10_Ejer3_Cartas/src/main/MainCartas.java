/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import entidad.Baraja;
import entidad.Carta;
import java.util.Scanner;
import servicios.ServiciosBaraja;

/**
 Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
 */
public class MainCartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiciosBaraja sb = new ServiciosBaraja();
        Baraja b1 = sb.crearBaraja();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        do{ 
            System.out.println("-----Menu Baraja ------");
        System.out.println("1.  Barajar");
        System.out.println("2.  Cartas disponibles");
        System.out.println("3.  Dar Cartas");
        System.out.println("4.  Cartas Monton");
        System.out.println("5.  Mostrar Cartas");
        System.out.println("6.  Salir");
        opc = leer.nextInt();
        switch(opc){
            case 1:
                sb.barajar(b1);
                break;
            case 2:
                sb.cartasDisponibles(b1);
                break;
            case 3:
                sb.darCartas(b1);
                break;
            case 5:
                sb.mostrarBaraja(b1);
                break;
            case 4:
                sb.cartasMonton(b1);
                break;
            case 6:
                System.out.println("Gracias por usar esta baraja");
                break;
            default:
                System.out.println("La opción ingresada no es valida intente de nuevo");
                     
        }
        }while(opc!=6);
        
        
    }
    
}
