package edu.jairo.ramirez.actividades.act4.process;
import java.util.ArrayList;
//calulo de sueldo de profesores
public class GestorPagos {
    private ArrayList<Profesor> profesores = new ArrayList<>();

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void calcularYMostrarPagos() {
        System.out.println("\n=== PAGOS A PROFESORES ===");
        for (Profesor profesor : profesores) {
            double sueldoSemanal = profesor.calcularSueldoSemanal();
            System.out.println(profesor.getNombre() + " - Sueldo semanal: $" + sueldoSemanal);
        }
    }
}
