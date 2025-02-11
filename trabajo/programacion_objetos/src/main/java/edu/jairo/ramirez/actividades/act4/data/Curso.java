package edu.jairo.ramirez.actividades.act4.data;
//base de datos para los cursos 
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
