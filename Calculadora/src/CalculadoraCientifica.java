
public class CalculadoraCientifica extends Calculadora{
	
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
	    
	    // Convertir el resultado de la suma decimal a binario y luego de binario a entero
	    return Integer.parseInt(Integer.toBinaryString(sumaDecimal));
	}
	

}

