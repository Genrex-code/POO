public class Division implements Operacion {
@Override
    public int calcular(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }

        int cociente = 0;
        boolean negativo = (a < 0) ^ (b < 0); // Determina si el resultado debe ser negativo
        a = Math.abs(a);
        b = Math.abs(b);

        while (a >= b) {
            a -= b;
            cociente++;
        }

        return negativo ? -cociente : cociente;
    }
}