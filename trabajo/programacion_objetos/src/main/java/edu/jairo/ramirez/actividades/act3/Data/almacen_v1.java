package edu.jairo.ramirez.actividades.act3.data;
import java.util.ArrayList;
import java.util.List;
// para copiar \n salto de linea xd
//**
// almacen_v1 es una clase que gestiona un inventario de productos.
// Usa una lista (ArrayList) para almacenar productos.
// Puede agregar productos (agregarProducto).
// Puede mostrar los productos almacenados (mostrarInventario).
// Depende de una clase producto, que debería definir el método muestraProducto().
//**
public class almacen_v1 {
    private List<producto> inventario;

    public almacen_v1() {
        this.inventario = new ArrayList<>();
    }

    public void agregarProducto(producto producto) {
        inventario.add(producto);
        System.out.println(" producto añadido ");
    }

    public void mostrarInventario() {
        System.out.println("\n esto tenemos en la tienda ");
        for (producto p : inventario) {
            p.muestraProducto();
            System.out.println("----------------------------");
        }
    }
}

