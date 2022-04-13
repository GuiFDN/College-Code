import java.util.Scanner;
public class SomaQuad {
    public static void main(String[] args) {
        Scanner messi = new Scanner(System.in);
        System.out.print("Digite quatro numeros inteiros:\n");
        int num1 = messi.nextInt();
        int num2 = messi.nextInt();
        int num3 = messi.nextInt();
        int num4 = messi.nextInt();
        int quad1 = num1 * num1 + num2 * num2;
        int quad2 = num3 * num3 + num4 * num4;
        int total = quad1 + quad2;
        System.out.println(String.format
        ("A soma dos quadrados dos quatro numeros\nfoi igual a %d", total));
        messi.close();
    }
}
