import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú Calculadora ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Seno");
            System.out.println("8. Coseno");
            System.out.println("9. Tangente");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            if (opcion == 10) {
                System.out.println("Saliendo de la calculadora...");
                break;
            }

            double num1, num2;
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + calc.sumar(num1, num2));
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + calc.restar(num1, num2));
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + calc.multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + calc.dividir(num1, num2));
                    break;
                case 5:
                    System.out.print("Ingrese la base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + calc.potencia(num1, num2));
                    break;
                case 6:
                    System.out.print("Ingrese el número: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Resultado: " + calc.raizCuadrada(num1));
                    break;
                case 7:
                    System.out.print("Ingrese el ángulo en grados: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Resultado: " + calc.seno(num1));
                    break;
                case 8:
                    System.out.print("Ingrese el ángulo en grados: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Resultado: " + calc.coseno(num1));
                    break;
                case 9:
                    System.out.print("Ingrese el ángulo en grados: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Resultado: " + calc.tangente(num1));
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}
