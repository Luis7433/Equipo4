import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    @Test
    public void testSumarEnteros() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(3, 2);
        assertEquals(5, resultado, "La suma de 3 y 2 debe ser 5");
    }

    @Test
    public void testSumarDoubles() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.sumar(3.5, 2.5);
        assertEquals(6.0, resultado, 0.0001, "La suma de 3.5 y 2.5 debe ser 6.0");
    }

    @Test
    public void testRestarEnteros() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado, "La resta de 5 y 3 debe ser 2");
    }

    @Test
    public void testRestarDoubles() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.restar(5.5, 3.2);
        assertEquals(2.3, resultado, 0.0001, "La resta de 5.5 y 3.2 debe ser 2.3");
    }

    @Test
    public void testMultiplicarEnteros() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(4, 3);
        assertEquals(12, resultado, "La multiplicación de 4 y 3 debe ser 12");
    }

    @Test
    public void testMultiplicarDoubles() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(3.5, 2.0);
        assertEquals(7.0, resultado, 0.0001, "La multiplicación de 3.5 y 2.0 debe ser 7.0");
    }

    @Test
    public void testDividirEnteros() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(8, 4);
        assertEquals(2.0, resultado, 0.0001, "La división de 8 entre 4 debe ser 2.0");
    }

    @Test
    public void testDividirDoubles() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(9.0, 3.0);
        assertEquals(3.0, resultado, 0.0001, "La división de 9.0 entre 3.0 debe ser 3.0");
    }

    @Test
    public void testDividirPorCeroEnteros() {
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(5, 0);
        }, "Dividir por cero debería lanzar una ArithmeticException");
    }

    @Test
    public void testDividirPorCeroDoubles() {
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(5.0, 0.0);
        }, "Dividir por cero debería lanzar una ArithmeticException");
    }

}
