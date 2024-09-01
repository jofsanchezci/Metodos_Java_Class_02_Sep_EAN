
# Calculadora en Java con Métodos Separados

## Descripción

Esta implementación de una calculadora en Java demuestra cómo separar la lógica de las operaciones matemáticas y científicas en métodos individuales dentro de una clase. La clase `Calculadora` contiene métodos para realizar las siguientes operaciones:

- **Operaciones Matemáticas Básicas:**
  - Suma
  - Resta
  - Multiplicación
  - División

- **Operaciones Científicas:**
  - Potencia
  - Raíz Cuadrada
  - Seno
  - Coseno
  - Tangente

## Estructura de Archivos

- `Calculadora.java`: Contiene la clase `Calculadora` con todos los métodos necesarios para realizar las operaciones.

## Ejemplo de Código

```java
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
            return Double.NaN;
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
}
```

## Compilación y Ejecución

Compila el archivo `Calculadora.java` con el siguiente comando:

```bash
javac Calculadora.java
```

Luego, puedes utilizar esta clase en otros programas que requieran realizar operaciones matemáticas o científicas.
