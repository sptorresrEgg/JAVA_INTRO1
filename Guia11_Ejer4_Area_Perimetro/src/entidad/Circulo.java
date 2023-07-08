/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 */
public class Circulo {
    private int radio;
    private int perimetro = 2*radio;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", perimetro=" + perimetro + '}';
    }
    
    
}
