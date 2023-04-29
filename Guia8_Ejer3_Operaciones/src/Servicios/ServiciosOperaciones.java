/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;
import Entidad.Operacion;
import java.util.Scanner;
/**
 *
 * @author sptorresr
 */
public class ServiciosOperaciones {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        public Operacion crearOperacion () {
            int num1; int num2;
            do{
                System.out.println("Ingrese primer numero ");
                num1 =leer.nextInt();
                System.out.println("Ingrese segundo numero");
                num2 = leer.nextInt();
                }while(num1==0 || num2==0);
                return new Operacion(num1, num2);
                
            
           
        }

            
        
        
        public void menuOperaciones( Operacion o1){
            int opc;
            do{
                System.out.println("----------Menu Operaciones -----");
                System.out.println("");
                System.out.println("          1. Sumar");
                System.out.println("          2. Restar");
                System.out.println("          3. Multiplicar");
                System.out.println("          4. Dividir");
                System.out.println("          5. Salir");
                System.out.println("");
                System.out.println("Ingrese una Opcion");
                opc = leer.nextInt();
                
                switch(opc){
                    case 1:
                        int suma = o1.getNum1()+o1.getNum2();
                        System.out.println("La suma es :"  + suma );
                        break;
                    case 2:
                        int resta = o1.getNum1()-o1.getNum2();
                        //System.out.println("La resta es :"  + o.getNum1() - o.getNum2() );
                        System.out.println("La resta es " + resta);
                        break;
                    case 3:
                        int multiplicacion = o1.getNum1()* o1.getNum2();
                        System.out.println("La multiplicacion es :"  + multiplicacion );
                        break;
                    case 4:
                        int division = o1.getNum1() / o1.getNum2();
                        System.out.println("La division es :" +  division );
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("La opcion ingresada no es valida");
                }
                
                
            }while(opc != 5);
        }
        


}
