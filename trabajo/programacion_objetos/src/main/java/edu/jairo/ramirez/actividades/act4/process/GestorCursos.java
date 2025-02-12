package edu.jairo.ramirez.actividades.act4.process;

import java.util.ArrayList;
import edu.jairo.ramirez.actividades.act4.data.Curso;


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
