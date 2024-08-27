import java.util.Scanner;

public class Calculadora implements ICalculadora {

    private double num1, num2, resultado;
    private Scanner scanner = new Scanner(System.in);

    public void ejecutar(){
        num1 = getInput(scanner, "Ingrese el primer número (puede ser entero o decimal): ");
        num2 = getInput(scanner, "Ingrese el segundo número (puede ser entero o decimal): ");

        try {
            switch (getInput(scanner)) {
                case '+':
                    resultado = sumar(num1, num2);
                    break;
                case '-':
                    resultado = restar(num1, num2);
                    break;
                case '*':
                    resultado = multiplicar(num1, num2);
                    break;
                case '/':
                    resultado = dividir(num1, num2);
                    break;
                default:
                    System.out.println("Operación no válida");
                    return;
            }
            System.out.println("El resultado es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // Manejo de la excepción de la división
        }
    }

    public double getInput(Scanner scanner, String mensaje) {
        double numero = 0.0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println(mensaje);
                numero = Double.parseDouble(scanner.nextLine().trim());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Número inválido. Por favor, ingrese un número válido.");
            }
        }
        return numero;
    }

    public char getInput(Scanner scanner) {
        char operacion = ' ';
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Seleccione la operación (+, -, *, /): ");
            operacion = scanner.nextLine().trim().charAt(0);
            if (operacion == '+' || operacion == '-' || operacion == '*' || operacion == '/') {
                validInput = true;
            } else {
                System.out.println("Operación no válida. Por favor, ingrese una operación válida (+, -, *, /).");
            }
        }
        return operacion;
    }


    @Override
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    @Override
    public int restar(int a, int b) {
        return a - b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }//exception
        return (double) (a / b);
    }

    public double dividir(double a, double b) throws ArithmeticException {
        if (b == 0.0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }//exception
        return a / b;
    }
}//class Claculadorra
