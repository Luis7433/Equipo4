import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		Calculadora calculadoraNormal = new Calculadora();
		CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();

	        int opcion;

	        do {
	            // Mostrar el menú
	            System.out.println("Seleccione el tipo de calculadora:");
	            System.out.println("1. Calculadora Normal");
	            System.out.println("2. Calculadora Científica");
	            System.out.println("0. Salir");
	            System.out.print("Ingrese su opción: ");
	            
	            // Leer la opción del usuario
	            opcion = scanner.nextInt();
	            
	            // Ejecutar la acción correspondiente
	            switch (opcion) {
	                case 1:
	                	calculadoraNormal.ejecutar();
	                    break;
	                case 2:
	                    calculadoraCientifica.ejecutar();;
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
