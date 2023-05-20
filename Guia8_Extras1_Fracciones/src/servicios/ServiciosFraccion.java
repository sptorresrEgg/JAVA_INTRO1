/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import fraccion.Fraccion;

/**
 *
 * @author sptorresr
 */
public class ServiciosFraccion {
    Fraccion f1 = new Fraccion();
    
    public void crear(int num1, int den1, int num2, int den2){
        f1.setNumerador1(num1);
        f1.setDenominador1(den1);
        f1.setNumerador2(num2);
        f1.setDenominador2(den2);
    }
    
    public void sumar(){
        int numeradorResultado;
        int denominadorResultado;
        if(f1.getDenominador1()==f1.getDenominador2()){
            numeradorResultado = f1.getNumerador1()+f1.getNumerador2();
            denominadorResultado = f1.getDenominador1();
        }else{
            denominadorResultado = f1.getDenominador1()*f1.getDenominador2();
            numeradorResultado = (f1.getNumerador1()*f1.getDenominador2())+(f1.getNumerador2()*f1.getDenominador1());
          
        }
          System.out.println("La suma de las fraciones es :" + numeradorResultado + "/" + denominadorResultado);
    }
    public void restar(){
        int numeradorResultado;
        int denominadorResultado;
        if(f1.getDenominador1()==f1.getDenominador2()){
            numeradorResultado = f1.getNumerador1()-f1.getNumerador2();
            denominadorResultado = f1.getDenominador1();
        }else{
            denominadorResultado = f1.getDenominador1()*f1.getDenominador2();
            numeradorResultado = (f1.getNumerador1()*f1.getDenominador2())-(f1.getNumerador2()*f1.getDenominador1());
          
        }
          System.out.println("La resta de las fraciones es :" + numeradorResultado + "/" + denominadorResultado);
    }
    public void multiplicar(){
        int numeradorResultado = f1.getNumerador1()*f1.getNumerador2();
        int denominadorResultado = f1.getDenominador1()*f1.getDenominador2();
        System.out.println("La multiplicacion de las fraciones es :" + numeradorResultado + "/" + denominadorResultado);
    }   
    public void dividir(){
       int numeradorResultado;
       int denominadorResultado;
       numeradorResultado= f1.getNumerador1()*f1.getDenominador2();
       denominadorResultado= f1.getNumerador2()*f1.getDenominador1();
       System.out.println("La multiplicacion de las fraciones es :" + numeradorResultado + "/" + denominadorResultado);
        
    }
}
