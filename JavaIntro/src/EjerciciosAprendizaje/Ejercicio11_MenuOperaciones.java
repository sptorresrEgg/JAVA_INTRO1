/*
 * Realizar un programa que pida dos números enteros positivos por teclado
y muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del 
programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona 
el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */

package EjerciciosAprendizaje;
import java.util.Scanner;
/**
 *
 * @author sptorresr
 */
public class Ejercicio11_MenuOperaciones {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        do {
            System.out.println("Ingrese dos numeros positivos");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
        }while( !(num1 > 0 && num2 > 0) );
        menu(num1,num2);

    }
     public static void menu(int num1, int num2){
         Scanner leer2 = new Scanner(System.in);
         int opcion;
         System.out.println("-------------------------");
         System.out.println("|    MENU               |");
         System.out.println("|    1. Sumar           |");
         System.out.println("|    2. Restar          |");
         System.out.println("|    3. Multiplicar     |");
         System.out.println("|    4. Dividir         |");
         System.out.println("|    5. salir           |");
         System.out.println("|                       |");
         System.out.println("|    Elija una opcion : |");
         System.out.println("-------------------------");
         opcion = leer2.nextInt();
         operaciones(num1,num2,opcion);
      }
     public static void operaciones(int num1,int num2, int opcion){
        
        switch(opcion) {
           case 1:
               System.out.println("La suma  de los numeros es:" + (num1+num2));
               System.out.println("Presione enter para continuar...");
               new java.util.Scanner(System.in).nextLine();
               menu(num1,num2);
            // break;
               
            case 2:
               System.out.println("La resta  de los numeros es:" + (num1-num2));
               System.out.println("Presione enter para continuar...");
               new java.util.Scanner(System.in).nextLine();
               menu(num1,num2);
               // break;  
               
            case 3:
               System.out.println("La multiplicacion de los numeros es:" + (num1*num2));
               System.out.println("Presione enter para continuar...");
               new java.util.Scanner(System.in).nextLine();
               menu(num1,num2);
           // break;   
            case 4:
               double num3 = num1;
               double num4 = num2;
               System.out.println("La division de los numeros es: " + num3/num4);
               System.out.println("Presione enter para continuar...");
               new java.util.Scanner(System.in).nextLine();
               menu(num1,num2);
           // break; 
            case 5:
               String respuesta;
               Scanner leer2 = new Scanner(System.in);
               System.out.println("¿Está seguro que desea salir del programa (S/N)?");
               respuesta = leer2.nextLine();
                if (respuesta.equalsIgnoreCase("S")) {
                    break;
                }else{
                    menu(num1,num2);
                }
                    
           default:
               System.out.println("La opcion ingresada no es valida");
               break;
       }
    }
             

}
