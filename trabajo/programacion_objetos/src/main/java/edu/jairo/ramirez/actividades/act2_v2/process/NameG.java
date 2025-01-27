package edu.jairo.ramirez.actividades.act2_v2.process;

import Data.Nombres;
// verifica que los nombres esten en la lista
public class NameG {
    public String verificarNombre(String nombre) {
        for (String nombreValido : Nombres.obtenerNombresValidos()) {
            if (nombre.equalsIgnoreCase(nombreValido)) {
                return "Hola, " + nombreValido + "como esstaaan";
            }
        }
        return "Hola, " + nombre + ". te toca invitar la coca";
    }
}