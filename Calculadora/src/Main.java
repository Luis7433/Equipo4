import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		Scanner scanner = new Scanner(System.in);
		
		double num1 = getNum(scanner, "Ingrese el primer número (puede ser entero o decimal): ");
		double num2 = getNum(scanner, "Ingrese el segundo número (puede ser entero o decimal): ");
		
		char operacion = getOper(scanner);double resultado = 0.0;

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
			System.out.println(e.getMessage()); // Manejo de la excepción de la división
		}
	}

	public static double getNum(Scanner scanner, String mensaje) {
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

	public static char getOper(Scanner scanner) {
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

}
