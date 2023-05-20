/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Entidad.Pass;
import java.util.Scanner;

/**
 * Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS
 * FIJOS (no por teclado)
 *
 * Crear un método para ingresar una contraseña (crearPass). En este método,
 * debemos validar que la longitud sea correcta. (10). En caso de ser correcto,
 * almaceno la contraseña. Si ingreso a esta opción del menú, indefectiblemente
 * deberá dejar su contraseña asignada.
 *
 * Crear un método para analizar la contraseña(analizarPass). Donde: o SI Existe
 * al menos una letra z : Es nivel MEDIO o Si Existe al menos una letra z y al
 * menos 2 letras a: Es nivel ALTO o Si ninguna condición se cumple es nivel
 * BAJO
 * 
 * Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
 */
public class ServiciosPass {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Pass p1 = new Pass("Sandra Torres", 52556727);

    public void crearPass() {
        int longitud = 0;
        String contra;
        do {
            System.out.println("Ingrese nueva contraseña de 10 caracteres");
            contra = leer.next();
            longitud = contra.length();

        } while (!(longitud == 10));
        p1.setPass(contra);
    }

    public void analizarPass() {
        String letra;
        int contz = 0;
        int conta = 0;
        if (p1.getPass().equalsIgnoreCase("")) {
            System.out.println("Aun no ha creado la contraseña ");
        } else {
            for (int i = 0; i < p1.getPass().length(); i++) {
                letra = p1.getPass().substring(i, i + 1);
                if (letra.equalsIgnoreCase("z")) {
                    contz++;
                }
                if (letra.equalsIgnoreCase("a")) {
                    conta++;

                }

            }
        }
      
        if (contz >0 && conta < 2 ){
            System.out.println("Su contraseña tiene nivel MEDIO de Seguridad");
        }
        
        else if(contz > 0 && conta > 1){
            System.out.println("Su contraseña tiene nivel ALTO de Seguridad");
        }
        else{
            System.out.println("Su contraseña tiene nivel BAJO de seguridad");
        }
    }
    public void modicarNombre(){
        String contra;
        System.out.println("Digite la contraseña");
        contra = leer.next();
        if(p1.getPass().equals(contra)){
            System.out.println("Ingrese el nuevo nombre");
            String nombre = leer.next();
            p1.setNombte(nombre);
        }
        else{
            System.out.println("La contraseña ingresada no es valida");
        }
    }
    
     public void modicarDNI(){
        String contra;
        System.out.println("Digite la contraseña");
        contra = leer.next();
        if(p1.getPass().equals(contra)){
            System.out.println("Ingrese el nuevo DNI");
            int DNI = leer.nextInt();
            p1.setDni(DNI);
        }
        else{
            System.out.println("La contraseña ingresada no es valida");
        }
    }
    
    public void mostrarDatos(){
        System.out.println(p1.toString());
    }
    
    public void modificarPass(){
        String contra;
        System.out.println("Digite la contraseña");
        contra = leer.next();
        if(p1.getPass().equals(contra)){
           crearPass();
        }
        else{
            System.out.println("La contraseña ingresada no es valida");
        }
    }
    

}
