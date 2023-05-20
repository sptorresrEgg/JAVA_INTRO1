/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas
 */
public class MesSecreto {
    private  String [] meses= new String[12];

    public MesSecreto() {
      String  meses1[]={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
      meses = meses1;
    }

    public String[] getMeses() {
        return meses;
    }

    public void mostrarMeses(){
        for (int i = 0; i < 12; i++) {
            System.out.println(meses[i]);
        }
    }
    
    
    @Override
    public String toString() {
        return "MesSecreto{" + "meses=" + meses + '}';
    }
    
    
}
