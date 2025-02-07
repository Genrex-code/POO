package edu.jairo.ramirez.actividades.avance.data;
import java.util.ArrayList;
import java.util.List;
//notas: aca sera donde guardaremos los datos de los libros
public class Libreria {
 private List<Libro> libros = new ArrayList<>();
    
    public void agregarLibro(Libro libro) { libros.add(libro); }
    public List<Libro> getLibros() { return libros; }
}
