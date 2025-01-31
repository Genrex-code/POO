package edu.jairo.ramirez.actividades.act3.data;
import java.util.ArrayList;
import java.util.List;
// para copiar \n
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

