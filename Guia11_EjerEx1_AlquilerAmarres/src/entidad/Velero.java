/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 Número de mástiles para veleros.
 */
public class Velero extends Barco {
    private int cantidadMastiles;

    public Velero() {
    }

    public int getCantidadMastiles() {
        return cantidadMastiles;
    }

    public void setCantidadMastiles(int cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }

    public Velero(int cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }

    public Velero(int cantidadMastiles, int matricula, long eslora, int yearFabricacion) {
        super(matricula, eslora, yearFabricacion);
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "cantidadMastiles=" + cantidadMastiles +  "matricula=" + matricula + "eslora=" + eslora + "año fabricación=" + yearFabricacion +'}';
    }
    
    
}
