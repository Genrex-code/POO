package edu.jairo.ramirez.actividades.act3.ui;

//aclaracion : me equivoque al estribir pero es el CLI y no puedo renombrarlo porqeu se descompone el branch :/ y mi laptop :/

public class CII {
    public static void main(String[] args) {
        CII ui = new CII ();

        System.out.println("=== Bienvenido al Programa para aser las compras de la tiendita mercado de abasto ===");
        System.out.println("1. agregar productos al inventario (solo adminss)");
        System.out.println("2. escojer y agregar al carrito para comprar :3");
        System.out.println("3. Salir y comprar todo lo que has agregado al carrito :3");

        boolean salir = false;
        while (!salir) {
            System.out.print("\nElige una opción (1-3): ");
            int opcion = new java.util.Scanner(System.in).nextInt();

            switch (opcion) {
                case 1 -> process.carrito_v1();
                case 2 -> process.Trabajador_bodega_v1();
                case 3 -> {
                    System.out.println("gracias por comprar en la tiendita vuelva pronto");
                    salir = true;
                }
                default -> System.out.println("eso no podemos hacer compre algo o vayase");
            }
        }
    }
}