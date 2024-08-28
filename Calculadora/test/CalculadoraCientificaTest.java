import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraCientificaTest {

    @Test
    public void testSumarBinarios() {
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        int resultado = calculadora.sumar(1010, 110); // 1010 (10 en decimal) + 110 (6 en decimal) = 10000 (16 en decimal)
        assertEquals(10000, resultado, "La suma de 1010 y 110 en binario debe ser 10000");
    }

    @Test
    public void testRestarBinarios() {
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        int resultado = calculadora.restar(1010, 10); // 1010 (10 en decimal) - 10 (2 en decimal) = 1000 (8 en decimal)
        assertEquals(1000, resultado, "La resta de 1010 y 10 en binario debe ser 1000");
    }

    @Test
    public void testEntradaBinariaValida() {
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        // Aquí podrías simular la entrada del usuario con un Scanner mockeado o con un método de test.
        // Por ejemplo, validar que "1010" es aceptado como entrada válida.
        boolean esValido = CalculadoraCientifica.esBinario("1010");
        assertEquals(true, esValido, "La cadena 1010 debe ser considerada válida para un número binario");
    }

    @Test
    public void testEntradaBinariaInvalida() {
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        // Aquí podrías validar que una entrada no binaria es rechazada.
        boolean esValido = CalculadoraCientifica.esBinario("102");
        assertEquals(false, esValido, "La cadena 102 no debe ser considerada válida para un número binario");
    }

}
