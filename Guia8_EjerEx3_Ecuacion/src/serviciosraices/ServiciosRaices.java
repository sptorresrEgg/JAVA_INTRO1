/*
 *Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 */
package serviciosraices;

import entidad.Raices;

/**
  *Método getDiscriminante(): devuelve el valor del discriminante (double). El
    discriminante tiene la siguiente formula: (b^2)-4*a*c
    * Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
    que esto ocurra, el discriminante debe ser mayor o igual que 0.
    * Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
    * Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
    posibles soluciones.
*   Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
* Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
 */
public class ServiciosRaices {
    
    public Raices Crear(int a, int b, int c){
        
        return new Raices(a, b, c);
    }
    
    public double getDiscriminante(Raices r1){
        double discriminante;
        discriminante = Math.pow(r1.getB(), 2)-4*r1.getA()*r1.getC();
        return discriminante;
    }
    
    public boolean tieneRaices(Raices r1){
        double discriminante =getDiscriminante(r1);
        return discriminante >0;
        /*if (discriminante >0) {
            return true;
        }
        else{
            return false;
        }*/
    }
    
    public boolean tieneRaiz(Raices r1){
       double discriminante =getDiscriminante(r1);
       return discriminante ==0;
//        if (discriminante ==0) {
//            return true;
//        }
//        else{
//            return false;
//        } 
    }
    
    public void obtenerRaices(Raices r1){
        double [] soluciones = new double[2];
        if(tieneRaices(r1)){
            double solucion = (-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC())))/2*r1.getA();
            soluciones[0]=solucion;
            double solucion2 =(-r1.getB() - Math.sqrt(Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC())))/2*r1.getA();
            soluciones[1]=solucion2;
        }
        for (int i = 0; i < 2; i++) {
            System.out.print(" "+ soluciones[i] + " ");
        }
 
    }
    
    public double obtenerRaiz(Raices r1){
        double solucion=0;
        if (tieneRaiz(r1)) {
           solucion = (-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC())))/2*r1.getA(); 
           
        }
         return solucion;
                
    }
    
    public void calcularRaiz(Raices r1){
        ServiciosRaices sr = new ServiciosRaices();
        if (tieneRaices(r1)) {
            System.out.print("Las soluciones para esta ecuacion son : ");
             obtenerRaices(r1); 
             System.out.println("");
        }else if(tieneRaiz(r1)) {
            System.out.println("La solucion para esta ecuacion es ");
            obtenerRaiz(r1);
        }else{
            System.out.println("Esta ecuacion no tiene soluciones en los numeros reales");
        }
            
        
    }
}
