package edu.jairo.ramirez.actividades.act4.process;
import java.util.ArrayList;

import edu.jairo.ramirez.actividades.act4.data.Profesor;
//manejo de profesores
/*
 * La clase GestorProfesores se encarga de gestionar los profesores de la escuela.
 * Se agregó un método para agregar un profesor y otro para listar los profesores.
 * Constructor de la clase GestorProfesores.
 * @param profesores Lista de profesores.
 * Agrega un profesor a la lista de profesores.
 * @param profesor Profesor a agregar.
 * Lista los profesores de la escuela.
 */
public class GestorProfesores {
    private ArrayList<Profesor> profesores = new ArrayList<>();

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void listarProfesores() {
        for (Profesor p : profesores) {
            System.out.println(p);
        }
    }
}

