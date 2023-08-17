/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.AlquilerAmarre;
import entidad.Barco;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import servicios.ServiciosAlquilerAmarre;

/**
 *
 * @author sptorresr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   
        // TODO code application logic here
     public static void main(String[] args) throws Exception  {
         
        ServiciosAlquilerAmarre sa1 = new ServiciosAlquilerAmarre();
        AlquilerAmarre aa1 = new AlquilerAmarre();
        Barco b1= new Barco();
        aa1 = sa1.crearAlquiler();
        
        //System.out.println(aa1.toString());
          
        
    }   
}    

