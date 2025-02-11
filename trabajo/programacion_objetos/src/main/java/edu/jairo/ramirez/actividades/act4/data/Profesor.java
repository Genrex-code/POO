package edu.jairo.ramirez.actividades.act4.data;
//nota del programar 1: profesor no lleva plural :7
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
