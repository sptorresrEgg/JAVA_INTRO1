package javaintro;
import java.util.Scanner;

/*Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
y luego codifique la palabra o frase ingresada de la siguiente manera: */
public class prueba {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        do {
            System.out.println("Ingrese una secuencia de caracteres que termine en punto");
            palabra = leer.next();
        } while (!palabra.endsWith("."));
        codificador(palabra);
    }

    /*cada vocal se reemplaza por el carácter que se indica en la tabla 
y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
     */
    public static void codificador(String palabra) {
        String auxiliar = "";
        //palabra

        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.substring(i, i + 1)) {
                case "a":
                case "A":
                    auxiliar += "@";
                    break;
                case "e":
                case "E":
                    auxiliar += "#";
                    break;
                case "i":
                case "I":
                    auxiliar += "$";
                    break;
                case "o":
                case "O":
                    //Esta es la forma "completa"
                    //auxiliar = auxiliar.concat("%");
                    //Esta es la forma usando + como la función concat
                    //auxiliar = auxiliar + "%";
                    //Y esta forma es la abreviatura de la de arriba
                    auxiliar += "%";
                    break;
                case "u":
                case "U":
                    auxiliar += "*";
                    break;
                default:
                    auxiliar += palabra.substring(i, i + 1);
            }
        }
        System.out.println("La palabra modificada es " + auxiliar);
    }
}



