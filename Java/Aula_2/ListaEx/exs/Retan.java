import java.util.Scanner;
public class Retan {
    public static void main(String[] args) {
        Scanner messi = new Scanner(System.in);
        System.out.print("Digite a altura do retangulo: ");
        int altura = messi.nextInt();
        System.out.print("Digite o comprimento do retangulo: ");
        int comp = messi.nextInt();
        int area = altura * comp;
        System.out.println(String.format
        ("Com a altura %d e o comprimento %d, a area eh igual a %d",
        altura, comp, area));
        messi.close();
    }
}
