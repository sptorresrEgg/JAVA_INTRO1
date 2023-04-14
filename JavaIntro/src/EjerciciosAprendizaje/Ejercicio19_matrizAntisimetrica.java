/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
/**
 Realice un programa que compruebe si una matriz dada es anti simétrica. 
 Se dice que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta,
 pero cambiada de signo. Es decir, A es anti simétrica si A = -AT. 
 La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 
 */
public class Ejercicio19_matrizAntisimetrica {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[ ] [ ]= new int[3][3];
        rellenar(matriz);
        mostrar(matriz);
        transpuesta(matriz);
        
    }
    public static void rellenar(int [][] matriz){
         matriz[0][0]=0;
            matriz[0][1]=-2;
            matriz[0][2]=4;
            matriz[1][0]=2;
            matriz[1][1]=0;
            matriz[1][2]=2;
            matriz[2][0]=-4;
            matriz[2][1]=-2;
            matriz[2][2]=0;
        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] =  -3 +(int)(Math.random() * 5);
                
            }
            
        }*/
    }

    public static void mostrar (int [][] matriz){
        System.out.println("MATRIZ INICIAL");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ matriz[i][j]+"]" );
            }
            System.out.println("");
       }
        System.out.println(""); 
    }   
    //Random rnd = new Random();
    public static void transpuesta (int [][] matriz){
        int randomInt;
        int matrizT[ ] [ ]= new int[3][3];
           
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 
                matrizT[i][j]=matriz[j][i];
            }
        }
        mostrarT(matrizT);
        antisimetrica(matriz,matrizT);
    }

    public static void mostrarT (int [][] matrizT){
        System.out.println("MATRIZ TRANSPUESTA");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ matrizT[i][j]+"]" );
            }
            System.out.println("");
       }
        System.out.println(""); 
    }  
    
    public static void antisimetrica(int [][]matriz, int [][] matrizT){
        boolean anti=true;
        int cont = 0;
        //verifico diagonal principal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j) {
                    if(matriz[i][j] == 0){
                        cont++;
                    }    
                }
               
            }
            
        }
        if (cont==3){
            cont=0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(i!=j){
                        if(matriz[i][j]==-1*(matrizT[i][j])){
                            cont++;
                        }
                    }
                }
            }if(!(cont==6)){
                anti=false;
            }
                    
        }else {
            anti=false;
        }
        System.out.println("La matriz es una matriz antisimetrica = " + anti);
    }
    
}


