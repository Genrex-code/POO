package edu.jairo.ramirez.actividades.avance.data;
import java.util.ArrayList;
import java.util.List;
/*
 * en esta clase se representa a unusuario registrado en la biblioteca y para esto.
 * y usamos un constructor para darle estrucutra a los datos que se ingresan 
 * use un getters para accerder a los datos guardados 
 * y una funncion que realiza un prestamo de libro si el usuario no supera el limite de libros a prestar.
 */
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
