/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
 */
public class Isosceles {
    private int ladoa;
    private int ladob;
    private int ladoc;
    private int altura;
    private int area;

    public Isosceles() {
    }

    public Isosceles(int ladoa, int ladob, int ladoc, int altura) {
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
        this.altura = altura;
    }

    public int getLadoa() {
        return ladoa;
    }

    public void setLadoa(int ladoa) {
        this.ladoa = ladoa;
    }

    public int getLadob() {
        return ladob;
    }

    public void setLadob(int ladob) {
        this.ladob = ladob;
    }

    public int getLadoc() {
        return ladoc;
    }

    public void setLadoc(int ladoc) {
        this.ladoc = ladoc;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Isosceles{" + "ladoa=" + ladoa + ", ladob=" + ladob + ", ladoc=" + ladoc + ", altura=" + altura + ", area=" + area + '}';
    }
    
    

    }
