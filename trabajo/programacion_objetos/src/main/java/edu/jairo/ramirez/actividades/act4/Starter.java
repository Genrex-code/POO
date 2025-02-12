package edu.jairo.ramirez.actividades.act4;
import edu.jairo.ramirez.actividades.act4.ui.CLI;
//un rato mas aca metere la interfaz para idiomas pero ahorita toca dormir
/*
 * la clase Starter es la que inicia el CLI 
 * @param mostrarMenu inicializa la interfaz
 */
public class Starter {
    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.mostrarMenu();
    }
}