/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.

Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.

Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
 
Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.

Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:

LETRA PRECIO   
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000

 */
public class Electrodomestico {
    protected int precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
     public char comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return 'F';
        }
     }
      public String comprobarColor(String color) {
        if (color.equalsIgnoreCase("BLANCO") || color.equalsIgnoreCase("NEGRO") || color.equalsIgnoreCase("ROJO") || color.equalsIgnoreCase("AZUL") || color.equalsIgnoreCase("GRIS")) {
            return color;
        } else {
            return "BLANCO";
        }
    }
    
     public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        System.out.println("Ingrese el color");
        String color = leer.next();
        setColor(comprobarColor(color));
        System.out.println("Ingrese el tipo de consumo (A,B,C,D,E,F)");
        char consumo = leer.next().charAt(0);
        setConsumoEnergetico(comprobarConsumoEnergetico(consumo));
        setPrecio(1000);
        System.out.println("Ingrese el peso");
        setPeso(leer.nextDouble());
        
    }
     
     public void precioFinal() {
        switch (getConsumoEnergetico()) {
            case 'A':
                setPrecio(getPrecio() + 1000);
                break;
            case 'B':
                setPrecio(getPrecio() + 800);
                break;
            case 'C':
                setPrecio(getPrecio() + 600);
                break;
            case 'D':
                setPrecio(getPrecio() + 500);
                break;
            case 'E':
                setPrecio(getPrecio() + 300);
                break;
            case 'F':
                setPrecio(getPrecio() + 100);
                break;
        }
        if (getPeso() >= 1 && getPeso() <= 20) {
            setPrecio(getPrecio() + 100);
        } else if (getPeso() > 20 && getPeso() <= 50) {
            setPrecio(getPrecio() + 500);
        } else if (getPeso() > 50 && getPeso() <= 80) {
            setPrecio(getPrecio() + 800);
        } else if (getPeso() > 80) {
            setPrecio(getPrecio() + 1000);
        }
    } 
    
     
     
}
