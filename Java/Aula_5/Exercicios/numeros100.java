public class numeros100 {
    public static void main (String [] args) {
        System.out.println ("100 primeiros naturais usando for:");
        for (int i=0; i >= 100; i++) {
            System.out.print (i + " ");
        }
        System.out.println ("\n100 primeiros naturais usando while");
        int i=0;
        while (i<100) {
            System.out.print (i + " ");
            i++;
        }
        System.out.println ("\n100 primeiros naturais usando do-while");
        i=0;
        do {
            System.out.print (i + " ");
            i++;
        } while(i < 100);
    }
}