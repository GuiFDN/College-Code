import java.util.Scanner;
public class Strings2 {
    public static void main (String args []) {
        
        String nome = "Felipe";
        int tamanho = nome.length();
        System.out.println (nome + " tem " + tamanho + " caracteres");
       
        //declarar e instanciar um objeto da classe Scanner
        Scanner scanner = new Scanner (System.in); //System.in é entrada padrão
        System.out.println ("Digite sua idade");
        int idade = scanner.nextInt();
        System.out.println ("Digite seu peso");
        double peso = scanner.nextDouble();

        System.out.println(String.format("Me chamo %s, tenho %d anos e peso %f quilos" ,nome,idade,peso));
        //libera a memória, deixa o programa mais leve. O Scanner é pesado
        scanner.close();
    }
}