
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList.
 *
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario
 * se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el
 * perro en la lista. Si el perro está en la lista, se eliminará el perro que
 * ingresó el usuario y se mostrará la lista ordenada. Si el perro no se
 * encuentra en la lista, se le informará al usuario y se mostrará la lista
 * ordenada.
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razasperros = new ArrayList();
        boolean valida = true;
        do {
            System.out.println("Ingrese la raza del perro");
            razasperros.add(leer.next());
            System.out.println("Desea continuar S/N");
            String continuar = leer.next().toLowerCase();
            if (continuar.equalsIgnoreCase("N")) {
                valida = false;
            }
        } while (valida);
        for (String razasperro : razasperros) {
            System.out.println(razasperro);
        }

        System.out.println("Ingrese el perro que desea quitar de la lista");
        String razaeliminar = leer.next();
        boolean valida1 = true;
        Iterator it = razasperros.iterator();
        while (it.hasNext()) {
            
            if (it.next().equals(razaeliminar)) {
                it.remove();
                valida1 = false;
            }

        }
        if(valida1){
            System.out.println("Raza no encontrada");
        }
        Collections.sort(razasperros);
        System.out.println("Nueva Lista de perros Ordenada");
        for (String razasperro : razasperros) {
            System.out.println(razasperro);
        }

    }

}
