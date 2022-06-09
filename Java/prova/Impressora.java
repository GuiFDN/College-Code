public class Impressora {

    public void exibir (double d) {
        System.out.printf ("%.2f\n", d);
    }
    public void exibir (double d, double e) {
        System.out.printf ("%.2f\n", d, e);
    }

    public void exibir (double a, String s1) {
        System.out.printf ("%.2f, %s\n", a, s1);
    }
        
    public void exibir (String s1, double a) {
        System.out.printf ("%s, %.2f\n",a, s1);
        
    }
    public void exibir (String s1, String s2, String s3) {
        System.out.printf ("%s, %s, %s\n", s1, s2, s3);
    }
    public void exibir (int a, int b, String s1) {
        System.out.printf ("%d, %d, %s\n", a, b, s1);
        
    }

        public static void main (String [] args) {

            Impressora print = new Impressora();

            print.exibir (2.0);
            print.exibir (6.9, 420.00);
            print.exibir (1.4, "Montana");
            print.exibir ("Montana", 1.4);;
            print.exibir ("Chevrolet", "Montana", "Sport");
            print.exibir (1, 4, "Montana");
        }
    }