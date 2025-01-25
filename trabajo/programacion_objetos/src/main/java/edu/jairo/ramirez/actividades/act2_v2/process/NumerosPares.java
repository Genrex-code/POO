package edu.jairo.ramirez.actividades.act2_v2.process;

public class NumerosPares {
    public int[] generarNumerosPares() {
        int[] numerosPares = new int[50];
        int index = 0;

        // Generar números pares del 2 al 100
        for (int i = 2; i <= 100; i += 2) {
            numerosPares[index] = i;
            index++;
        }
        return numerosPares;
    }

    public void mostrarNumerosPares(int[] numerosPares) {
        System.out.println("Los números pares del 2 al 100 son:");
        for (int numero : numerosPares) {
            System.out.print(numero + " ");
        }
        System.out.println(); // Línea adicional para mejor formato
    }
}