import java.util.Scanner;
public class Strings1 {
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

        System.out.println(String.format("Me chamo %s, tenho %d anos e peso %.2f quilos" ,nome,idade,peso));
        System.out.println ("Digite a primeira String");
        String s1 = scanner.next();
        System.out.println ("Digite outra");
        String s2 = scanner.nextLine ();
        System.out.println ("Digite mais uma");
        String s3 = scanner.next();

        System.out.println (String.format("s1 = %s\ns2 = %s\ns3 = %s", s1, s2, s3));
        
        //libera a memória, deixa o programa mais leve. O Scanner é pesado
        scanner.close();
    }
}