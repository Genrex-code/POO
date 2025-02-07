package edu.jairo.ramirez.actividades.avance.ui;
import edu.jairo.ramirez.actividades.avance.process.Consulta;
import edu.jairo.ramirez.actividades.avance.process.EncargadaBiblioteca;
import edu.jairo.ramirez.actividades.avance.process.reportegenerador;
import edu.jairo.ramirez.actividades.avance.process.validador;
import edu.jairo.ramirez.actividades.avance.data.Libreria;
import edu.jairo.ramirez.actividades.avance.data.UsuariosGuardados;
// interfaz a base de variables para el multiidioma asi vien bilingue poes 
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
                System.out.println("Ingrese ISBN del libro:");
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
