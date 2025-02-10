package edu.jairo.ramirez.actividades.avance.data;
// me dice que libros han sido prestados 
/*
 * libro:clase que representa un libro de la biblioteca 
 * incluye la estructura construcutor de los libros en el sistema que incluye
 * titulo,codigo ,y si esta disponile 
 * agrege un getter para poder obtner los libros de la lista 
 * y agrege un valor booleano para saber si esta disponible o no
 */
public class Libro {
    private String titulo;
    private String isbn;
    private boolean disponible = true;

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public String getTitulo() { return titulo; }
    public String getIsbn() { return isbn; }
    public boolean isDisponible() { return disponible; }
    public void prestar() { disponible = false; }
    public void devolver() { disponible = true; }
}
