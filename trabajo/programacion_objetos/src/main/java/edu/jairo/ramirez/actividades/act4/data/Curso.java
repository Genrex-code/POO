package edu.jairo.ramirez.actividades.act4.data;
//base de datos para los cursos 
/*
 * la clase curso representa un curso academico compuesto por un nombre y un arreglo de materias
 * se agrego un constructor que recibe el nombre del curso y tres materias y un metodo getTotalCreditos
 * que devuelve la suma de los creditos de las materias y un metodo toString
 * Constructor de la clase Curso.
 * @param nombre Nombre del curso.
 * @param A1 Primera materia del curso.
 * @param A2 Segunda materia del curso.
 * @param A3 Tercera materia del curso.
 * Devuelve una representación en cadena de un objeto Curso.
 * @return Cadena con los datos del curso.
 */
public class Curso {
private String nombre;
private Materia[] materias;
public Curso(String nombre,Materia A1,Materia A2,Materia A3){
    this.nombre=nombre;
    this.materias=new Materia[]{A1,A2,A3};
}
public int getTotalCreditos() {
    int total = 0;
    for (Materia m : materias) total += m.getCreditos();
    return total;
}
public String tostring() {
    return "Curso: " + nombre + " (" + getTotalCreditos() + " créditos)";
}
}
