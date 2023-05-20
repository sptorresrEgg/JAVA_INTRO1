/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosahorcado;
import entidad.Ahorcado;
import java.util.Scanner;
/**
 *
 * @author sptorresr
 */
public class ServiciosAhorcado {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearJuego() {
        Ahorcado a1 = new Ahorcado();
        System.out.println("Ingrese la palabra a adivinar");
        String palabraABuscar = leer.next();
        char[] palabra = new char[longitud(palabraABuscar)];
        for (int i = 0; i < palabra.length; i++) {
            palabra[i] = palabraABuscar.charAt(i);
        }
        a1.setPalabraABuscar(palabra);
        System.out.println("Ingrese la cantidad de jugadas máxima");
        a1.setCantidadDeJugadas(leer.nextInt());
        boolean finDeIntentos;
        boolean palabraEncontrada;
        do {
            System.out.println("Ingrese la letra a buscar");
            char letra = leer.next().charAt(0);
            encontradas(letra, a1);
            finDeIntentos = a1.getCantidadDeJugadas() > 0;
            palabraEncontrada = palabraEncontrada = a1.getLetrasEncontradas() == a1.getPalabraABuscar().length;
            if (palabraEncontrada) {
              
                System.out.println("Felicidades!! Ganaste");
                intentosFinal(a1);
               
                break;
            } else if (!finDeIntentos) {
               
                System.out.println("Lo sentimos no lograste adivinar la palabra!!");
               
                break;
            }
        } while (true);
    }

    public int longitud(String palabra) {
        return palabra.length();
    }

    public boolean buscarLetra(char letra, Ahorcado ahorcado) {
        int e=0;
        boolean letraEncontrada = false;
        char[] palabra = ahorcado.getPalabraABuscar();
        for (int i = 0; i < ahorcado.getPalabraABuscar().length; i++) {
            if (letra == palabra[i]) {
                letraEncontrada = true;
                e=i+1;
                break;
            }
        }
        if (letraEncontrada) {
            System.out.println("Que bien la letra aplica y esta en la pocision"+ (e) );
        } else {
            System.out.println("La letra NO pertenece a la palabra");
        }
        return letraEncontrada;
    }

    /*Método encontradas(letra):  que reciba una letra ingresada por el usuario 
y muestre cuantas letras han sido encontradas y cuántas le faltan. 
Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, 
cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados 
e informará cuando el usuario descubra toda la palabra o se quede sin intentos. 
Este método se llamará en el main.
     */
    public boolean encontradas(char letra, Ahorcado ahorcado) {
        boolean letraEncontrada = buscarLetra(letra, ahorcado);
        char[] palabra = ahorcado.getPalabraABuscar();
        if (letraEncontrada) {
            for (int i = 0; i < ahorcado.getPalabraABuscar().length; i++) {
                if (letra == palabra[i]) {
                    letraEncontrada = true;
                    ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
                }
            }
        } else {
            ahorcado.setCantidadDeJugadas(ahorcado.getCantidadDeJugadas() - 1);
            intentos(ahorcado);
        }
        int faltantes = ahorcado.getPalabraABuscar().length - ahorcado.getLetrasEncontradas();
        System.out.println("Faltan " + faltantes + " letras");
        return letraEncontrada;
    }

    public void intentos(Ahorcado ahorcado) {
        System.out.println("Te quedan " + ahorcado.getCantidadDeJugadas() + " oportunidades de fallar ");
    }
     public void intentosFinal(Ahorcado ahorcado) {
        System.out.println("Te quedaron " + ahorcado.getCantidadDeJugadas() + " oportunidades de fallar ");
    }

    public void juego() {
        crearJuego();
    }
}
