package edu.jairo.ramirez.actividades.act4.data;
// recuerda que lleva S en alumnos,todo ciego duraste 15 mins
//buscando el error y era el plural :7
public class Alumnos{
private String matricula;
private String nombre;
private int edad;
private Curso curso;

public Alumnos (String matricula, String nombre, int edad, Curso curso){
    this.matricula = matricula;
    this.nombre = nombre;
    this.edad = edad;
    this.curso = curso;
}
public String toString() {
    return nombre + " (" + matricula + "), Edad: " + edad + "\n" + curso;
}
}
