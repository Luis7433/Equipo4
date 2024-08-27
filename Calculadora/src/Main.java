import java.util.Scanner;

public class Main {

    //Métodos sobrecargados
    public static double getInput(Scanner sc, String message){
        double num = 0.0;
        boolean validInput = false; // flag para la validacion de los numeros
        while (!validInput) { // While que lee el número
            try {
                System.out.println("Ingrese el " + message + " número (puede ser entero o decimal): ");
                num = Double.parseDouble(sc.nextLine().trim());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Número inválido. Por favor, ingrese un número válido.");
            }
        }
        return num;
    }
    public static char getInput(Scanner sc){
        char operacion = ' ';
        boolean validInput = false; // flag para la validacion de los numeros
        while (!validInput) {
            System.out.println("Seleccione la operación (+, -, *, /): ");

            operacion = sc.nextLine().trim().charAt(0);

            if (operacion == '+' || operacion == '-' || operacion == '*' || operacion == '/') {

                validInput = true;

            } else {
                System.out.println("Operación no válida. Por favor, ingrese una operación válida (+, -, *, /).");

            }
        }
        return operacion;
    }


    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        double num1 = 0.0, num2 = 0.0, resultado = 0.0;

        num1 = getInput(scanner,"primer");
        num2 = getInput(scanner, "segundo");

        try {
            switch (getInput(scanner)) {
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
}//class M