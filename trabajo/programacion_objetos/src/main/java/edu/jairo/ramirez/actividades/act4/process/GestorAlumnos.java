package edu.jairo.ramirez.actividades.act4.process;
import edu.jairo.ramirez.actividades.act4.data.Alumnos;
import java.util.ArrayList;
//nota para estas partes de process y por pura flojera copeare y pegare los imports tal ves acabando 
//los vuelva a acomodar bien (dudo)
//nota 2 :al final si tuve que quitar las sobras :c
//manejo de alumnos
public class GestorAlumnos {
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void listarAlumnos() {
        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }
}