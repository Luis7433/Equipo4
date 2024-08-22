import java.util.List;

public class Calculadora implements ICalculadora {

    public boolean verificar(int a, int b) throws Exception {

        if (Integer.isNaN(a) || Integer.isNaN(b)) {
            System.out.println("A");
        }

    }

    @Override
    public int sumar(int a, int b) {
        return a+b;
    }

    public int sumar(int... array){
        int suma = 0;

        if(array.length == 0){

        } else{

        }

        for(int a:array) {
            suma += a;
        }

        return a;
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
