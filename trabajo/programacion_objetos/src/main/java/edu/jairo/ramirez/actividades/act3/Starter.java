package edu.jairo.ramirez.actividades.act3;
import edu.jairo.ramirez.actividades.act3.ui.CII;
/*
 * La clase Starter es simplemente el punto de inicio del programa.
 * Inicia el ciclo de ejecución creando una instancia de la clase CII y llamando al método mostrarMenu()
 * que luego gestiona la interacción con el usuario.
 */
public class Starter {
    public static void main(String[] args) {
        CII interfaz = new CII();
        interfaz.mostrarMenu();
    }
}