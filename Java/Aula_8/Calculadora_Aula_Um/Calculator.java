package Aula_8.Calculadora_Aula_Um;
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
        int resultado = a + b;
        return resultado;
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