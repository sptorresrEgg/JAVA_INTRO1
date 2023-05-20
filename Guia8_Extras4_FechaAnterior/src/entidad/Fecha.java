/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 Definir la clase Fecha. La Clase entidad tendrá solo 3 atributos (día, mes, año). No se podrá utilizar
ningún tipo de objeto de “clase fechas”. Inicializando desde la entidad los valores en 1, 1, 1900
respectivamente.
 */
public class Fecha {
    private int anio;
    private int mes;
    private int dia;

    public Fecha() {
    }

    public Fecha(int anio, int mes, int dia) {
        this.anio = 1900;
        this.mes = 1;
        this.dia = 1;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Fecha{" + "anio=" + anio + ", mes=" + mes + ", dia=" + dia + '}';
    }
    
    
    
}
