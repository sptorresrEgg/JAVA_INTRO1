/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Extra;
import java.util.Scanner;
//import java.lang.*;


/**
Los profesores del curso de programación de Egg necesitan llevar un registro de 
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados 
y desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 
2 por trabajos prácticos evaluativos y 2 por parciales. 
Lasponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Unavez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad 
 deaprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos 
 * con promedio mayor o igual al 7 de sus notas del curso.
 */
public class Ejercicio21_notasAlumnos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String [] alumnos = new String[10];
        String [] nomnotas = new String [5];
        double [][] notas = new double [10][5];
        
        rellenar(notas, alumnos, nomnotas);
        mostrar(notas, alumnos, nomnotas);
        calcular(notas);
        mostrar(notas, alumnos, nomnotas);
        
        

}
    public static void rellenar (double notas [][], String alumnos [], String nomnotas[]){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre del alumno "+ (i+1));
            alumnos[i]= leer.next();
            int aux=0;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                notas[i][j]=(int)(Math.random()*10);
                notas[i][j]=Math.round((notas[i][j]*1.10)*10.0)/10.0;
                
            }
            
        }
    
        nomnotas[0]="Tra1";
        nomnotas[1]="Tra2";
        nomnotas[2]="Int1";
        nomnotas[3]="Int2";
        nomnotas[4]="Final";
    
   }
    
   public static void calcular (double notas [][]){
       for (int i = 0; i < 10; i++) {
           for (int j = 0; j < 4; j++) {
             switch(j){
                case 0:
                     //Math.round(random * 100.0) / 100.0;
                 notas[i][j] = Math.round((notas[i][j]*1.10)*10.0)/10.0;
                 break;
                case 1:
                 notas[i][j] = Math.round((notas[i][j]*1.15)*10.0)/10.0;
                 break;  
                case 2:
                 notas[i][j] = Math.round((notas[i][j]*1.25)*10.0)/10.0;
                 break; 
                 case 3:
                 notas[i][j] =Math.round((notas[i][j]*1.50)*10.0)/10.0;
                 break;
             }
           }
           
       }
       //calculo promedio
       int aprobados=0;
       int desaprobados=0;
       for (int i = 0; i < 10; i++) {
           double suma=0;
           for (int j = 0; j < 4; j++) {
               suma+=notas[i][j];
            //Math.round(random * 100.0) / 100.0;   
           }notas[i][4]=Math.round((suma/4)*100.0)/100.0;
           //aprobados - desaprobados
           if(notas[i][4]>=7){
               aprobados++;
           }else{
               desaprobados++;
           }
       }
       System.out.println("");
       System.out.println("La cantidad de alumnos que aprobaron son "+ aprobados);
       System.out.println("La cantidad de alumnos que desaprobaron son " + desaprobados);
       System.out.println("");
       System.out.println("          ESTAS SON LAS NOTAS FINALES");
       System.out.println("");
 
      
   } 
   
   public static void mostrar (double notas [][], String alumnos [], String [] nomnotas){
       
       System.out.print("           "); 
       for (int i = 0; i < 5; i++) {
           
           System.out.print(nomnotas[i]+ "  ");
           
       }System.out.println("");
       System.out.println("");
       int l=0; //para mover filas de matriz notas
       int m=0; // para mover columnas de matriz notas
       for (int i = 0; i < 10; i++) {
           int j=0;
           System.out.print(alumnos[i]);
           System.out.print("      ");
           while(m!=5 && l!=10){
             
               System.out.print(notas[l][m]+ "   ");
               m++;
           }
           l++;
           m=0;
           System.out.println("");
           System.out.println("");
        }
       
   }
    
}

