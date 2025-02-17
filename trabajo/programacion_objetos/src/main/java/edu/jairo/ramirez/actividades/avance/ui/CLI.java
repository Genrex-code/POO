package edu.jairo.ramirez.actividades.avance.ui;
import edu.jairo.ramirez.actividades.avance.process.Consulta;
import edu.jairo.ramirez.actividades.avance.process.EncargadaBiblioteca;
import edu.jairo.ramirez.actividades.avance.process.Validador;
import edu.jairo.ramirez.actividades.avance.data.Libreria;
import edu.jairo.ramirez.actividades.avance.data.UsuariosGuardados;
import edu.jairo.ramirez.actividades.avance.data.Usuario;
import edu.jairo.ramirez.actividades.avance.data.Libro;
import java.util.Scanner;
// interfaz a base de variables para el multiidioma asi vien bilingue poes 
/*
 * esta clase esta dedicada a la interfaz de linea de comando CLI para interactuar con la biblioteca y sus diferentes servicios 
 * y el constructor se basa en 2 que la @encargadabiblioteca y por el otro lado 
 * estara la consulta de @libro y de @usuario
 * y un poco mas abajo esta la seccion en la cual se muestran nuestro menu 
 */
public class CLI {
    private EncargadaBiblioteca encargada;
    private Consulta consulta;
    
    public CLI(EncargadaBiblioteca encargada, Consulta consulta) {
        this.encargada = encargada;
        this.consulta = consulta;
    }
    
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Agregar libro\n2. Consultar libros\n3. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion == 1) {
                System.out.println("Ingrese título del libro:");
                String titulo = scanner.nextLine();
                System.out.println("Ingrese ISBN(codigo) del libro:");
                String isbn = scanner.nextLine();
                encargada.registrarLibro(new Libro(titulo, isbn));
                System.out.println("Libro agregado.");
            } else if (opcion == 2) {
                consulta.consultarLibros();
            } else {
                break;
            }
        }
        scanner.close();
    }
}
