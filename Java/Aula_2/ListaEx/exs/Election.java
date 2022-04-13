import java.util.Scanner;
public class Election {
    public static void main(String[] args) {
        Scanner messi = new Scanner(System.in);
        System.out.println
        ("Digite o total de eleitores, os votos brancos, nulos e validos.\nCada dado em uma linha.");
        int eleitores = messi.nextInt();
        int mrWhite = messi.nextInt();
        int nullos = messi.nextInt();
        int oks = messi.nextInt();
        double perMrWhite = (100 * mrWhite) / eleitores;
        double perNullos = (100 * nullos) / eleitores;
        double perOks = (100 * oks) / eleitores;
        System.out.println(String.format
        ("Percentual de votos brancos: %.2f", perMrWhite));
        System.out.println(String.format
        ("Percentual de votos nulos: %.2f", perNullos));
        System.out.println(String.format
        ("Percentual de votos validos: %.2f", perOks));
        messi.close();
    }
}
