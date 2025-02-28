import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCalculadora - Elige una opción:");
            System.out.println("1. Multiplicar");
            System.out.println("2. Dividir");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 3) {
                System.out.println("Gracias, hasta pronto.");
                break;
            }

            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();

            Operacion operacion;
            if (opcion == 1) {
                operacion = new Multiplicacion();
            } else if (opcion == 2) {
                operacion = new Division();
            } else {
                System.out.println("Opción no válida.");
                continue;
            }

            try {
                int resultado = operacion.calcular(num1, num2);
                System.out.println("Resultado: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}