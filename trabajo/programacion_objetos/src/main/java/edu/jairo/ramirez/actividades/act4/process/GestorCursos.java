package edu.jairo.ramirez.actividades.act4.process;
import java.util.ArrayList;

import edu.jairo.ramirez.actividades.act4.data.Curso;
/*
 * La clase GestorCursos se encarga de gestionar los cursos de la escuela.
 * Se agregó un método para agregar un curso y otro para listar los cursos.
 * Constructor de la clase GestorCursos.
 * @param cursos Lista de cursos.
 * Agrega un curso a la lista de cursos.
 * @param curso Curso a agregar.
 * Lista los cursos de la escuela.
 * @return Cadena con los datos de los cursos.
 */
//manejo de cursos
public class GestorCursos {
 private ArrayList<Curso> cursos = new ArrayList<>();

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            System.out.println(c);
        }
    }
}
