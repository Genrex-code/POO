package edu.jairo.ramirez.actividades.act3.ui;

//aclaracion : me equivoque al estribir pero es el CLI y no puedo renombrarlo porqeu se descompone el branch :/ y mi laptop :/
// nota 2 este es el cli reciclado de la act 1 y de parte de las 2 pporque me dio flojera hacerlo de nuevo 
import java.util.Scanner;

import edu.jairo.ramirez.actividades.act3.data.almacen_v1;
import edu.jairo.ramirez.actividades.act3.process.Trabajador_bodega_v1;
import edu.jairo.ramirez.actividades.act3.process.carrito_v1;

public class CII {
    private Scanner scanner;
    private almacen_v1 almacen;
    private Trabajador_bodega_v1 trabajador;
    private carrito_v1 carrito;

    public CII() {
        scanner = new Scanner(System.in);
        almacen = new almacen_v1();
        trabajador = new Trabajador_bodega_v1(almacen);
        carrito = new carrito_v1();
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\n bienvenidos ala tienda de la esquina :D :");
            System.out.println("1 Agregar producto al inventario");
            System.out.println("2 Mostrar inventario");
            System.out.println("3 usar el carrito e ir de compras");
            System.out.println("4 Salir");

            System.out.print("escoje algo: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    trabajador.agregarProducto();
                    break;
                case 2:
                    almacen.mostrarInventario();
                    break;
                case 3:
                System.out.println("el carrito se le descompuso la llanta y no funciona ");
                break;
                case 4:
                    System.out.println(" se me cuidan......................");
                    return;
                default:
                    System.out.println(" no seas tonto escoje algo de lo que hay ahi en el menu");
            }
        }
    }
}