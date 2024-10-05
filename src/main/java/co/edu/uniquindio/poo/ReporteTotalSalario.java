package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class ReporteTotalSalario extends Reporte{
    private LinkedList<Prestamo>prestamoRealizado;

    public ReporteTotalSalario(String id,  LinkedList<Prestamo> prestamoRealizado){
        super(id);
    }

    public LinkedList<Prestamo> getPrestamoRealizado() {
        return prestamoRealizado;
    }


    public void setPrestamoRealizado(LinkedList<Prestamo> prestamoRealizado) {
        this.prestamoRealizado = prestamoRealizado;
    }   

    public static double calcularComisionBibliotecario(LinkedList<Prestamo> prestamoRealizado) {
        double comisionTotal = 0.0;

        for (int i = 0; i < prestamoRealizado.size(); i++) {
            Prestamo prestamoActual = prestamoRealizado.get(i);
            double valorPrestamo = prestamoActual.getValor();

            comisionTotal += valorPrestamo * 0.20;
        }

        return comisionTotal;
    }

    public static double calcularBonificacion(Bibliotecario bibliotecario, double comision) {
        int anosTrabajando = bibliotecario.getAnosTrabajando();
        return comision * 0.02 * anosTrabajando;
    }

    public double salarioTotal(double comision, double calcularBonificacion){
        double total= comision + calcularBonificacion;
        return total;
    }

    @Override
    public String toString() {
        return "El salario total es:"+salarioTotal(0, 0);
    }
    
    
}
