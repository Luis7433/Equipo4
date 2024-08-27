import java.util.Scanner;

public class Main {
	//Sobrecarga
	public static double getInput(Scanner scanner, String mensaje) {
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
	public static char getInput(Scanner scanner) {
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
	
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		Scanner scanner = new Scanner(System.in);

		double resultado = 0.0;
		double num1 = getInput(scanner, "Ingrese el primer número (puede ser entero o decimal): ");
		double num2 = getInput(scanner, "Ingrese el segundo número (puede ser entero o decimal): ");

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
			System.out.println(e.getMessage()); // Manejo de la excepción de la división
		}
	}
}
