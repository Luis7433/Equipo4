public class Calculadora implements ICalculadora {

    @Override
    public int sumar(int a, int b) {
        return a+b;
    }

    @Override
    public int restar(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplicar(int a, int b)  {
        return a*b;
    }

    @Override
    public int dividir(int a, int b)  {
        int div = 0;

        try {
            div = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("No");
        }

        return div;

    }
}
