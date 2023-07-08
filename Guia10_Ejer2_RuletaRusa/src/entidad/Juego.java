/*
 Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
 */
package entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenarJuego() {
        ArrayList<Jugador> jugadores= new ArrayList();
        int cant;
        do {
            System.out.println("Cuantos van a jugar?");
            cant=leer.nextInt();
        } while (cant>6 || cant <2);
        for (int i = 0; i < cant; i++) {
            Jugador j1 = new Jugador(i);
            jugadores.add(j1);
        }
        
        this.jugadores = jugadores;
        this.revolver = new Revolver();
        revolver.llenarRevolver();
    }

    public void ronda() {
        boolean valida = true;
        do {
            for (Jugador jugador : jugadores) {
                jugador.disparo(revolver, jugador);
                if (jugador.isMojado()) {
                    System.out.println("Te mojaste el juego termino " + jugador);
                    valida = false;
                    break;
                }else{
                    System.out.println("Bien sigues en juego " + jugador);
                }
            }
        } while (valida);

    }

}
