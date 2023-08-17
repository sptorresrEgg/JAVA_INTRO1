/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 Potencia en CV y número de camarotes para yates de lujo.
 */
public class Yate extends BarcoMotor {
    int cantidadCamarotes;

    public Yate() {
    }

    public Yate(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public Yate(int cantidadCamarotes, int potencia) {
        super(potencia);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public Yate(int cantidadCamarotes, int potencia, int matricula, long eslora, int yearFabricacion) {
        super(potencia, matricula, eslora, yearFabricacion);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "cantidadCamarotes=" + cantidadCamarotes +  "matricula=" + matricula + "eslora=" + eslora + "año fabricación=" + yearFabricacion + '}';
    }
    
}
