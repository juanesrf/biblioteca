package co.edu.uniquindio.poo;
import java.util.LinkedList;
public class Biblioteca {
    private String id;
    private String nombre;
    private String direccion;
    private LinkedList<Libro>libros;
    private LinkedList<Estudiante>estudiantes;
    private LinkedList<Bibliotecario>bibliotecarios;
    private LinkedList<Autor>autores;
    private LinkedList<Editorial>editoriales;


    public Biblioteca(String id, String nombre, String direccion,LinkedList<Libro> libros, LinkedList<Estudiante> estudiantes,
    LinkedList<Bibliotecario> bibliotecarios,LinkedList<Autor> autores, LinkedList<Editorial> editoriales) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = libros;
        this.estudiantes = estudiantes;
        this.bibliotecarios = bibliotecarios;
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



    public LinkedList<Libro> getLibros() {
        return libros;
    }



    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }



    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }



    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }



    public LinkedList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }



    public void setBibliotecarios(LinkedList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarLibro(Libro libro){
        getLibros().add(libro);
    }

    public void agregarEstudiante(Estudiante estudiante){
        if(verificarEstudianteExiste(estudiante.getCedula())){ 
           
            System.out.println("error, ya existe el estudiante");

        }else{
            getEstudiantes().add(estudiante);
        }
    }


    public boolean verificarEstudianteExiste(String cedula){
        boolean existe = false;
        for (Estudiante estudiante : estudiantes) { 
            if(estudiante.getCedula().equals(cedula)){
                existe=true;
            }
        }
        return existe;
    }

    public void agregarBibliotecario(Bibliotecario bibliotecario){
        if(verificarBibliotecarioExiste(bibliotecario.getCedula())){ //Llama la función para verificar que el contacto no este en la lista
           //si está añadido imprime este mensaje
           
            System.out.println("error, ya existe el bibliotecario");

        }else{
            //Si no esta contenido lo agrega a la lista
            getBibliotecarios().add(bibliotecario);
        }
    }

    public boolean verificarBibliotecarioExiste(String cedula){
        boolean existe = false;
        for (Bibliotecario bibliotecario : bibliotecarios) { 
            if(bibliotecario.getCedula().equals(cedula)){
                existe=true;
            }
        }
        return existe;
    }


}


    
