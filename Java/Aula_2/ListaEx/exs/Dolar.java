import java.util.Scanner;
public class Dolar {
    public static void main(String[] args) {
        Scanner messi = new Scanner(System.in);
        System.out.print("Digite a cotacao do dolar: ");
        double cotacao = messi.nextDouble();
        System.out.print("\nDigite a quantidade de dolares: ");
        double dolares = messi.nextDouble();
        double Real = dolares * cotacao;
        System.out.println(String.format("Voce possui R$ %.2f", Real));
        messi.close();
    }
}