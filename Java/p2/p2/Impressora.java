public class Impressora {
    
    public void exibir (Double s1) {
        System.out.printf("%.2f\n", s1);
    }

    public void exibir (Double s1, Double s2) {
        System.out.printf("%.2f & %.2f\n", s1, s2);
    }

    public void exibir (Double s1, String s2) {
        System.out.printf("%.2f & %s\n", s1, s2);
    }

    public void exibir (String s1, Double s2) {
        System.out.printf("%s & %.2f\n", s1, s2);
    }

    public void exibir (String s1, String s2, String s3) {
        System.out.printf("%s & %s & %s\n", s1, s2, s3);
    }

    public void exibir (Integer s1, Integer s2, String s3) {
        System.out.printf("%d & %d & %s", s1, s2, s3);
    }
    public static void main(String[] args) {
        Impressora jooj = new Impressora();
        jooj.exibir(6.9);
        jooj.exibir(6.9, 420.00);
        jooj.exibir(9.6, "jotaro");
        jooj.exibir("Melil", 6.25);
        jooj.exibir("Só ", "Anime ", "Foda");
        jooj.exibir(0, 0, "7");
    }
}
