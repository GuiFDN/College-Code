import java.util.Scanner;
class CalculadoraCientifica {
    private int a;
    private int b;
    //Construtor Sobrecarregado
    public CalculadoraCientifica() {} //reescreve o padrão
    public CalculadoraCientifica(int a, int b) {
        this.a = a;
        this.b = b;
    } //Métodos de raiz
    double raiz(int a) {
        return (int) Math.sqrt(a);
    }
    double raiz(double a) {
        return Math.sqrt(a);
    }
    double raiz(String a) {
        return Math.sqrt(Double.parseDouble(a));
    } //Métodos de potência
    double potencia(byte a, byte b) {
        return Math.pow(a, b);
    }
    double potencia(String a, String b) {
        return Math.pow(Double.parseDouble(a), Double.parseDouble(b));
    }
    double potencia(int a, double b) {
        return Math.pow((int)a, b);
    }
}