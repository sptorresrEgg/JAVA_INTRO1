/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import interfaces.calculosFormas;

/**
 Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 */
public class Circulo implements calculosFormas{
    private int radio;
    

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

    

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio  + '}';
    }

    @Override
    public void calcularArea() {
        //Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
        double area;
        area = pi*Math.pow(radio, 2);
        System.out.println("El area del circulo es : " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro;
        perimetro=pi*(radio+radio);
        System.out.println("El perimetro del circulo es : "+ perimetro);
    }
    
    
}
