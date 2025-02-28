package edu.jairo.ramirez.actividades.calculadora.operaciones;

public class Potencia implements Operacion {
    public double calcular(double a, double b) {
        return Math.pow(a, b);
    }
}