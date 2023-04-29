/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
 */
public class Cuenta {
    private int numeroCuenta;
    private long DNI;
    private int saldoInicial;
    private int saldoActual;
    private int ingresos;
    private double retiros;
    private  final Date FechaApertura;
    private final double intereses;
    
    
    
    
    public Cuenta() {
        this.FechaApertura= new Date();
        this.intereses=0.02;
        this.saldoInicial=0;
    }
    

    public Cuenta(int numeroCuenta, long DNI, Date FechaApertura) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.FechaApertura = FechaApertura;
        this.intereses=0.02;
        this.saldoInicial=0;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

   

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public void setRetiros(double retiros) {
        this.retiros = retiros;
    }

    public void setSaldoInicial(int saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
    
    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

   

    public int getIngresos() {
        return ingresos;
    }

    public double getRetiros() {
        return retiros;
    }

    public Date getFechaApertura() {
        return FechaApertura;
    }

    public double getIntereses() {
        return intereses;
    }

    public int getSaldoInicial() {
        return saldoInicial;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldoInicial=" + saldoInicial + ", saldoActual=" + saldoActual + ", ingresos=" + ingresos + ", retiros=" + retiros + ", FechaApertura=" + FechaApertura + ", intereses=" + intereses + '}';
    }
    

   
    
    
    
    
    
    
}
