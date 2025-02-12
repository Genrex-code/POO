package edu.jairo.ramirez.actividades.act4.ui;
import java.util.Scanner;
import edu.jairo.ramirez.actividades.act4.data.Alumnos;
import edu.jairo.ramirez.actividades.act4.data.Curso;
import edu.jairo.ramirez.actividades.act4.data.Materia;
import edu.jairo.ramirez.actividades.act4.data.Profesor;
import edu.jairo.ramirez.actividades.act4.process.GestorAlumnos;
import edu.jairo.ramirez.actividades.act4.process.GestorCursos;
import edu.jairo.ramirez.actividades.act4.process.GestorPagos;
import edu.jairo.ramirez.actividades.act4.process.GestorProfesores;
//le pedi a chatgpt que me adapte mi menu de otros trabajos a este por temas de comodidad(se me anda descomponiniendo el teclado)
//de nuevo solo copie y pegue todo 
public class CLI {
    private Scanner scanner;
    private GestorPagos gestorPagos;

    public CLI() {
        scanner = new Scanner(System.in);
        gestorPagos = new GestorPagos();
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Agregar Profesor");
            System.out.println("2. Agregar Alumno");
            System.out.println("3. Calcular y Mostrar Pagos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    agregarProfesor();
                    break;
                case 2:
                    agregarAlumno();
                    break;
                case 3:
                    gestorPagos.calcularYMostrarPagos();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private void agregarProfesor() {
        System.out.print("Ingrese el nombre del profesor: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el número de nómina: ");
        String numNomina = scanner.nextLine();
        System.out.print("Ingrese el sueldo por hora: ");
        double sueldoPorHora = scanner.nextDouble();
        System.out.print("Ingrese las horas semanales de la materia: ");
        int horasSemanales = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        System.out.print("Ingrese el nombre de la materia: ");
        String nombreMateria = scanner.nextLine();
        System.out.print("Ingrese la clave de la materia: ");
        String claveMateria = scanner.nextLine();
        System.out.print("Ingrese los créditos de la materia: ");
        int creditos = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        Materia materia = new Materia(nombreMateria, claveMateria, creditos, horasSemanales);
        Profesor profesor = new Profesor(nombre, numNomina, sueldoPorHora, materia);

        gestorPagos.agregarProfesor(profesor);
        System.out.println("Profesor agregado correctamente.");
    }

    private void agregarAlumno() {
        System.out.print("Ingrese la matrícula del alumno: ");
        String matricula = scanner.nextLine();
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del alumno: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        System.out.print("Ingrese el nombre del curso: ");
        String nombreCurso = scanner.nextLine();

        System.out.println("Ingrese los datos de las tres materias del curso:");

        Materia[] materias = new Materia[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nMateria " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombreMateria = scanner.nextLine();
            System.out.print("Clave: ");
            String claveMateria = scanner.nextLine();
            System.out.print("Créditos: ");
            int creditos = scanner.nextInt();
            System.out.print("Horas semanales: ");
            int horasSemanales = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            materias[i] = new Materia(nombreMateria, claveMateria, creditos, horasSemanales);
        }

        Curso curso = new Curso(nombreCurso, materias);
        Alumno alumno = new Alumno(matricula, nombre, edad, curso);

        System.out.println("Alumno agregado correctamente.");
        System.out.println(alumno);
    }
}