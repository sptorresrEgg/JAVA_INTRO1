/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;
import java.util.Random;
/**
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
 a medida que el usuario las va ingresando, construya una “sopa de letras para niños”
 de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal
 en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación 
 de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
 Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java substring(), Length() y Math.random().
 */
public class Ejercicio23_sopadeLetras {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String [][] matriz= new String [10][10];
        palabras(matriz);
        vacios(matriz);
        mostrar(matriz);
        
        
}
    //SUBPROCESO PARA PEDIR PALABRAS
    public static void palabras (String [][] matriz){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        int size; //VARIABLE PARA ALMACENAR EL TAMAÑO DE LA PALABRA
        for (int i = 0; i < 5; i++) {
            do{
                System.out.println("Ingresa la palabra" + (i+1));
                palabra= leer.next();
                size = palabra.length();//CUENTA CUANTOS CARACTERES TIENE LA PALABRA
                
            }while(size < 3  || size > 5 );//VALIDA SI PALABRA ESTA ENTRE TRES Y 5 CARACTERES
            colocarPalabra(size, palabra, matriz); //SE PASA LA PALABRA QUE CUMPLE CON CONDICION
        }
    }
    
    public static void colocarPalabra(int size, String palabra, String [][] matriz){
        int column;
        int totc;
        int ini;
        int contador=0;
        
        
        int fila=identificaFila(matriz);//FUNCION PARA ASIGNAR LA FILA DONDE SE VA A INGRESAR LA PALABRA
        
        
       
        
        //ASIGNA UNA POCISION ALEATORIA A LAS COLUMNAS Y VALIDA QUE NO SE PASE DEL TOTAL COLUMNAS
        
        do{
            column=(int)( Math.random()*10);
             totc = column + size;
            
        }while( totc > 9);    
        
        
        //INSERTA PALABRA EN FILA Y EN COLUMNA INICIAL
        ini=0;
        for (int i = column; i < (column + size); i++) {
            
            matriz[fila][i]=palabra.substring(ini,ini + 1);
            ini++;
        }
        
      
    }
    
   
    
    public static int identificaFila(String [][]matriz){
         int fila; 
         fila=(int)( Math.random()*10);
         for (int i = 0; i < 10; i++) {
           //VALIDA SI EN LA FILA Y ALGUNA DE SUS POCISIONES ESTAN OCUPADAS
            if (matriz[fila][i]!=null){
                fila=(int)( Math.random()*10); //ASIGNA NUEVO ALEATORIO 
                i=0;
            }
        }
        return(fila);
    }    
    
    
    //rellenamos espacios sobrantes
    public static void vacios(String [][] matriz){
        String letras;
        letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        char letra;
        Random aleatorio;//VARIABLE PARA GENERAR ALEATORIO 
        //int aleatorio;  
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                if(matriz[i][j]==null){
                    aleatorio = new Random();
                    //TOMA DE LETRAS UN CARACTER ESPECIFICO ENTRE LA POCISION 1 Y 26
                    letra = letras.charAt(aleatorio.nextInt(letras.length()));
                    matriz[i][j]=String.valueOf(letra);
                }
            }
            
        }
    }
    
    //mostrar
    
    public static void mostrar(String [][] matriz){
     for (String [] recorrido: matriz){
         for( String intorrecorrido : recorrido){
             System.out.print(" " + intorrecorrido + " ");
             
         }System.out.println("");
         
     }
    }
    
}
