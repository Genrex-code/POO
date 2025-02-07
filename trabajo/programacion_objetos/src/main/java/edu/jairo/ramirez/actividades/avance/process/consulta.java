package edu.jairo.ramirez.actividades.avance.process;
import edu.jairo.ramirez.actividades.avance.data.Libreria;
import edu.jairo.ramirez.actividades.avance.data.Libro;
import edu.jairo.ramirez.actividades.avance.data.UsuariosGuardados;
// consultara libros , usuarios y prestamos
public class Consulta {
    private Libreria libreria;
    private UsuariosGuardados usuarios;
    
    public Consulta(Libreria libreria, UsuariosGuardados usuarios) {
        this.libreria = libreria;
        this.usuarios = usuarios;
    }
    
    public void consultarLibros() {
        for (Libro libro : libreria.getLibros()) {
            System.out.println("Título: " + libro.getTitulo() + " | ISBN(codigo): " + libro.getIsbn() + " | Disponible: " + libro.isDisponible());
        }
    }
}