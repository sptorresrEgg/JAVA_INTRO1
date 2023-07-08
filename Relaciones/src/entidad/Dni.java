/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author sptorresr
 */
public class Dni {
     private String serie;
    private int numeroDi;

    public Dni() {
    }

    public Dni(String serie, int numeroDi) {
        this.serie = serie;
        this.numeroDi = numeroDi;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumeroDi() {
        return numeroDi;
    }

    public void setNumeroDi(int numeroDi) {
        this.numeroDi = numeroDi;
    }

    @Override
    public String toString() {
        return "Dni{" + "serie=" + serie + ", numeroDi=" + numeroDi + '}';
    }
    
}
