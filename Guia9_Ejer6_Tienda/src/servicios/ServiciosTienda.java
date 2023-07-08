/*

Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class ServiciosTienda {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearProducto(HashMap<String, Double> productos){
        boolean valida=true;
        do { 
            System.out.println("Ingrese el nombre del producto");
            String producto = leer.next();
            System.out.println("Ingrese el precio del producto");
            double precio = leer.nextDouble();
            productos.put(producto, precio);
            System.out.println("Desea agregar otro producto S/N");
            if(leer.next().equalsIgnoreCase("N")){
                valida=false;
            }
            
        } while (valida);
        
    }
    
    public void cambiarprecio(HashMap<String, Double> productos){
        System.out.println("Ingrese el nombre del producto para modificar su precio");
        String producto = leer.next();
        System.out.println("Ingrese el nuevo precio");
        double nuevoPrecio = leer.nextDouble();
        productos.replace(producto, nuevoPrecio);
    }
    
    public void eliminarproducto(HashMap<String, Double> productos){
        System.out.println("Ingrese el nombre del producto a eliminar");
        productos.remove(leer.next());
        
    }
    public void mostrarproducto(HashMap<String, Double> productos){
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("Producto: " + entry.getKey());
            System.out.println("Precio:"+ entry.getValue());
            
        }
    }
    
}
