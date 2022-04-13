import java.util.Scanner;
public class Reajuste {
    public static void main(String[] args) {
        Scanner messi = new Scanner(System.in);
        System.out.print("Digite o salario mesal atual e o"+
        " numero flutuante que corresponde a porcentagem de reajuste." +
        " Um dado para cada linha:\nR$ ");
        double sal = messi.nextDouble();
        double perc = messi.nextDouble();
        double reaj = sal * (1 + perc);
        System.out.println(String.format
        ("O novo salario mensal eh igual a R$ %.2f", reaj));
        messi.close();
    }
}
