/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
 */
public class Nif {
    private long DNI;
    private String digitoVericacion;

    public Nif() {
    }

    public Nif(long DNI, String digitoVericacion) {
        this.DNI = DNI;
        this.digitoVericacion = digitoVericacion;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getDigitoVericacion() {
        return digitoVericacion;
    }

    public void setDigitoVericacion(String digitoVericacion) {
        this.digitoVericacion = digitoVericacion;
    }

    @Override
    public String toString() {
        return "Nif{" + "DNI=" + DNI + ", digitoVericacion=" + digitoVericacion + '}';
    }
   
}
