package edu.jairo.ramirez.actividades.act4.data;
//aca se guardan las materias 
/*
 * La clase Materia representa una materia académica con nombre, clave, créditos y horas semanales.
 * Se agregó un constructor que recibe los datos de una materia y un método toString.
 * Constructor de la clase Materia.
 * @param nombre Nombre de la materia.
 * @param clave Clave de la materia.
 * @param creditos Créditos de la materia.
 * @param horasSemanales Horas semanales de la materia.
 * Devuelve una representación en cadena de un objeto Materia.
 * @return Cadena con los datos de la materia.
 */
public class Materia {
private String nombre;
private String clave;
private int creditos;
private int horasSemanales;

public Materia() {}
public Materia(String nombre,String clave,int creditos,int horasSemanales){
    this.nombre = nombre;
    this.clave = clave;
    this.creditos = creditos;
    this.horasSemanales = horasSemanales;
}
public int getCreditos(){ return creditos;}
public int getHorasSemanales(){return horasSemanales;}

public String toString(){
    return nombre + " (" + clave + ") - " + creditos + " créditos, " + horasSemanales + " horas/P/semana";
}
}
