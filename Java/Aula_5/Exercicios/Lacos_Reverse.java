public class Lacos_Reverse {
    public static void main (String [] args) {
        System.out.println ("100 primeiros naturais usando for:");
        for (int i=100; i >= 0; i--) {
            System.out.print (i + " ");
        }
        System.out.println ("\n100 primeiros naturais usando while");
        int i=100;
        while (i>=0) {
            System.out.print (i + " ");
            i--;
        }
        System.out.println ("\n100 primeiros naturais usando do-while");
        i=100;
        do {
            System.out.print (i + " ");
            i--;
        } while(i >= 0);
    }
}