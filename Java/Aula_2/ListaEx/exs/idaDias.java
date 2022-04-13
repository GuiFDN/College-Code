import java.util.Scanner;
public class idaDias {
    public static void main(String[] args) {
        Scanner messi = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = messi.nextInt();
        int idaDias = idade * 365;
        System.out.println(String.format
        ("A sua idade em dias eh igual a %d", idaDias));
        messi.close();
    }
}
