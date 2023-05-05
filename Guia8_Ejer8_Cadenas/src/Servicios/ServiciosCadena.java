/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cadena;
import java.util.Scanner;
import java.lang.*;

/**
 Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
* Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

* Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:

* Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.

* Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.

* Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
* 
* Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
public class ServiciosCadena {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cadena crearCadena(){
            System.out.println("Ingrese la frase inicial");
            String cad = leer.next();
            int size = cad.length();
    return new Cadena(cad,size);
    }
   /* for(int x=0;x<sPalabra.length();x++) {
 if ((sPalabra.charAt(x)=='a') || (sPalabra.charAt(x)=='e') || (sPalabra.charAt(x)=='i') || (sPalabra.charAt(x)=='o') || (sPalabra.charAt(x)=='u')){ 
    contador++;
  }
}*/
    public void mostrarVovales(Cadena c1){
        int cont=0;
        String c2 = c1.getCadena().toUpperCase();
        for (int i = 0; i < c1.getLongitud(); i++) {
            if((c2.charAt(i)=='A') || (c2.charAt(i)=='E') || (c2.charAt(i)=='I') || (c2.charAt(i)=='O') || (c2.charAt(i)=='U')){
             cont++;   
            }
            
        }
        System.out.println("La cantidad de vocales de la frase son: " + cont);
    }
    
    public void invertirFrase(Cadena c1){
       
        StringBuilder inversa = new StringBuilder(c1.getCadena());
        String invertida = inversa.reverse().toString();
        System.out.println("La frase invertida es " + invertida);
        
    }
    
    public void vecesRepetido(Cadena c1, char letra){
        int total_letras=0;
       
        String s = String.valueOf(letra);
        for (int i = 0; i < c1.getLongitud(); i++) {
            String letras =c1.getCadena().substring(i,(i+1));
            if(s.equalsIgnoreCase(letras)){
                total_letras++;
            }
            
            
        }
            if(total_letras>0){
                System.out.println("La letra " + letra + " se repite " + total_letras);
            }else{
                System.out.println("La letra " + letra + " no se encuentra en la frase ingresada");
            }   
    
    }
    public void compararLongitud(Cadena c1, String frase2){
        int lonfrase2 = frase2.length();
        if(c1.getLongitud()==lonfrase2){
            System.out.println("La longitudes de las cadenas son iguales"); 
        }else{
            System.out.println("Las longitudes de las cadenas son diferentes");
        }
    }
    
    public void unirFrase(Cadena c1, String frase3){
        System.out.println("Las frases unidas seria :");
        System.out.println(c1.getCadena().concat(" ").concat(frase3));
    }
    
    public boolean contieneLetra(Cadena c1, String letra){
        
        return c1.getCadena().contains(letra);
    }
    
    
    
    
}
