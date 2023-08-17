/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 Potencia en CV para barcos a motor.
 */
public class BarcoMotor extends Barco{
    int potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(int potencia) {
        this.potencia = potencia;
    }

    public BarcoMotor(int potencia, int matricula, long eslora, int yearFabricacion) {
        super(matricula, eslora, yearFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "potencia=" + potencia +  "matricula=" + matricula + "eslora=" + eslora + "año fabricación=" + yearFabricacion + '}';
    }
    
}
