import java.util.Scanner;

public class testePonto {
    public static void main(String[] args) {
        Scanner messi = new Scanner(System.in);
        Ponto p1 = new Ponto(2, 9);
        Ponto p2 = new Ponto();
        p2.setX(3);
        p2.setY(10);
        System.out.printf("P1 %.1f, %.1f | P2 %.1f, %.1f\n", p1.getX(), p1.getY(), p2.getX(), p2.getY());

        System.out.print("Digite o deslocamento para as cordenadas x e y: ");
        double t1 = messi.nextDouble();
        double t2 = messi.nextDouble(); // 5.0 6.0
        p1.desloca(t1, t2);
        p2.desloca(t1, t2);
        System.out.printf("p1 deslocado: %.1f, %.1f\np2 deslocado: %.1f, %.1f", p1.getX(), p1.getY(),
        p2.getX(), p2.getY());
        
        messi.close();
    }
}