package edu.jairo.ramirez.actividades.act3.ui;

//aclaracion : me equivoque al estribir pero es el CLI y no puedo renombrarlo porqeu se descompone el branch :/ y mi laptop :/
// nota 2 este es el cli reciclado de la act 1 
import data.almacen_v1;
import process.trabajador_bodega_v1;
import process.carrito_v1;
import java.util.Scanner;

public class CII {
    private Scanner scanner;
    private almacen_v1 almacen;
    private trabajador_bodega_v1 trabajador;
    private carrito_v1 carrito;

    public CII() {
        scanner = new Scanner(System.in);
        almacen = new almacen_v1();
        trabajador = new trabajador_bodega_v1(almacen);
        carrito = new carrito_v1();
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\n📌 Menú Principal:");
            System.out.println("1️⃣ Agregar producto al inventario");
            System.out.println("2️⃣ Mostrar inventario");
            System.out.println("3️⃣ Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    trabajador.agregarProducto();
                    break;
                case 2:
                    almacen.mostrarInventario();
                    break;
                case 3:
                    System.out.println("👋 Saliendo...");
                    return;
                default:
                    System.out.println("⚠️ Opción inválida, intente de nuevo.");
            }
        }
    }
}