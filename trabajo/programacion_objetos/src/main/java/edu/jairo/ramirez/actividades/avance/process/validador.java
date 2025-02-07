package edu.jairo.ramirez.actividades.avance.process;
import edu.jairo.ramirez.actividades.avance.data.Libro;
import edu.jairo.ramirez.actividades.avance.data.Usuario;
// aca realizare las validaciones de los libros en el registro.
public class Validador {
    public boolean validarPrestamo(Usuario usuario, Libro libro) {
        return usuario.getPrestamos().size() < 2 && libro.isDisponible();
    }
}
