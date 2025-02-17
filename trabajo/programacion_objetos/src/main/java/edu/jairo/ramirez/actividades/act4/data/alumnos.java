package edu.jairo.ramirez.actividades.act4.data;
// recuerda que lleva S en alumnos,todo ciego duraste 15 mins
//buscando el error y era el plural :7
/*
 * la clase alumnos representa a un estudiante con matricula nombre edad y curso 
 * se agrego un consturctor que recibe los datos de un alumno y un metodo toString
 *  Constructor de la clase Alumnos.    
 *@param matricula Matrícula del alumno.
 *@param nombre Nombre del alumno.
 *@param edad Edad del alumno.
 *@param curso Curso en el que está inscrito el alumno.
 devuelve una representación en cadena de un objeto Alumnos.
 *@return Cadena con los datos del alumno.
 */
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
