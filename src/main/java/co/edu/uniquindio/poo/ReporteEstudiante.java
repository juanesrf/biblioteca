package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class ReporteEstudiante extends Reporte{
        private LinkedList<Estudiante>estudiantes;
    public ReporteEstudiante(String id, LinkedList<Estudiante> estudiantes){
        super(id);
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



    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }



    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

        public static Estudiante estudianteMaxPrestamo(List<Estudiante> estudiantes) {
        Estudiante estudianteMax = null;
        int maxPrestamos = 0;

        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante estudianteActual = estudiantes.get(i);
            int cantidadPrestamos = estudianteActual.getPrestamoRealizado().size();

            if (cantidadPrestamos > maxPrestamos) {
                maxPrestamos = cantidadPrestamos;
                estudianteMax = estudianteActual;
            }
        }
        return estudianteMax;
    
        
    
    }



        @Override
        public String toString() {
            return "ReporteEstudiante [Id=" + getId() + ", estuidiante con mayor cantidad de prestamos ="+estudianteMaxPrestamo(estudiantes)+ "]";
        }
}


