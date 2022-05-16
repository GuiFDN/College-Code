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
class Teste {
    public static void main(String[] args) {
        CalculadoraCientifica C1 = new CalculadoraCientifica();
        Scanner messi = new Scanner(System.in);
        //Testando os métodos de raíz
        System.out.print("\nTestando os metodos de raiz.\n");
        //Raiz com parâmetro int
        System.out.print("\nDigite um numero inteiro: ");
        int a = messi.nextInt(); // Entrada: 4
        System.out.printf("Raiz de %d eh igual a %.1f\n", a, C1.raiz(a));

        //Raiz com parâmetro Double
        System.out.print("\nDigite um numero flutuante: ");
        Double b = messi.nextDouble(); // Entrada: 4.0
        System.out.printf("Raiz de %.1f eh igual a %.1f\n", b, C1.raiz(b));

        //Raiz com parâmetro String
        System.out.print("\nDigite um numero: ");
        String c = messi.next(); // Entrada: 4
        System.out.printf("Raiz de %s eh igual a %.1f\n", c, C1.raiz(c));

        //Testando os métodos de potência
        System.out.print("\nTestando os metodos de potencia.\n");
        //Potência com parâmetros Byte
        System.out.print("\nDigite dois numeros: ");
        Byte d = messi.nextByte(); Byte e = messi.nextByte(); // Entrada: 2 3
        System.out.printf("Potencia de " + d + " elevado a " + e + " eh igual a %.1f\n", C1.potencia(d, e));

        //Potência com parâmetros String
        System.out.print("\nDigite dois numeros: ");
        String f = messi.next(); String g = messi.next(); // Entrada: 2 3
        System.out.printf("Potencia de %s elevado a %s eh igual a %.1f\n", f, g, C1.potencia(f, g));
        
        //Potência com parâmetros Int A e Double B
        System.out.print("\nDigite um numero inteiro e um flutuante: ");
        int h = messi.nextInt(); Double i = messi.nextDouble(); // Entrada: 2 3.0
        System.out.printf("Potencia de %d elevado a %.1f eh igual a %.1f\n", h, i, C1.potencia(h, i));

        //Fechando o scanner para economizar recursos
        messi.close();
    }
}
