
package main;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. 
* Una vez creada la fecha de tipo Date,deberemos mostrarla y mostrar cuantos años
hay entre esa fecha y la fecha actual, que se puede conseguir instanciando un objeto Date con constructor vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        // TODO code application logic here
        
        /*Date fechaActual = new Date(); //fecha en este momento
        Date fechaNacimiento = new Date(1972-1900, 7-1, 10);//instancio enviando valores
        String textoFechaActual = fechaActual.toString();//obtengo el contenido de la fecha
        System.out.println(textoFechaActual); //imprimo lafecha
        String textoFechaNacimiento = fechaNacimiento.toString();
        System.out.println(textoFechaNacimiento);
        long milisegundosfechaActual =fechaActual.getTime();//expreso la fecha en milisegundos
        long milisegundosfechaNacimiento =fechaNacimiento.getTime();
        System.out.println("Milisegundos hoy " + milisegundosfechaActual );
        System.out.println("Milisegundos fecha nacimiento " + milisegundosfechaNacimiento);*/
        
        Calendar c1 = new GregorianCalendar();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        c1.set(anio, mes, dia);
        System.out.println("La fecha ingresada es : " +c1.get(Calendar.DATE) + "/" + c1.get(Calendar.MONTH) + "/" +c1.get(Calendar.YEAR) );
        Date fechaActual = new Date();
        c1.setTime(fechaActual);
        int aniofa = c1.get(Calendar.YEAR);
        int mesfa = c1.get(Calendar.MONTH);
        int diafa = c1.get(Calendar.DATE);
        System.out.println("La fecha actual es : " +c1.get(Calendar.DATE) + "/" + c1.get(Calendar.MONTH) + "/" +c1.get(Calendar.YEAR));
        System.out.println("La diferencia de años entre las dos fechas es : " + Math.abs(aniofa - anio)+ " años");
        //Date fecha = c1.getTime();
        //System.out.println(fecha.toString());
        
        
    }
    
}
