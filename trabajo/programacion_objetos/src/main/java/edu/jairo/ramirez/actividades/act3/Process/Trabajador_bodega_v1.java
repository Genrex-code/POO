package edu.jairo.ramirez.actividades.act3.process;
import java.util.Scanner;

import edu.jairo.ramirez.actividades.act3.data.almacen_v1;
import edu.jairo.ramirez.actividades.act3.data.producto;
/*
 * Trabajador_bodega_v1 permite agregar productos al inventario (almacen_v1).
 * Solicita datos al usuario, los valida y los agrega al almacen.
 * Usa leerDouble() para evitar errores al ingresar números.}
 * al final le puse un poco de humor.
 */
public class Trabajador_bodega_v1 {
    private almacen_v1 almacen;
    private Scanner scanner;

    public Trabajador_bodega_v1(almacen_v1 almacen) {
        this.almacen = almacen;
        this.scanner = new Scanner(System.in);
    }

    public void agregarProducto() {
        System.out.println("\n mandando al chalan a poner nuevos productos en la bodega:");
        System.out.print("Código de la tienda : ");
        String codigo = scanner.nextLine();
        System.out.print("producto como tal:: ");
        String tipo = scanner.nextLine();
        double costo = leerDouble("presio: ");
        double impuesto = leerDouble("Impuesto (que porcentaje le daremos al gobierno (ay mis ganancias :c)): ");
        producto producto = new producto(codigo, tipo, costo, impuesto);
        almacen.agregarProducto(producto);
    }
    private double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" Error: Ingrese un número válido no seas wey.");
            }
        }
    }
}
