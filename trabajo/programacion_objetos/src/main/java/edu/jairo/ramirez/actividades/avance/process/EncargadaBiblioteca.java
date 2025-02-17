package edu.jairo.ramirez.actividades.avance.process;
import  edu.jairo.ramirez.actividades.avance.data.Libreria;
import  edu.jairo.ramirez.actividades.avance.data.Libro;
import edu.jairo.ramirez.actividades.avance.data.UsuariosGuardados;
// se encargara del registro de los libros y de los prestamos ademas que hace que no 
// se puedan prestar mas de los libros que se tienen en existencia 
// se encargara de la devolucion de los libros
/*
 * se uso un contructor para darle orden y estructura a los datos:
 * @param libreria Instancia de la biblioteca.
 *@param usuarios Instancia del gestor de usuarios.
 *@param validador Instancia del validador de reglas de préstamo.
 *@registrar libro nos permite conectar a la estrucutra de @libro para asi poder guardarse 
 */
public class EncargadaBiblioteca {
    private Libreria libreria;
    private UsuariosGuardados usuarios;
    private Validador validador;
    
    public EncargadaBiblioteca(Libreria libreria, UsuariosGuardados usuarios, Validador validador) {
        this.libreria = libreria;
        this.usuarios = usuarios;
        this.validador = validador;
    }
    
    public void registrarLibro(Libro libro) { libreria.agregarLibro(libro); }
}