public class Calculadora implements ICalculadora {

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    @Override
    public int restar(int a, int b) {
        return a - b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }//exception
        return (double) (a / b);
    }

    public double dividir(double a, double b) throws ArithmeticException {
        if (b == 0.0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }//exception
        return a / b;
    }
}//class Claculadorra
