/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;

/**
 *
 * @author sptorresr
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> numerosA = new ArrayList();
        for (int i = 0; i < 5; i++) {
            int x= 25*i+3;
            numerosA.add(x);
        }
        System.out.println("La lista de numero es");
        for (Integer integer : numerosA) {
            System.out.println(integer);
        }
            
        }
        // TODO code application logic here
    }
    
