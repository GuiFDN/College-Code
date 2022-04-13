import java.util.Scanner;
public class CusCarro {
    public static void main(String[] args) {
        Scanner messi = new Scanner(System.in);
        System.out.print("Digite o custo de fabrica, a porcentagem do distribuidor e os impostos." + 
        "Para porcentagens, digite numeros flutuantes:\nR$ ");
        double cusFa = messi.nextDouble();
        double perdistri = messi.nextDouble();
        double perimpostor = messi.nextDouble();
        double distri = cusFa * perdistri;
        double impostor = cusFa * perimpostor;
        double totale = cusFa + distri + impostor;
        System.out.println(String.format
        ("O custo final ao consumidor eh igual a R$ %.2f", totale));
        messi.close();
    }
}
