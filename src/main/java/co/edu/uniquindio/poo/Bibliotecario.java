package co.edu.uniquindio.poo;

import java.util.LinkedList;
public class Bibliotecario extends Persona {
    private double salario;
    private int anosTrabajando;
    private LinkedList<Prestamo>prestamoRealizado;

   
    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario, int anosTrabajando, LinkedList<Prestamo> prestamoRealizado){
        super(nombre, cedula, telefono, correo);
        this.salario= 0.0;
        this.anosTrabajando=anosTrabajando;
        this.prestamoRealizado = prestamoRealizado;  
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnosTrabajando() {
        return anosTrabajando;
    }

    public void setAnosTrabajando(int anosTrabajando) {
        this.anosTrabajando = anosTrabajando;
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

    public void asignarSalario(ReporteTotalSalario reporteTotalSalario, double comision, double calcularBonificacion) {
        this.salario = reporteTotalSalario.salarioTotal(comision, calcularBonificacion);
    }

    @Override
    public String toString() {
        return "Bibliotecario [salario=" + salario + ", anosTrabajando=" + anosTrabajando + ", prestamoRealizado="
                + prestamoRealizado + "]";
    }


    
}
