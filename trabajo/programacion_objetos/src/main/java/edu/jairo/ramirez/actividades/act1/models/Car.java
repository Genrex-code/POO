package edu.jairo.ramirez.actividades.act1.models;

public class Car {

    private String modelo;

    private String marca;

    private int numeroPuertas;

    private String color;
    
    @Override
    public String ToString (){
        return "Car{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                ", color='" + color + '\'' +
                '}';
    }
    public Car (String modelo, String marca, int numeroPuertas, String color) {
        this.modelo =modelo;
        this.marca =marca;
        this.numeroPuertas =numeroPuertas;
        this.color =color;

    }

}
