package edu.jairo.ramirez.actividades.act2_v2;
import edu.jairo.ramirez.actividades.act2_v2.ui.CLI;

public class starter {
    public static void main(String[] args) {
        CLI ui = new CLI ();

        System.out.println("=== Bienvenido al Programa ===");
        System.out.println("1. Verificar Nombre");
        System.out.println("2. Mostrar Números Pares");
        System.out.println("3. Salir");

        boolean salir = false;
        while (!salir) {
            System.out.print("\nElige una opción (1-3): ");
            int opcion = new java.util.Scanner(System.in).nextInt();

            switch (opcion) {
                case 1 -> ui.ejecutarParte1();
                case 2 -> ui.ejecutarParte2();
                case 3 -> {
                    System.out.println("Saliendo del programa. ¡Adiós!");
                    salir = true;
                }
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}