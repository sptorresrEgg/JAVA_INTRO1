/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import java.util.Scanner;
import Entidad.Cuenta;
import java.util.Date;

/**
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
saldra por pantalla SALDOS INSUFICIENTES y no afectara el saldo.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
public class ServiciosCuenta {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cuenta crear(){
        System.out.println("Ingrese el numero de cuenta");
        int cuenta = leer.nextInt();
        System.out.println("Ingrese su DNI");
        long DNI = leer.nextLong();
        Date fecha = new Date();
        return new Cuenta(cuenta, DNI ,fecha);
        
    }    
    
    public void Consignar(Cuenta c1){
        System.out.println("Ingrese el valor a Consignar :");
        int consignacion = leer.nextInt();
        c1.setIngresos(c1.getIngresos()+consignacion);
        c1.setSaldoActual(c1.getSaldoActual()+consignacion);
        
    }
    
    public void retirar(Cuenta c1){
        System.out.println("Ingrese el valor a retirar");
        int retiro = leer.nextInt();
        if(retiro > c1.getSaldoActual()){
            System.out.println("SALDO INSUFICIENTE");
            System.out.println("");
        }else{
            c1.setRetiros(c1.getRetiros()+retiro);
            c1.setSaldoActual(c1.getSaldoActual()-retiro);
        }
    }
    
    public void extraccionRapida(Cuenta c1){
        System.out.println("Ingrese el valor a retirar");
        int retiro = leer.nextInt();
        if(retiro > (c1.getSaldoActual()*0.2)){
            System.out.println("NO PUEDES REALIZAR ESTE RETIRO YA QUE ES MAYOR AL 20%");
            System.out.println("");
        }else{
           c1.setRetiros(c1.getRetiros()+retiro);
           c1.setSaldoActual(c1.getSaldoActual()-retiro);
        }
    }
    
    public void consultarSaldo(Cuenta c1){
        System.out.println("El saldo actual de su cuenta es " + c1.getSaldoActual());
        System.out.println("");
    }
    
    public void consultarExtracto(Cuenta c1){
        int intereses = (int) (c1.getSaldoActual()*c1.getIntereses());
        c1.setSaldoActual(c1.getSaldoActual()+intereses);
        System.out.println("===================================================");
        System.out.println("Numero de cuenta  : " + c1.getNumeroCuenta());
        System.out.println("Numero de Cliente : " + c1.getDNI());
        System.out.println("Fecha de Apertura : "+ c1.getFechaApertura());
        System.out.println("Tasa de Interes   : " +(c1.getIntereses()*100)+"%");
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("         MOVIMIENTOS DE LA CUENTA");
        System.out.println("");
        System.out.println("SALDO INICIAL    INGRESOS       RETIROS       SALDOACTUAL");
        System.out.print("    "+ c1.getSaldoInicial());
        System.out.print("        " +c1.getIngresos());
        System.out.print("         "+ c1.getRetiros());
        System.out.println("         " + c1.getSaldoActual());
        System.out.println("");
        c1.setSaldoInicial(c1.getSaldoActual());
        c1.setIngresos(0);
        c1.setRetiros(0);
    }
}
