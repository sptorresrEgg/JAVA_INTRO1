/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosNif;

import entidad.Nif;

/**
 *
 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
* 
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
 */
public class ServiciosNif {
    
    public Nif crearNif(long DNI){
        System.out.println("Entre aca");
        long modulo =(int)DNI%23 ;
        System.out.println("el modulo es "+ modulo);
        String [] digito = {"T","R","W","G","M","Y","F","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        return new Nif(DNI, digito[(int)modulo]);
    }
    
    public void mostrarNif(Nif n1){
        System.out.println("El DNI con digito de verificacion es "+ n1.getDNI()+"-"+n1.getDigitoVericacion());
    }
    
}
