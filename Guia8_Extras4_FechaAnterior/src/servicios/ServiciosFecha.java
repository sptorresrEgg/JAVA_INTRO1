/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Fecha;
import java.util.Scanner;

/**
 *
 * @author sptorresr
 */
public class ServiciosFecha {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Fecha f1 = new Fecha();

    public void crearFecha() {
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        if (anio > 1899 && anio < 2022) {
            f1.setAnio(anio);
        }
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        f1.setMes(mes);
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        f1.setDia(dia);
        System.out.println(f1.toString());
    }

    public boolean ValidarBisiesto() {
        boolean valida;
        if (f1.getAnio() % 400 == 0) {
            System.out.println("El año digitado es biciesto");
            return valida = true;
        } else {
            return valida = false;
        }
    }

    public void CantidadDias() {
        switch (f1.getMes()) {
            case 1:
                System.out.println("Usted ingreso mes de enero que tiene 31 días");
                break;
            case 2:
                if (f1.getAnio() % 4 == 0) {
                    System.out.println("El mes de febrero que usted ingreso " + f1.getAnio() + " tiene 29 días");
                } else {
                    System.out.println("El mes de febrero febrero que usted ingreso");
                }
                break;
            case 3:
                System.out.println("Usted ingreso mes de marzo que tiene 31 días");
                break;
            case 4:
                System.out.println("Usted ingreso mes de Abril que tiene 30 días");
                break;
            case 5:
                System.out.println("Usted ingreso mes de Mayo que tiene 31 días");
                break;
            case 6:
                System.out.println("Usted ingreso mes de junio que tiene 30 días");
                break;
            case 7:
                System.out.println("Usted ingreso mes de julio que tiene 31 días");
                break;
            case 8:
                System.out.println("Usted ingreso mes de agosto que tiene 31 días");
                break;
            case 9:
                System.out.println("Usted ingreso mes de septiembre que tiene 30 días");
                break;
            case 10:
                System.out.println("Usted ingreso mes de octubre que tiene 31 días");
                break;
            case 11:
                System.out.println("Usted ingreso mes de noviembre que tiene 30 días");
                break;
            case 12:
                System.out.println("Usted ingreso mes de diciembre que tiene 31 días");
                break;
        }
    }

    public void diaAnterior() {
        int dia = 1;
        int mes = 1;
        int anio = 1900;
        if (f1.getDia() == 1 && f1.getMes() == 1) {
            dia = 31;
            mes = 12;
            anio = f1.getAnio() - 1;

        } else if (f1.getDia() != 1 && f1.getMes() == 1) {
            dia = f1.getDia() - 1;
            mes = 1;
            anio = f1.getAnio();
        } else if (f1.getAnio() % 4 == 0 && (f1.getAnio() % 100) != 0 && f1.getDia() == 1 && f1.getMes() == 3) {
            dia = 29;
            mes = 2;
            anio = f1.getAnio();

        } else if (f1.getAnio() % 4 != 0 && (f1.getAnio() % 100) != 0 && f1.getDia() == 1 && f1.getMes() == 3) {
            dia = 28;
            mes = 2;
            anio = f1.getAnio();

        } else if (f1.getDia() != 1 && f1.getMes() == 3) {
            System.out.println("Entre en primer else if");
        }

        switch (f1.getMes()) {
            //MESES CON 31 DIAS
            case 5:
            case 7:
            case 10:
                if (f1.getDia() == 1) {
                    mes = f1.getMes() - 1;
                    dia = 30;
                    anio = f1.getAnio();
                } else {
                    mes = f1.getMes();
                    dia = f1.getDia() - 1;
                    anio = f1.getAnio();
                }

                break;
            //MES DE DICIEMBRE CAMBIA DE AÑO    
            case 12:
                if (f1.getDia() == 1) {
                    mes = f1.getMes() - 1;
                    dia = 30;
                    anio = f1.getAnio();
                } else {
                    mes = f1.getMes();
                    dia = f1.getDia() - 1;
                    anio = f1.getAnio();
                }

                break;
            //MES AGOSTO ULTIMO DIA DEVULVE AL 31 DE JULIO---DOS MESES SEGUIDOS CON 31 DIAS
            case 8:
                if (f1.getDia() == 1) {
                    mes = f1.getMes() - 1;
                    dia = 31;
                    anio = f1.getAnio();
                } else {
                    mes = f1.getMes();
                    dia = f1.getDia() - 1;
                    anio = f1.getAnio();
                }

                break;
            //MESES DE 30 DIAS    
            case 4:
            case 6:
            case 9:
            case 11:
                if (f1.getDia() == 1) {
                    dia = 31;
                    anio = f1.getAnio();
                    mes = f1.getMes() - 1;
                } else {
                    dia = f1.getDia() - 1;
                    anio = f1.getAnio();
                    mes = f1.getMes();
                }
                break;

        }
        System.out.println("La fecha anterior a la ingresada es " + dia + "/" + mes + "/" + anio);

    }

    public void diaPosterior() {
        int dia = 1;
        int mes = 1;
        int anio = 1900;
        //valido diciembre
        if (f1.getDia() == 31 && f1.getMes() == 12) {
            System.out.println("ingrese a suma año");
            dia = 1;
            mes = 1;
            anio = f1.getAnio() + 1;

        } else if (f1.getDia() != 31 && f1.getMes() == 12) {
            System.out.println("Ingrese a sumadia");
            dia = f1.getDia() + 1;
            mes = f1.getMes();
            anio = f1.getAnio();
        } //valido febrero
        else if (f1.getMes() == 2) {
            boolean bisiesto = ValidarBisiesto();
             if (bisiesto) {
                dia = f1.getDia() + 1;
                mes = f1.getMes();
                anio = f1.getAnio();
            } else {
                dia = 1;
                mes = 3;
                anio = f1.getAnio();
            }
        }

        //valido ultimo del mes sin febrero ni diciembre
        if ((f1.getMes() != 12 && f1.getMes() != 02) && (f1.getDia() == 30 && f1.getDia() == 31)) {
            System.out.println("ingrese a mes diferente diciembre");
            dia = 1;
            mes = f1.getMes() + 1;
            anio = f1.getAnio();

        } else {
            System.out.println("ingrese a negacion mes diferente diciembre");
            dia = f1.getDia() + 1;
            mes = f1.getMes();
            anio = f1.getAnio();
        }

        System.out.println("La fecha posterior a la ingresada es " + dia + "/" + mes + "/" + anio);
    }

}
