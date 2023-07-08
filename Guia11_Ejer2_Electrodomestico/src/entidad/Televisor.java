/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.

 */
public class  Televisor extends Electrodomestico {
    private int resolucion ;
    private boolean tdt ;

    public Televisor() {
    }

    public Televisor(int precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    
    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        setColor(getColor());
        setConsumoEnergetico(getConsumoEnergetico());
        setPeso(getPeso());
        setPrecio(getPrecio());
        System.out.println("Ingrese la resolucion del televisor");
        setResolucion(leer.nextInt());
        System.out.println("El televisor cuenta con tdt S/N");
        String t = leer.next();
        if(t.equalsIgnoreCase("S")){
            setTdt(true);
        }
        else{
            setTdt(false);
        }
        
    }
    public void precioFinal() {
        super.precioFinal();
        if(getResolucion() > 40){
            int precio =((getPrecio()*30)/100);
            setPrecio(getPrecio()+precio);
        }
        if(isTdt()){
            setPrecio(getPrecio()+500);
        }
        System.out.println("El precio del televisor es " + getPrecio());
    }
}
