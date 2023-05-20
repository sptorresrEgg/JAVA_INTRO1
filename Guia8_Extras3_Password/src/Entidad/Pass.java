/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
Crear una clase Pass, donde declaremos los siguientes atributos:
● pass : Del tipo String
● nombre: Del tipo String
● dni: Del tipo int.
 */
public class Pass {
    private String pass;
    private String nombte;
    private int dni;

    public Pass() {
    }

    public Pass(String nombte, int dni) {
        this.nombte = nombte;
        this.dni = dni;
    }

    public Pass(String pass, String nombte, int dni) {
        this.pass = pass;
        this.nombte = nombte;
        this.dni = dni;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombte() {
        return nombte;
    }

    public void setNombte(String nombte) {
        this.nombte = nombte;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Pass{" + "pass=" + pass + ", nombte=" + nombte + ", dni=" + dni + '}';
    }
    
    
    
}
