package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Prestamo {
    private String id;
    private double valor;
    private LinkedList<Libro>libros;


    public Prestamo(String id,LinkedList<Libro> libros, double valor) {
        this.id = id;
        this.libros = libros;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro){
        getLibros().add(libro);
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "Prestamo [id=" + id + ", valor=" + valor + ", libros=" + libros + "]";
    }


    

}
