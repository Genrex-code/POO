package edu.jairo.ramirez.actividades.avance.data;

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
