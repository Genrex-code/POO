package edu.jairo.ramirez.actividades.avance.data;
import java.util.ArrayList;
import java.util.List;
//regula quien a pedido libros de los usuarios
public class Usuario {
    private String id;
    private List<Libro> prestamos = new ArrayList<>();

    public Usuario(String id) {
        this.id = id;
    }

    public String getId() { return id; }
    public List<Libro> getPrestamos() { return prestamos; }
    
    public void prestarLibro(Libro libro) {
        if (prestamos.size() < 2) {
            prestamos.add(libro);
            libro.prestar();
        }
    }

    public void devolverLibro(Libro libro) {
        prestamos.remove(libro);
        libro.devolver();
    }
}
