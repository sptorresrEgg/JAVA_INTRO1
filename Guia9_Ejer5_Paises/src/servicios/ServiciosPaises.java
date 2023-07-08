/*
 ** Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario
 */
package servicios;
import entidad.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class ServiciosPaises {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
     public HashSet crearListaPaises (){
         HashSet<String> listaPaises = new HashSet();
         String p1="";
         boolean valida = true;
         do {
             Paises pais = new Paises();
             System.out.println("Ingrese el nombre de un pais");
             p1=leer.next();
             listaPaises.add(p1);
             System.out.println("Desea ingresar otr país S/N");
            if (leer.next().equalsIgnoreCase("N")) {
                valida = false;
            }
         }while(valida);
         return listaPaises;
     }
     
     public void mostrarPaises(HashSet<String> listaPaises){
         for (String listaPais : listaPaises) {
             System.out.println(listaPais);
         }
     }
     
     public void eliminarPaises(HashSet<String> listaPaises){
         System.out.println("Ingrese el pais que desea quitar de la lista");
        String paiseseliminar = leer.next();
        boolean valida1 = true;
        Iterator<String> it = listaPaises.iterator();
        while (it.hasNext()) {
            
            if (it.next().equals(paiseseliminar)) {
                it.remove();
                System.out.println("El pais se elimino de manera correcta");
                valida1 = false;
            }

        }
        if(valida1){
            System.out.println("Pais no encontrado");
        }
     }
     
     
}

