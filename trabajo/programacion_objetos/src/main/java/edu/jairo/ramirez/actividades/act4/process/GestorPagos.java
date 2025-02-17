package edu.jairo.ramirez.actividades.act4.process;
import edu.jairo.ramirez.actividades.act4.data.Profesor;
import java.util.ArrayList;
//calulo de sueldo de profesores
/*
 * La clase GestorPagos se encarga de gestionar los pagos a los profesores de la escuela.
 * Se agregó un método para agregar un profesor y otro para calcular y mostrar los pagos.
 * Constructor de la clase GestorPagos.
 * @param profesores Lista de profesores.
 * Agrega un profesor a la lista de profesores.
 * @param profesor Profesor a agregar.
 * Calcula y muestra los pagos a los profesores.
 * @return Cadena con los pagos a los profesores.
 * @param profesor Profesor a calcular su pago.
 * @param sueldoSemanal Sueldo semanal del profesor.
 * @param nombre Nombre del profesor.
 */
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
