package edu.jairo.ramirez.actividades.act3.process;

import data.producto;
import data.almacen_v1;
import java.util.Scanner;


public class trabajador_bodega_v1 {
    private almacen_v1 almacen;
    private Scanner scanner;

    public trabajador_bodega_v1(almacen_v1 almacen) {
        this.almacen = almacen;
        this.scanner = new Scanner(System.in);
    }

    public void agregarProducto() {
        System.out.println("\n🔧 Ingresando un nuevo producto:");

        System.out.print("Código: ");
        String codigo = scanner.nextLine();

        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();

        double costo = leerDouble("Costo: ");
        double impuesto = leerDouble("Impuesto (en decimal, ej. 0.16 para 16%): ");

        Producto producto = new Producto(codigo, tipo, costo, impuesto);
        almacen.agregarProducto(producto);
    }

    private double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Error: Ingrese un número válido.");
            }
        }
    }
}
