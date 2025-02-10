package edu.jairo.ramirez.actividades.avance.data;
import java.util.ArrayList;
import java.util.List;
//notas: aca sera donde guardaremos los datos de los libros
/*
 * libreria:representa la biblioteca y almacena la colección de libros disponibles.
 * la lista libros almacena los libros disponibles
 * incluye una seccion para agregar mas libros y para obtener la lista
 */
public class Libreria {
 private List<Libro> libros = new ArrayList<>();
    
    public void agregarLibro(Libro libro) { libros.add(libro); }
    public List<Libro> getLibros() { return libros; }
}
