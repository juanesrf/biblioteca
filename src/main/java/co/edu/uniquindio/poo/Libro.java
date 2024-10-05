package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.LinkedList;
public class Libro {
    private  String codigo;
    private String isbn;
    private String titulo;
    private  LocalDate fecha;
    private int unidadesDisponible;
    private LinkedList<Autor> autores;
    private LinkedList<Editorial> editoriales;
    

    public Libro(String codigo, String isbn, String titulo, LocalDate fecha, int unidadesDisponible,LinkedList<Autor> autores, LinkedList<Editorial> editoriales) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.titulo = titulo;
        this.fecha = fecha;
        this.unidadesDisponible = unidadesDisponible;
        this.autores = autores;
        this.editoriales = editoriales;

    }

    


    public LinkedList<Autor> getAutores() {
        return autores;
    }




    public void setAutores(LinkedList<Autor> autores) {
        this.autores = autores;
    }




    public LinkedList<Editorial> getEditoriales() {
        return editoriales;
    }




    public void setEditoriales(LinkedList<Editorial> editoriales) {
        this.editoriales = editoriales;
    }




    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getUnidadesDisponible() {
        return unidadesDisponible;
    }

    public void setUnidadesDisponible(int unidadesDisponible) {
        this.unidadesDisponible = unidadesDisponible;
    }




    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", titulo=" + titulo + ", fecha=" + fecha
                + ", unidadesDisponible=" + unidadesDisponible + ", autores=" + autores + ", editoriales=" + editoriales
                + "]";
    }

    
}
