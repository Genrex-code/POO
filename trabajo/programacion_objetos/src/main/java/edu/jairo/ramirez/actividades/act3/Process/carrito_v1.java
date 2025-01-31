package edu.jairo.ramirez.actividades.act3.process;
import data.Producto;
import java.util.ArrayList;
import java.util.List;

public class carrito_v1 {
    private List<Producto> carrito;

    public carrito_v1() {
        this.carrito = new ArrayList<>();
    }

    public void agregarAlCarrito(Producto producto) {
        carrito.add(producto);
        System.out.println("🛒 Producto agregado al carrito.");
    }

    public void mostrarCarrito() {
        System.out.println("\n🛍️ Productos en el carrito:");
        for (Producto p : carrito) {
            p.muestraProducto();
            System.out.println("-------------------");
        }
    }
}