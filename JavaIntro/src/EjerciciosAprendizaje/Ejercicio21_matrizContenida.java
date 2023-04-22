/*
 Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 3x3
se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna 
de la matriz M en la cual empieza el primer elemento de la submatriz P.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author sptorresr
 */
public class Ejercicio21_matrizContenida {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] matrizM = new int [10][10];
        int [][] matrizP = new int [3][3];
/*matrizM[0][0]=1;
matrizM[0][1]=23;
matrizM[0][2]=36;
matrizM[0][3]=47;
matrizM[0][4]=5;
matrizM[0][5]=6;
matrizM[0][6]=72;
matrizM[0][7]=81;
matrizM[0][8]=95;
matrizM[0][9]=10;
matrizM[1][0]=11;
matrizM[1][1]=36;
matrizM[1][2]=5;
matrizM[1][3]=67;
matrizM[1][4]=41;
matrizM[1][5]=22;
matrizM[1][6]=67;
matrizM[1][7]=20;
matrizM[1][8]=10;
matrizM[1][9]=61;
matrizM[2][0]=56;
matrizM[2][1]=89;
matrizM[2][2]=90;
matrizM[2][3]=75;
matrizM[2][4]=9;
matrizM[2][5]=90;
matrizM[2][6]=17;
matrizM[2][7]=12;
matrizM[2][8]=87;
matrizM[2][9]=67;
matrizM[3][0]=41;
matrizM[3][1]=14;
matrizM[3][2]=22;
matrizM[3][3]=26;
matrizM[3][4]=97;
matrizM[3][5]=74;
matrizM[3][6]=87;
matrizM[3][7]=42;
matrizM[3][8]=64;
matrizM[3][9]=36;
matrizM[4][0]=32;
matrizM[4][1]=76;
matrizM[4][2]=79;
matrizM[4][3]=1;
matrizM[4][4]=36;
matrizM[4][5]=5;
matrizM[4][6]=67;
matrizM[4][7]=96;
matrizM[4][8]=12;
matrizM[4][9]=11;
matrizM[5][0]=99;
matrizM[5][1]=13;
matrizM[5][2]=54;
matrizM[5][3]=88;
matrizM[5][4]=89;
matrizM[5][5]=90;
matrizM[5][6]=75;
matrizM[5][7]=12;
matrizM[5][8]=41;
matrizM[5][9]=76;
matrizM[6][0]=67;
matrizM[6][1]=78;
matrizM[6][2]=87;
matrizM[6][3]=45;
matrizM[6][4]=14;
matrizM[6][5]=22;
matrizM[6][6]=26;
matrizM[6][7]=42;
matrizM[6][8]=56;
matrizM[6][9]=78;
matrizM[7][0]=98;
matrizM[7][1]=45;
matrizM[7][2]=34;
matrizM[7][3]=23;
matrizM[7][4]=32;
matrizM[7][5]=56;
matrizM[7][6]=74;
matrizM[7][7]=16;
matrizM[7][8]=19;
matrizM[7][9]=18;
matrizM[8][0]=24;
matrizM[8][1]=67;
matrizM[8][2]=97;
matrizM[8][3]=46;
matrizM[8][4]=87;
matrizM[8][5]=13;
matrizM[8][6]=67;
matrizM[8][7]=89;
matrizM[8][8]=93;
matrizM[8][9]=24;
matrizM[9][0]=21;
matrizM[9][1]=68;
matrizM[9][2]=78;
matrizM[9][3]=98;
matrizM[9][4]=90;
matrizM[9][5]=67;
matrizM[9][6]=12;
matrizM[9][7]=41;
matrizM[9][8]=65;
matrizM[9][9]=12;

matrizP[0][0]=36;
matrizP[0][1]=5;
matrizP[0][2]=67;
matrizP[1][0]=89;
matrizP[1][1]=90;
matrizP[1][2]=75;
matrizP[2][0]=14;
matrizP[2][1]=22;
matrizP[2][2]=26;*/


        rellenar(matrizM, matrizP);
        mostrar(matrizM, matrizP) ; 
        validar(matrizM, matrizP);
}
    //rellenar matrices
     public static void rellenar(int [][] matrizM, int [][] matrizP){
         Scanner leer = new Scanner(System.in).useDelimiter("/n");
         for (int i = 0; i < 10; i++) {
             for (int j = 0; j < 10; j++) {
                 matrizM[i][j]= (int) (Math.random()*1);
             }
        }
        for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 matrizP[i][j]= (int) (Math.random()*1);
             }
        } 
    }
     
    public static void mostrar (int [][] matrizM, int [][] matrizP){
        System.out.println("Matriz M");
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("["+ matrizM[i][j]+"]" );
            }
            System.out.println("");
       }
        System.out.println(""); 
        
        System.out.println("Matriz P");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ matrizP[i][j]+"]" );
            }
            System.out.println("");
       }
        System.out.println(""); 
    }   
   
    public static void validar(int  [][] matrizM, int [][] matrizP){
        int pocisionI;
        int pocisionJ;
        int y=0;
        int z=0;
        int valida=0;
        int valorComparar =matrizP[0][0];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (valorComparar==matrizM[i][j]) {
                    pocisionI=i;
                    pocisionJ=j;
                    
                    if(pocisionI + 2 < 9 && pocisionJ + 2 < 9){
                    
                        boolean retorno = buscacontener(pocisionI, pocisionJ,matrizM, matrizP);
                        if (retorno){
                            //System.out.println("La matrizP esta contenida en MatrizM  y su inicio es fila " + i + "columna " + j);
                            System.out.print("La matrizP esta contenida en MatrizM en los indices  " );
                            for (int k = pocisionI; k <= pocisionI+2; k++) {
                                for (int l = pocisionJ; l <= pocisionJ+2; l++) {
                                    System.out.print(k + "," + l+ "- ");
                                }//System.out.println("");
                                
                            }System.out.println("");
                            
                            valida=1;
                            break;
                        }else {
                            //System.out.println("La matrizP no esta contenida en MatrizM");
                            break;
                        }
                   }
                }        
                    
                }
                
            }
           if(!(valida==1)){
               System.out.println("La matriz P NO ESTA COTENIDA en la matriz M");
           }
        }
        
        
    public static boolean buscacontener(int pocisionI,int pocisionJ, int [][]matrizM, int [][]matrizP){
        int k=0;
        int z;
        for (int i = pocisionI; i <= pocisionI+2; i++) {
            z=0;
            for (int j = pocisionJ; j <= pocisionJ+2; j++) {
                if(matrizM[i][j] == matrizP[k][z]){
                    z++;
                   
                }else{
                return(false);
                
                }
                
            }k++;
            
        }
        return(true);
    }
    

}
