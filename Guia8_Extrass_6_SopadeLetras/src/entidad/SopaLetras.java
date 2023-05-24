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
public class SopaLetras {
     private String[][] sopaletras;
      private String[] palabra;

    public SopaLetras() {
    }

    public SopaLetras(String[][] sopaletras) {
        this.sopaletras = sopaletras;
    }

    public SopaLetras(String[][] sopaletras, String[] palabra) {
        this.sopaletras = sopaletras;
        this.palabra = palabra;
    }

    public String[][] getSopaletras() {
        return sopaletras;
    }

    public void setSopaletras(String[][] sopaletras) {
        this.sopaletras = sopaletras;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "SopaLetras{" + "sopaletras=" + sopaletras + ", palabra=" + palabra + '}';
    }
      
    
}
