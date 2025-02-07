package edu.jairo.ramirez.actividades.avance.process;
import edu.jairo.ramirez.actividades.avance.data.Libreria;
import edu.jairo.ramirez.actividades.avance.data.UsuariosGuardados;
// aca realizare las validaciones de los libros en el registro.
public class validador {
    public boolean validarPrestamo(Usuario usuario, Libro libro) {
        return usuario.getPrestamos().size() < 2 && libro.isDisponible();
    }
}
