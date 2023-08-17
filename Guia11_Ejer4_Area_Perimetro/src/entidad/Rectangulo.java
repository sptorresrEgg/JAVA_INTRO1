/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import interfaces.calculosFormas;

/**
 *
 * @author sptorresr
 */
public class Rectangulo implements calculosFormas {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public void calcularArea() {
        //Área rectángulo: base * altura / 
        int area;
         area = base*altura;
        System.out.println("El area del circulo es : " + area);
    }    
    @Override
    public void calcularPerimetro() {
       //Perímetro rectángulo: (base + altura) * 2.
       int perimetro;
       perimetro = (base + altura) * 2;
       System.out.println("El perimetro del circulo es : "+ perimetro);
    } 
    
    
}
