package edu.jairo.ramirez.actividades.calculadora.operaciones;

public class Division implements Operacion {
    public double calcular(double a, double b) {
        if (b != 0) return a / b;
        throw new ArithmeticException("Error: División por cero");
    }
}