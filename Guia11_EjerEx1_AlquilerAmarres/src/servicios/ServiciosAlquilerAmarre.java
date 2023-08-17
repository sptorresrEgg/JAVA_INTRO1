/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.AlquilerAmarre;
import entidad.Barco;
import entidad.BarcoMotor;
import entidad.Velero;
import entidad.Yate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Un alquiler se calcula multiplicando el número de días de ocupación
 * (calculado con la fecha de alquiler y devolución), por un valor módulo de
 * cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
 * En los barcos de tipo especial el módulo de cada barco se calcula sacando el
 * módulo normal y sumándole el atributo particular de cada barco. En los
 * veleros se suma el número de mástiles, en los barcos a motor se le suma la
 * potencia en CV y en los yates se suma la potencia en CV y el número de
 * camarotes.
 */
public class ServiciosAlquilerAmarre {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    AlquilerAmarre a1 = new AlquilerAmarre();
    Velero v1 = new Velero();
    Yate y1 = new Yate();
    BarcoMotor bm1 = new BarcoMotor();
    public AlquilerAmarre crearAlquiler() throws Exception {
        
        System.out.println("Ingrese el nombre :");
        a1.setNombre(leer.next());
        System.out.println("Ingrese el DNI");
        a1.setDni(leer.nextInt());
        System.out.println("Ingrese Fecha de alquiler (mm/dd/aaaa)");
        a1.setFechaAlquiler(leer.next());
        System.out.println("Ingrese Fecha de devolucion (mm/dd/aaaa)");
        a1.setFechaDevolucion(leer.next());
        System.out.println("Ingrese pocision de amarre");
        a1.setPosiciónAmarre(leer.next());
        crearBarco();
        return a1;
    }
    
    public void crearBarco() throws Exception{
        
        
        
        System.out.println("Ingrese el tipo de Barco (1. Velero, 2.Motor, 3. Yate)");
        int tipo = leer.nextInt();
        switch (tipo) {
            case 1:
                System.out.println("Ingrese Matricula");
                v1.setMatricula(leer.nextInt());
                System.out.println("Ingrese Eslora");
                v1.setEslora(leer.nextLong());
                System.out.println("Ingrese Año de Fabricacion");
                v1.setYearFabricacion(leer.nextInt());
                System.out.println("Ingrese Cantidad de Mastiles");
                v1.setCantidadMastiles(leer.nextInt());
                a1.setBarco(v1);
                calcularAlquiler(1,a1);
                break;
            case 2:
                System.out.println("Ingrese Matricula");
                bm1.setMatricula(leer.nextInt());
                System.out.println("Ingrese Eslora");
                bm1.setEslora(leer.nextLong());
                System.out.println("Ingrese Año de Fabricacion");
                bm1.setYearFabricacion(leer.nextInt());
                System.out.println("Ingrese Potencia");
                bm1.setPotencia(leer.nextInt());
                a1.setBarco(bm1);
                calcularAlquiler(2,a1);
                break;
            case 3:
                System.out.println("Ingrese Matricula");
                y1.setMatricula(leer.nextInt());
                System.out.println("Ingrese Eslora");
                y1.setEslora(leer.nextLong());
                System.out.println("Ingrese Año de Fabricacion");
                y1.setYearFabricacion(leer.nextInt());
                System.out.println("Ingrese Potencia");
                y1.setPotencia(leer.nextInt());
                System.out.println("Cantidad de camarotes");
                y1.setCantidadCamarotes(leer.nextInt());
                a1.setBarco(y1);
                calcularAlquiler(3,a1);
                break;
         
        }  
        
        
       
        
    }
    
    public void calcularAlquiler(int tipo, AlquilerAmarre a1) throws Exception{
        long dias = calcularDias(a1);
        long valorAlquiler;
        switch (tipo) {
            case 1:
                valorAlquiler = (long) (dias*(10*(a1.getBarco().getEslora()))+v1.getCantidadMastiles());
                System.out.println("el valor de alquiler de el velero es " + valorAlquiler);
                System.out.println("Los datos del cliente y el barco son :" + a1.toString());
                break;
            case 2:
                valorAlquiler = (long) (dias*(10*(a1.getBarco().getEslora()))+bm1.getPotencia());
                System.out.println("el valor de alquiler de el velero es " + valorAlquiler);
                System.out.println("Los datos del cliente y el barco son :" + a1.toString());
                break;
            case 3:
                valorAlquiler = (long) (dias*(10*(a1.getBarco().getEslora()))+y1.getPotencia()+y1.getCantidadCamarotes());
                System.out.println("el valor de alquiler de el velero es " + valorAlquiler);
                System.out.println("Los datos del cliente y el barco son :" + a1.toString());
                break;
                
        }
        
    }
    
    public long calcularDias(AlquilerAmarre a1)throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date fechaInicial = sdf.parse(a1.getFechaAlquiler());
        Date fechaFinal = sdf.parse(a1.getFechaDevolucion());

        long diff = fechaFinal.getTime() - fechaInicial.getTime();

        TimeUnit time = TimeUnit.DAYS; 
        long diferencia = time.convert(diff, TimeUnit.MILLISECONDS);
        
        
        return diferencia;
    }
}
