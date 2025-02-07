package edu.jairo.ramirez.actividades.avance;
// aca en el starter pondre un pequeño menu para que pueda seleccionar el idioma asi biligue poes y tambien va a inicializar el programa 
import edu.jairo.ramirez.actividades.avance.ui.CLI;
import edu.jairo.ramirez.actividades.avance.data.Libreria;
import edu.jairo.ramirez.actividades.avance.data.UsuariosGuardados;
import edu.jairo.ramirez.actividades.avance.process.Consulta;
import edu.jairo.ramirez.actividades.avance.process.EncargadaBiblioteca;
import edu.jairo.ramirez.actividades.avance.process.ReporteGenerador;
import edu.jairo.ramirez.actividades.avance.process.Validador;

public class starter {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        UsuariosGuardados usuarios = new UsuariosGuardados();
        Validador validador = new Validador();
        EncargadaBiblioteca encargada = new EncargadaBiblioteca(libreria, usuarios, validador);
        Consulta consulta = new Consulta(libreria, usuarios);
        CLI cli = new CLI(encargada, consulta);
        cli.mostrarMenu();
    }
}
