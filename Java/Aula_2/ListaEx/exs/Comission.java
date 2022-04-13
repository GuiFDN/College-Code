import java.util.Scanner;
public class Comission {
    public static void main(String[] args) {
        Scanner messi = new Scanner(System.in);
        double comissao = 0.05;
        System.out.print("Digite a quantidade de pecas vendidas: ");
        int quant = messi.nextInt();
        System.out.print("\nDigite o preco unitario da peca: ");
        double preco = messi.nextDouble();
        double total = quant * preco;
        double pagamento = total * comissao;
        System.out.println(String.format
        ("O pagamento da comissao eh igual a R$ %.2f", pagamento));
        messi.close();
    }    
}
