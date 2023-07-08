/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Random;

/**
 Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
public class Revolver {
    private int pocisionActual;
    private int pocisionAgua;

    public Revolver() {
    }

    public Revolver(int pocisionActual, int pocisionAgua) {
        this.pocisionActual = pocisionActual;
        this.pocisionAgua = pocisionAgua;
    }

    public int getPocisionActual() {
        return pocisionActual;
    }

    public void setPocisionActual(int pocisionActual) {
        this.pocisionActual = pocisionActual;
    }

    public int getPocisionAgua() {
        return pocisionAgua;
    }

    public void setPocisionAgua(int pocisionAgua) {
        this.pocisionAgua = pocisionAgua;
    }
    //Metodos para funcionamiento de la calse
    public void llenarRevolver(){
        Random random = new Random();
        this.pocisionActual=(random.nextInt(6));
        this.pocisionAgua=(random.nextInt(6));
       
    }
    public boolean mojar(){
        if(getPocisionActual()==getPocisionAgua()){
            return true;
        }
        else{
            return false;
        }
    }
    public void siguienteChorro (){
        if(getPocisionActual()==5){
            setPocisionActual(0);
        }
        else{
            setPocisionActual(getPocisionActual()+1);
        }
    }
    
    

    @Override
    public String toString() {
        return "Revolver{" + "pocisionActual=" + pocisionActual + ", pocisionAgua=" + pocisionAgua + '}';
    }
    
    
}
