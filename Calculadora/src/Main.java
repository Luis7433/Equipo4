import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        Scanner scanner = new Scanner(System.in);

        double num1 = 0.0, num2 = 0.0;

        char operacion = ' ';

        boolean validInput = false; // flag para la validacion de los numeros

        while (!validInput) { // While que lee el 1er numero

            try {
                System.out.println("Ingrese el primer número (puede ser entero o decimal): ");

                num1 = Double.parseDouble(scanner.nextLine().trim());

                validInput = true;

            } catch (NumberFormatException e) {

                System.out.println("Número inválido. Por favor, ingrese un número válido.");
            }
        }

        validInput = false; // Resetear el flag para el 2do numero

        while (!validInput) { // While que lee el 2do numero

            try {
                System.out.println("Ingrese el segundo número (puede ser entero o decimal): ");

                num2 = Double.parseDouble(scanner.nextLine().trim());

                validInput = true;

            } catch (NumberFormatException e) {

                System.out.println("Número inválido. Por favor, ingrese un número válido.");
            }
        }

        validInput = false; // Resetear el flag para la operación

        // While para leer el tipo de operacion
        while (!validInput) {

            System.out.println("Seleccione la operación (+, -, *, /): ");

            operacion = scanner.nextLine().trim().charAt(0);

            if (operacion == '+' || operacion == '-' || operacion == '*' || operacion == '/') {

                validInput = true;

            } else {
                System.out.println("Operación no válida. Por favor, ingrese una operación válida (+, -, *, /).");

            }
        }

        double resultado = 0.0;

        try {
            switch (operacion) {
                case '+':
                    resultado = calc.sumar(num1, num2);
                    break;
                case '-':
                    resultado = calc.restar(num1, num2);
                    break;
                case '*':
                    resultado = calc.multiplicar(num1, num2);
                    break;
                case '/':
                    resultado = calc.dividir(num1, num2);
                    break;
                default:
                    System.out.println("Operación no válida");
                    return;
            }
            System.out.println("El resultado es: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage()); // Manejo de la excepción de la division
        }
    }//metodo main
}//class Main