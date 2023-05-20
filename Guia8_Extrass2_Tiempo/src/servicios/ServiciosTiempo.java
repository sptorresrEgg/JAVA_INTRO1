/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Tiempo;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class ServiciosTiempo {
    
    public Tiempo crear(){
        int hora, minuto, segundo;
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do{
        System.out.println("Ingrese la hora ");
        hora = leer.nextInt();
        }while(hora >23);
        do{
        System.out.println("Ingrese los minutos  ");
        minuto = leer.nextInt();
        }while(minuto >60);
        do{
        System.out.println("Ingrese los segundos ");
        segundo = leer.nextInt();
        }while(segundo >60);
        return new Tiempo(hora, minuto, segundo);
    }
    
    public void mostrarHora(Tiempo t1){
       
        System.out.println("La hora es " + t1.getHora()+":"+t1.getMinutos()+":"+ t1.getSegundos());
 
        
    }
    
    public void reloj(Tiempo t1){
        t1.setSegundos(t1.getSegundos() + 1);
        if (t1.getSegundos() >= 60) {
            t1.setSegundos(0);
            t1.setMinutos(t1.getMinutos() + 1);
            if (t1.getMinutos() >= 60) {
                t1.setMinutos(0);
                t1.setHora(t1.getHora() + 1);
                if (t1.getHora() >= 24) {
                    t1.setHora(0);
                }
            }
        }
    }
    
}
