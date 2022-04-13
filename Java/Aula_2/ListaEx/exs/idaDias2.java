import java.util.Scanner;
public class idaDias2 {
    public static void main(String[] args) {
        Scanner messi = new Scanner(System.in);
        System.out.print
        ("Digite a sua idade em anos, meses e dias. Um atributo para cada linha:\n");
        int anos = messi.nextInt();
        int meses = messi.nextInt();
        int dias = messi.nextInt();
        int anoDia = anos * 365;
        int mesDia = meses * 30;
        int idade = anoDia + mesDia + dias;
        System.out.println(String.format
        ("A sua idade em dias eh igual a %d", idade));
        messi.close();
    }
}
