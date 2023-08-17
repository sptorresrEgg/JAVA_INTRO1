/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
 */
public class AlquilerAmarre {
    private String nombre;
    private int Dni;
    private String fechaAlquiler;
    private String fechaDevolucion;
    private String posiciónAmarre;
    private Barco barco;

    public AlquilerAmarre() {
    }

    public AlquilerAmarre(String nombre, int Dni, String fechaAlquiler, String fechaDevolucion, String posiciónAmarre, Barco barco) {
        this.nombre = nombre;
        this.Dni = Dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posiciónAmarre = posiciónAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosiciónAmarre() {
        return posiciónAmarre;
    }

    public void setPosiciónAmarre(String posiciónAmarre) {
        this.posiciónAmarre = posiciónAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "AlquilerAmarre{" + "nombre=" + nombre + ", Dni=" + Dni + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posici\u00f3nAmarre=" + posiciónAmarre + ", barco=" + barco + '}';
    }
    
    
    
}
