package edu.jairo.ramirez.actividades.act2_v2.ui;
import process.NameG;
import process.NumerosPares;

import java.util.Scanner;

public class CLI {
    private final NombreVerifier nombreVerifier = new NombreVerifier();
    private final NumerosPares numerosPares = new NumerosPares();

    public void ejecutarParte1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // revisa que el nombre esta en al lista 
        
        String mensaje = nombreVerifier.verificarNombre(nombre);
        System.out.println(mensaje);
    }

    public void ejecutarParte2() {
        // genera los numeros 
        int[] numerosParesArray = numerosPares.generarNumerosPares();
        numerosPares.mostrarNumerosPares(numerosParesArray);
    }
}