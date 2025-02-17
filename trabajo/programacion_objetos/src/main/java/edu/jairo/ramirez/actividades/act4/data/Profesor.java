package edu.jairo.ramirez.actividades.act4.data;
//nota del programador 1: profesor no lleva plural :7
/*
 * La clase Profesor representa a un profesor con nombre, número de nómina y sueldo por hora.
 * Se agregó un constructor que recibe los datos de un profesor, un método para asignar una materia
 * y un método para calcular el sueldo semanal del profesor.
 * Constructor de la clase Profesor.
 * @param nombre Nombre del profesor.
 * @param numNomina Número de nómina del profesor.
 * @param sueldoPorHora Sueldo por hora del profesor.
 * Devuelve una representación en cadena de un objeto Profesor.
 * @return Cadena con los datos del profesor.
 * @param materia Materia asignada al profesor.
 * @return Sueldo semanal del profesor.
 */
public class Profesor {
private String nombre;
private String numNomina;
private double sueldoPorHora;
private Materia materia;

public Profesor (String nombre,String numNomina, double sueldoPorHora){
    this.nombre = nombre;
    this.numNomina = numNomina;
    this.sueldoPorHora = sueldoPorHora;
}
public void asignarMateria(Materia materia) {
    this.materia = materia;
}

public double calcularSueldoSemanal() {
    return materia != null ? materia.getHorasSemanales() * sueldoPorHora : 0;
}

@Override
public String toString() {
    return nombre + " (Nómina: " + numNomina + ")\nMateria: " + (materia != null ? materia : "No asignada");
}
}
