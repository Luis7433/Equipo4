import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean validInput = false;
		Scanner scanner = new Scanner(System.in);
		Calculadora calculadoraNormal = new Calculadora();
		CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();

	        int opcion = 0;

	        do {
	            // Mostrar el menú
	            System.out.println("Seleccione el tipo de calculadora:");
	            System.out.println("1. Calculadora Normal");
	            System.out.println("2. Calculadora Científica");
	            System.out.println("0. Salir");

				while(!validInput){
					try {
						System.out.print("Ingrese su opción: ");
						// Leer la opción del usuario
						opcion = scanner.nextInt();
						if(opcion > 2 || opcion < 0)
							throw new InputMismatchException();
						validInput = true;
					}
					catch(InputMismatchException ie){
						System.out.println("Esa no es una opción válida");
						scanner.nextLine();
					}
				}

	            
	            // Ejecutar la acción correspondiente
	            switch (opcion) {
	                case 1:
	                	calculadoraNormal.ejecutar();
	                    break;
	                case 2:
	                    calculadoraCientifica.ejecutar();
	                    break;
	                case 0:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Intente de nuevo.");
	            }
	            
	        } while (opcion != 0);

	        // Cerrar el scanner
	        scanner.close();
	    }
	
}
