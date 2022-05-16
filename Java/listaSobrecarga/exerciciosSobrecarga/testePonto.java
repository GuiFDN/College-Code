import java.util.Scanner;

public class testePonto {

    public static void main (String [] args) {

        Scanner Montana = new Scanner (System.in);

        Ponto p1 = new Ponto (3, 8);
        Ponto p2 = new Ponto ();

        p2.setX (2);
        p2.setY (7);

        System.out.printf("Ponto 1 %.2f, %.2f | Ponto 2 %.2f, %.2f\n", p1.getX(), p1.getY(), p2.getX(), p2.getY());

        System.out.print("Digite o deslocamento para as cordenadas x e y: ");
        
        double t1 = Montana.nextDouble();
        double t2 = Montana.nextDouble();
        
        p1.desloca(t1, t2);
        
        p2.desloca(t1, t2);
        System.out.printf("Ponto 1 deslocado: %.2f, %.2f\nPonto 2 deslocado: %.2f, %.2f", p1.getX(), p1.getY(),p2.getX(), p2.getY());
        
        Montana.close();
    }
}