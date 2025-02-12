package edu.jairo.ramirez.actividades.act4.process;
import java.util.ArrayList;

import edu.jairo.ramirez.actividades.act4.data.Profesor;
//manejo de profesores
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

