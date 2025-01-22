package edu.jairo.ramirez.actividades.retos_clase_diarios_semanales.dia1;
import java.util.Scanner;
import java.util.HashSet;
//use la funcion hashset como un diccionario 
//cada palabra se cuenta como false y cuando toma un duplicado pasa a true
//y se termina la busqueda que va de letra en letra 

public class PrimerLetraDuplicada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("pon una palabra: ");
        String palabra = scanner.nextLine();

        int posicion = encontrarPrimeraDuplicada(palabra);

        if (posicion == -1) {
            System.out.println("no tiene palabras duplicadas.");
        } else {
            System.out.println("la primera letra duplicada es:'" + palabra.charAt(posicion) + "' en este lugar  " + (posicion + 1) + ".");
        }

        scanner.close();
    }

    public static int encontrarPrimeraDuplicada(String palabra) {

        HashSet<Character> letrasVistas = new HashSet<>();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (letrasVistas.contains(letra)) {
                return i;
            }

            letrasVistas.add(letra);
        }

        return -1;
    }
}
