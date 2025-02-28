package edu.jairo.ramirez.actividades.calculadora.operaciones;

public class Raiz implements Operacion {
    public double calcular(double a, double b) {
        if (a >= 0) return Math.sqrt(a);
        throw new IllegalArgumentException("Error: Raíz de número negativo");
    }
}