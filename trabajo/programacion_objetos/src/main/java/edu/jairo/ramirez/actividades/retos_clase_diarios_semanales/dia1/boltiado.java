package edu.jairo.ramirez.actividades.retos_clase_diarios_semanales.dia1;
import java.util.Scanner;
// boltiado:variable asignada para que funcione
//la funcion reversed cambia la distribucion del string
public class boltiado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("mete un texto para boltiar: ");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("texto boltiado: " + reversed);
        scanner.close();
    }
}

