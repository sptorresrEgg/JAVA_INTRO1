/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 */
public class Barco {
    protected int matricula;
    protected long eslora;
    protected int yearFabricacion;

    public Barco() {
    }

    public Barco(int matricula, long eslora, int yearFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.yearFabricacion = yearFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(long eslora) {
        this.eslora = eslora;
    }

    public int getYearFabricacion() {
        return yearFabricacion;
    }

    public void setYearFabricacion(int yearFabricacion) {
        this.yearFabricacion = yearFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", yearFabricacion=" + yearFabricacion + '}';
    }
    
    
}
