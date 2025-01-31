package edu.jairo.ramirez.actividades.act3.data;
 
public class producto {
    private String codigo;
    private String tipo;
    private double costo;
    private double impuesto;

    // estructura del codigo 
    public producto(String codigo, String tipo, double costo, double impuesto) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.costo = costo;
        this.impuesto = impuesto;
    }

    // GET (GETTER)
    public String getCodigo() { return codigo; }
    public String getTipo() { return tipo; }
    public double getCosto() { return costo; }
    public double getImpuesto() { return impuesto; }

    // SET (SETTER)
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setCosto(double costo) { this.costo = costo; }
    public void setImpuesto(double impuesto) { this.impuesto = impuesto; }

    // IMPRECION DEL PRODUCTO
    public void muestraProducto() {
        System.out.println("Código de tienda : " + codigo);
        System.out.println("producto: " + tipo);
        System.out.println("presio: $" + costo);
        System.out.println("Impuesto pal gobierno :c ...: " + (impuesto * 100) + "%");
    }

    // calculadora del carrito 
    public double calcularPrecio(double utilidad) {
        double precioBase = costo + (costo * utilidad);
        double precioFinal = precioBase + (precioBase * impuesto);
        return precioFinal;
    }
}