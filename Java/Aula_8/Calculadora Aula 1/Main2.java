// get and set
import java.util.Scanner;
class Calculadora {
    private int num1;
    private int num2;
    //construtores sobrecarregados
    public Calculadora () {} // rescreeve o padrão
    public Calculadora (int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //sobrecargas da soma
    public int soma (int a, int b, int c) {
        return a + b + c;
    }
    public double soma (double a, double b) {
        return a + b;
    }
    public double soma (String sa, String sb) {
        double a = Double.parseDouble(sa);
        double b = Double.parseDouble(sb);
        return a + b;
    }
    public int subtracao (int a, int b) {
        return  a - b;
    }
    public int multiplicacao (int a, int b) {
        return a * b;
    }
    public int divisao (int a, int b) {
        return a / b ; // note que a divisão é inteira
    }
}
public class Main2 {
    public static void main (String args []) {
        Calculadora c = new Calculadora();
        System.out.println ("soma de 2 inteiros: " + c.soma (2, 3));
        System.out.println ("soma de 3 inteiros: " + c.soma (1, 2, 3));
        System.out.println ("soma de 2 reais: " + c.soma (2.4, 5.7));
    }
}