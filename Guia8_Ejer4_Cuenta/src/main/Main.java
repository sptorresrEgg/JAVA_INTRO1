/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidad.Cuenta;
import Servicios.ServiciosCuenta;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosCuenta sc1 = new ServiciosCuenta();
        Cuenta c1 = sc1.crear();
        System.out.println(c1.toString());
        int opc;
        do{
            System.out.println("----Menu Operaciones Bancarias----");
            System.out.println("             1. Consignar");
            System.out.println("             2. Retirar");
            System.out.println("             3. Retiro Rapido");
            System.out.println("             4. Consultar Saldo");
            System.out.println("             5. Consultar Extracto");
            System.out.println("             6. Salir");
            System.out.println("");
            System.out.println("Ingrese una Opcion");
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    sc1.Consignar(c1);
                    break;
                case 2:
                    sc1.retirar(c1);
                    break;
                case 3:
                    sc1.extraccionRapida(c1);
                    break;
                case 4:
                    sc1.consultarSaldo(c1);
                    break;
                case 5:
                    sc1.consultarExtracto(c1);
                    break;
                default:
                    System.out.println("La opción ingresada no es valida, intente de nuevo");
                    break;
            }
                
        }while(opc!=6);
        //System.out.println(c1.toString());
        
        
        
        
    }
    
}
