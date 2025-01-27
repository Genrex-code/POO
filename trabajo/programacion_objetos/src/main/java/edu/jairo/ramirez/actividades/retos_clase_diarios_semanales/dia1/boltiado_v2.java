package edu.jairo.ramirez.actividades.retos_clase_diarios_semanales.dia1;
import java.util.Scanner;

public class boltiado_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Texto invertido: " + reversed);
        scanner.close();
    }
}