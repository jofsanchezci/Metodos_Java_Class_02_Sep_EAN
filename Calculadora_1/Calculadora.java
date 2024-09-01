public class Calculadora {

    // Métodos para operaciones matemáticas básicas
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }

    // Métodos para operaciones científicas
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double raizCuadrada(double numero) {
        if (numero < 0) {
            System.out.println("Error: Raíz cuadrada de un número negativo.");
            return Double.NaN;
        }
        return Math.sqrt(numero);
    }

    public double seno(double angulo) {
        return Math.sin(Math.toRadians(angulo));
    }

    public double coseno(double angulo) {
        return Math.cos(Math.toRadians(angulo));
    }

    public double tangente(double angulo) {
        return Math.tan(Math.toRadians(angulo));
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Operaciones matemáticas básicas
        System.out.println("Suma: 5 + 3 = " + calc.sumar(5, 3));
        System.out.println("Resta: 5 - 3 = " + calc.restar(5, 3));
        System.out.println("Multiplicación: 5 * 3 = " + calc.multiplicar(5, 3));
        System.out.println("División: 5 / 3 = " + calc.dividir(5, 3));

        // Operaciones científicas
        System.out.println("Potencia: 2^3 = " + calc.potencia(2, 3));
        System.out.println("Raíz Cuadrada: √16 = " + calc.raizCuadrada(16));
        System.out.println("Seno de 45 grados: " + calc.seno(45));
        System.out.println("Coseno de 45 grados: " + calc.coseno(45));
        System.out.println("Tangente de 45 grados: " + calc.tangente(45));
    }
}
