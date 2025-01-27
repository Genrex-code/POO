package edu.jairo.ramirez.actividades.retos_clase_diarios_semanales.dia1;
import java.util.Arrays;

public class reto4_v2 {
    //ingreso de datos al arreglo 
    public static void main(String[] args) {
        int[] arregloOriginal = {-6, -3, -1, 2, 4, 5};

        // invocamos para calcular
        int[] cuadradosOrdenados = obtenerCuadradosOrdenados(arregloOriginal);

        // mandamos a imprirmir el codigo para que funcione 
        System.out.println("Arreglo original: " + Arrays.toString(arregloOriginal));
        System.out.println("Arreglo con cuadrados ordenados: " + Arrays.toString(cuadradosOrdenados));
    }

    public static int[] obtenerCuadradosOrdenados(int[] arreglo) {
        int n = arreglo.length;
        int[] resultado = new int[n];

        // Uso de 2 punteros
        int izquierda = 0;
        int derecha = n - 1;
        int posicion = n - 1;

        while (izquierda <= derecha) {
            int cuadradoIzquierda = arreglo[izquierda] * arreglo[izquierda];
            int cuadradoDerecha = arreglo[derecha] * arreglo[derecha];

            // orden a los resultados
            if (cuadradoIzquierda > cuadradoDerecha) {
                resultado[posicion] = cuadradoIzquierda;
                izquierda++;
            } else {
                resultado[posicion] = cuadradoDerecha;
                derecha--;
            }
            posicion--;
        }

        return resultado;
    }
}