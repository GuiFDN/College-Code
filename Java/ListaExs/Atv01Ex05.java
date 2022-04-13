import javax.swing.JOptionPane;

public class Atv01Ex05 {
    public static void main(String[] edu) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int p200 = n / 200;
        int n200 = n - p200 * 200;
        int p100 = n200 / 100;
        int n100 = n200 - p100 * 100;
        int p50 = n100 / 50;
        int n50 = n100 - p50 * 50;
        int p20 = n50 / 20;
        int n20 = n50 - p20 * 20;
        int p10 = n20 / 10;
        int n10 = n20 - p10 * 10;
        int p5 = n10 / 5;
        int n5 = n10 - p5 * 5;
        int p2 = n5 / 2;
        int n2 = n5 - p2 * 2;
        int p1 = n2 / 1;
        int total = p200 + p100 + p50 + p20 + p10 + p5 + p2 + p1;

        System.out.println("200: " + p200);
        System.out.println("100: " + p100);
        System.out.println("50:  " + p50);
        System.out.println("20:  " + p20);
        System.out.println("10:  " + p10);
        System.out.println("5:   " + p5);
        System.out.println("2:   " + p2);
        System.out.println("1:   " + p1);
        System.out.println("Total de notas: " + total);

    }
}