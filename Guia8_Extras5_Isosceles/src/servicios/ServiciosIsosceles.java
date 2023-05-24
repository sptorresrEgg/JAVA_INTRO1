/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Isosceles;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class ServiciosIsosceles {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Isosceles> mistriangulos = new ArrayList<>();
    public void crear() {
        //Isosceles t1 = new Isosceles();
        int a, b, c,alt, opc;
        
        
        do {
            System.out.println("----Menu opciones----");
            System.out.println("             1. Crear Triangulo");
            System.out.println("             2. Salir");
            System.out.println("");
            System.out.println("Ingrese una Opcion");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                  

                        do {
                        System.out.println("Recuerde que por lo menos dos lados deben ser iguales");
                        System.out.println("Ingrese el lado a del triangulo");
                        a = leer.nextInt();
                        System.out.println("Ingrese el lado b del triangulo");
                        b = leer.nextInt();
                        System.out.println("Ingrese el lado c del triangulo");
                        c = leer.nextInt();
                        System.out.println("Ingrese la altura del triangulo");
                        alt = leer.nextInt();
                        
                    } while (!(a == b || b == c || c == a));
                   
                    
                    mistriangulos.add(new Isosceles(a, b, c,alt));
                   
                   
                    
                case 2:
                    break;
                default:
                    System.out.println("La opción ingresada no es valida, intente de nuevo");
                    break;
            }

        } while (opc != 2);
        System.out.println(mistriangulos);
       

    }
    
    public void calcularArea(){
        int area=0;
        
        //base * altura/2;
        Isosceles i1 = new Isosceles();
        for (int i = 0; i <mistriangulos.size() ; i++) {
            //System.out.println(mistriangulos.get(i).getLadoa());
            if (mistriangulos.get(i).getLadoa()==mistriangulos.get(i).getLadob()) {
                
                area = (mistriangulos.get(i).getLadoc()*mistriangulos.get(i).getAltura())/2;
                mistriangulos.get(i).setArea(area);
            }else if(mistriangulos.get(i).getLadob()==mistriangulos.get(i).getLadoc()){
                area = (mistriangulos.get(i).getLadoa()*mistriangulos.get(i).getAltura())/2;
                mistriangulos.get(i).setArea(area);
            }else{
                area = (mistriangulos.get(i).getLadob()*mistriangulos.get(i).getAltura())/2;
                mistriangulos.get(i).setArea(area);
            }
            System.out.println("El area del triangulo " + (i+1) + " es " +area );
            
            
        }
        System.out.println("");
        
    }
    
    public void calcularPerimetro(){
        int perimetro;
        Isosceles i1 = new Isosceles();
        for (int i = 0; i < mistriangulos.size(); i++) {
            perimetro = mistriangulos.get(i).getLadoa()+mistriangulos.get(i).getLadob()+mistriangulos.get(i).getLadoc();
            System.out.println("El perimetro del triangulo " + (i+1) + " es " +perimetro );
            
        }
        System.out.println("");
    }
    
    public void areaMayor(){
        int mayor = mistriangulos.get(0).getArea();
        int indice=0;
        for (int i = 0; i < mistriangulos.size(); i++) {
            if (mistriangulos.get(i).getArea()> mayor) {
                mayor = mistriangulos.get(i).getArea();
                indice = i;
            }
        }
        System.out.println("El triangulo con mayor are es :" + mistriangulos.get(indice));
    }
}

