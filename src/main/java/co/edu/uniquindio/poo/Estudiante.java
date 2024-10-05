package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Estudiante extends Persona{
    private LinkedList<Prestamo>prestamoRealizado;
    
    public Estudiante(String nombre, String cedula, String telefono, String correo, LinkedList<Prestamo> prestamoRealizado){
        super(nombre, cedula, telefono, correo);
        this.prestamoRealizado = prestamoRealizado;  
    }

    public LinkedList<Prestamo> getPrestamoRealizado() {
        return prestamoRealizado;
    }

    public void setPrestamoRealizado(LinkedList<Prestamo> prestamoRealizado) {
        this.prestamoRealizado = prestamoRealizado;
    }

    public void agregarPrestamo(Prestamo prestamo){
        getPrestamoRealizado().add(prestamo);
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre=" + getNombre() + ", Prestamo Realizado=" + getPrestamoRealizado()
                + ", Cedula=" + getCedula() + ", Telefono=" + getTelefono() + ", Correo=" + getCorreo()
                + "]";
    }

    
}
