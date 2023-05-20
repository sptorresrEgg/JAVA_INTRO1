/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Tiempo;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import servicios.ServiciosTiempo;

/**
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int control=0;
        ServiciosTiempo st = new ServiciosTiempo();
        Tiempo t1 = st.crear();
        try {
			 do{
            
                st.reloj(t1);
                TimeUnit.SECONDS.sleep(1);
                st.mostrarHora(t1); 
                
            }while(control ==0);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

        
       
        
    }
    

