/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Baraja;
import entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * un palo (espadas, bastos, oros y copas). Esta clase debe
 *
 * Las operaciones que podrá realizar la baraja son: barajar(): cambia de
 * posición todas las cartas aleatoriamente. 
 * 
 * siguienteCarta(): devuelve la  * siguiente carta que está en la baraja, cuando no haya más o se haya llegado
 * al final, se indica al usuario que no hay más cartas.
 * 
 * cartasDisponibles(): indica el número de cartas que aún se puede repartir.
 */
public class ServiciosBaraja {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Baraja b1 = new Baraja();
    ArrayList<Carta> cartasMonton = new ArrayList();
    //Carta c1 = new Carta();
    public Baraja crearBaraja() {
        ArrayList<Carta> listaCartas = new ArrayList();
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        for (int i = 0; i < palos.length; i++) {
            //Carta c1 = new Carta();
            for (int j = 1; j < 13; j++) {
                Carta c1 = new Carta();
                if (j == 8 || j == 9) {
                } else {
                    c1.setNum(j);
                    //System.out.println(c1.getNum());
                    c1.setPalo(palos[i]);
                    //System.out.println(c1.getPalo());
                    listaCartas.add(c1);
                }
            }
        }
        b1.setConjuntoCartas(listaCartas);
        return b1;
    }

    public void mostrarBaraja(Baraja b1) {
        System.out.println(b1.getConjuntoCartas());
    }

    public void barajar(Baraja b1) {
        System.out.println("Se barajaron las cartas");
        Collections.shuffle(b1.getConjuntoCartas());//Metodo desordena la lista de manera aleatoria
    }
    
    public void siguienteCarta(Baraja b1){
         ArrayList<Carta> cartasMonton = b1.getCartasMonton();
        if(b1.getConjuntoCartas().size()>1){
            cartasMonton.add(b1.getConjuntoCartas().remove(0));
        }
    }
    
    public void cartasDisponibles(Baraja b1) {
        System.out.println(b1.getConjuntoCartas().size() + " cartas disponibles");
        
    }
    
    public void darCartas(Baraja b1){
        System.out.println("Cuantas cartas necesita?");
        int cantCartas = leer.nextInt();
        if(cantCartas > b1.getConjuntoCartas().size()){
            System.out.println("No hay suficientes cartas");
        }else{
            for (int i = 0; i < cantCartas; i++) {
                siguienteCarta(b1);
            }
        }
    }
    
   public void cartasMonton(Baraja b1) {
       if(b1.getCartasMonton().size()>0){
           System.out.println(b1.getCartasMonton());
       }else {
           System.out.println("Aun no ha salido ninguna carta");
       }
    }
    

}
