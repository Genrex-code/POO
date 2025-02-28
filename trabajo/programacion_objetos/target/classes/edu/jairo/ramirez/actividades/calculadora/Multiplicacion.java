public class Multiplicacion implements Operacion {
@Override
    public int calcular(int a, int b) {
        int resultado = 0;
        boolean negativo = (a < 0) ^ (b < 0); // Determina si el resultado debe ser negativo
        a = Math.abs(a);
        b = Math.abs(b);

        for (int i = 0; i < b; i++) {
            resultado += a;
        }

        return negativo ? -resultado : resultado;
    }
}