/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

/**
 La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
 */
public class Baraja {
    private ArrayList<Carta> conjuntoCartas;
    private ArrayList<Carta> cartasMonton;

    public Baraja() {
        this.conjuntoCartas = new ArrayList();
        this.cartasMonton = new ArrayList();
    }

    public Baraja(ArrayList<Carta> conjuntoCartas) {
        this.conjuntoCartas = conjuntoCartas;
    }

    public ArrayList<Carta> getConjuntoCartas() {
        return conjuntoCartas;
    }

    public void setConjuntoCartas(ArrayList<Carta> conjuntoCartas) {
        this.conjuntoCartas = conjuntoCartas;
    }

    public ArrayList<Carta> getCartasMonton() {
        return cartasMonton;
    }

    public void setCartasMonton(ArrayList<Carta> cartasMonton) {
        this.cartasMonton = cartasMonton;
    }
    
    
   
    
    

    @Override
    public String toString() {
        return "Baraja{" + "conjuntoCartas=" + conjuntoCartas + '}';
    }
    
    
    
    
    
}
