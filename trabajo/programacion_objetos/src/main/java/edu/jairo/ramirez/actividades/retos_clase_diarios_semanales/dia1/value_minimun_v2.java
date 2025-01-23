package edu.jairo.ramirez.actividades.retos_clase_diarios_semanales.dia1;
import java.util.Scanner;

public class value_minimun_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una secuencia de números separados por espacios:");
        String input = scanner.nextLine();
        String[] numerosStr = input.split(" ");
        int min = Integer.MAX_VALUE;
        for (String numero : numerosStr) {
            int valor = Integer.parseInt(numero);
            if (valor < min) {
                min = valor; 
            }
        }
        System.out.println("El valor más pequeño en la secuencia es: " + min);

        scanner.close();
    }
}
//este codigo lo que hace es pedir al usuario una serie de numeros
//por medio de un metodo parecido al metodo burbuja logramos conseguir 
// el valor minimo