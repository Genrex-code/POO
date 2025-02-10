package edu.jairo.ramirez.actividades.avance.process;
import edu.jairo.ramirez.actividades.avance.data.Libro;
import edu.jairo.ramirez.actividades.avance.data.Usuario;
// aca realizare las validaciones de los libros en el registro.
/*
 * en esta clase se revisan y validan las reglas de prestamos de libros en la biblioteca.
 * en base a 
 * @param usuario Usuario que desea tomar un libro prestado.
 * @param libro Libro que se desea prestar.
 * @return true si el préstamo es válido, false si no lo es.
 */
public class Validador {
    public boolean validarPrestamo(Usuario usuario, Libro libro) {
        return usuario.getPrestamos().size() < 2 && libro.isDisponible();
    }
}
