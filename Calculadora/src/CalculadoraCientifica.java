import java.util.Scanner;

public class CalculadoraCientifica extends Calculadora{
	
	 private int num1, num2, resultado;
	    private Scanner scanner = new Scanner(System.in);

	    public void ejecutar(){
	        num1 = getInputB(scanner, "Ingrese el primer número (debe ser binario): ");
	        num2 = getInputB(scanner, "Ingrese el segundo número (debe ser binario): ");

	        try {
	            switch (getInput(scanner)) {
	                case '+':
	                    resultado = sumar(num1, num2);
	                    break;
	                case '-':
	                    resultado = restar(num1, num2);
	                    break;
	                default:
	                    System.out.println("Operación no válida");
	                    return;
	            }
	            System.out.println("El resultado es: " + resultado);

	        } catch (NumberFormatException e) {
	            System.out.println(e.getMessage()); // Manejo de la excepción de la resta
	        }
	    }

	    
	    public int getInputB(Scanner scanner, String mensaje) {
	    	String entrada ="";
	        int numero = 0;
	        boolean validInput = false;

	        while (!validInput) {
	            try {
	                System.out.println(mensaje);
	                entrada =scanner.nextLine().trim();
	                if(!esBinario(entrada)) throw new NumberFormatException();
	                numero = Integer.parseInt(entrada);
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
	            System.out.println("Seleccione la operación (+, -): ");
	            operacion = scanner.nextLine().trim().charAt(0);
	            if (operacion == '+' || operacion == '-' ) {
	                validInput = true;
	            } else {
	                System.out.println("Operación no válida. Por favor, ingrese una operación válida (+, -).");
	            }
	        }
	        return operacion;
	    }
	    
	    public static boolean esBinario(String cadena) {
	        // Comprobar si la cadena está vacía
	        if (cadena == null || cadena.isEmpty()) {
	            return false;
	        }

	        // Validar que cada carácter en la cadena sea '0' o '1'
	        for (char c : cadena.toCharArray()) {
	            if (c != '0' && c != '1') {
	                return false;
	            }
	        }
	        return true;
	    }
	
	@Override
	public int sumar(int binario1, int binario2) {
	    // Convertir los números binarios (enteros) a enteros decimales
	    int numero1 = Integer.parseInt(String.valueOf(binario1), 2);
	    int numero2 = Integer.parseInt(String.valueOf(binario2), 2);
	    
	    // Sumar los valores decimales
	    int sumaDecimal = numero1 + numero2;
	    
	    // Convertir el resultado de la suma decimal a binario y luego de binario a entero
	    return Integer.parseInt(Integer.toBinaryString(sumaDecimal));
	}
	
	
	@Override
	public int restar(int binario1, int binario2) {
	    // Convertir los números binarios (enteros) a enteros decimales
	    int numero1 = Integer.parseInt(String.valueOf(binario1), 2);
	    int numero2 = Integer.parseInt(String.valueOf(binario2), 2);
	    
	    // restar los valores decimales
	    int sumaDecimal = numero1 - numero2;
	    if(sumaDecimal<0)  throw new NumberFormatException("Operación invalida");
	    
	    // Convertir el resultado de la suma decimal a binario y luego de binario a entero
	    return Integer.parseInt(Integer.toBinaryString(sumaDecimal));
	}
	

}

