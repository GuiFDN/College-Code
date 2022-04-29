import java.util.Scanner;
class Calculadora {
    private int num1;
    private int num2;
    //construtores sobrecarregados
    public Calculadora() {} //reescreve o padrão
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int soma (int a, int b) {
        return a + b;
    }
    public int soma (int a, int b, int c) {
        return  a + b + c;
    }
    public double soma (double a, double b) {
        double resultado = a + b;
        return resultado;
    }
    public double soma (int a, double b) {
        return a + b;
    }
    public double soma (double a, int b) {
        return a + b;
    }
    public double soma (String sA, String sB) {
        double dA = Double.parseDouble (sA);
        double dB = Double.parseDouble (sB);
        return dA + dB;
    }
    public int soma () {
    return this.num1 + this.num2;
    }
    public int subtracao (int a, int b) {
        return a - b;
    }
    public int multiplicacao (int a, int b) {
        return a * b;
    }
    public int divisao (int a, int b) {
        return a / b; //note que a divisao é inteira
    }
}