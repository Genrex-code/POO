package edu.jairo.ramirez.actividades.act4.process;
import java.util.ArrayList;
import edu.jairo.ramirez.actividades.act4.data.Alumnos;
//nota para estas partes de process y por pura flojera copeare y pegare los imports tal ves acabando 
//los vuelva a acomodar bien (dudo)
//nota 2 :al final si tuve que quitar las sobras :c
//manejo de alumnos
/*
 * La clase GestorAlumnos se encarga de gestionar los alumnos de la escuela.
 * Se agregó un método para agregar un alumno y otro para listar los alumnos.
 * Constructor de la clase GestorAlumnos.
 * @param alumnos Lista de alumnos.
 * Agrega un alumno a la lista de alumnos.
 * @param alumno Alumno a agregar.
 * Lista los alumnos de la escuela.
 * @return Cadena con los datos de los alumnos.
 */
public class GestorAlumnos {
    private ArrayList<Alumnos> alumnos = new ArrayList<>();

    public void agregarAlumno(Alumnos alumno) {
        alumnos.add(alumno);
    }

    public void listarAlumnos() {
        for (Alumnos a : alumnos) {
            System.out.println(a);
        }
    }
}