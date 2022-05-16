import java.util.Scanner;

public class TestePonto {
    public static void main (String [] args) {
        Scanner printer = new Scanner (System.in);

        //a
        Ponto p1 = new Ponto (0, 0);

        //b
        Ponto p2 = new Ponto ();
        p2.setX (3);
        p2.setY (10);
        System.out.printf("P1 %.1f, %.1f | P2 %.1f, %.1f\n", p1.getX(), p1.getY(), p2.getX(), p2.getY());


        Scanner printer = new Scanner (System.in);
        System.out.printf ("%f | %f", p1, p2);
        
        Ponto p4 = new Ponto ();
        System.out.print ("Digite o valor de x");
        p4.setX (Double.parseDouble (sc.NextLine()));
        System.out.print ("Digite o valor de y");
        p4.setY (Double.parseDouble (sc.nextline()));

        System.out.println ("b\nPonto: 1" + p4.toString());

        System.out.print ("Digite o valor para o deslocamento de x");
        desX = Double.parseDouble (sc.nextLine());
        System.out.print ("Digite o valor para o deslocamento de y:");
        desY = Double.parseDouble (sc.nextLine());

        p4.desloca (desX, desY);
        System.out.println ("Ponto deslocado: " = p4.toString());
    }
}