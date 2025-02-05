package edu.jairo.ramirez.actividades.act3.process;
import java.util.ArrayList;
import java.util.List;

import edu.jairo.ramirez.actividades.act3.data.producto;
public class carrito_v1 {
    private List<producto> carrito;

    public carrito_v1() {
        this.carrito = new ArrayList<>();
    }

    public void agregarAlCarrito(producto producto) {
        carrito.add(producto);
        System.out.println(" Producto agregado al carrito.");
    }

    public void mostrarCarrito() {
        System.out.println("\n actualmente esto hay en el carrito:");
        for (producto p : carrito) {
            p.muestraProducto();
            System.out.println("---------------------------------");
        }
    }
}