/*
 *Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
 */
package main;

import entidad.Juego;

/**
 *
 * @author sptorresr
 */
public class MainRuleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juego j1 = new Juego();
        j1.llenarJuego();
        j1.ronda();
    }
    
}
