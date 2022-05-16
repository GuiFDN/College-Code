class CalCientifica {
    private int a;
    private int b;

    public CalCientifica () {}
    public CalCientifica (int a, int b) {
        this.a = a;
        this.b = b;
    }
    

    double raiz (int a) {
        return (int) Math.sqrt (a);
    }

    double raiz (double a) {
        return (double) Math.sqrt(a);
    }

    double raiz (String a) {
        return Math.sqrt (Double.parseDouble (a));
    }

    // potencia
    double potencia (byte a, byte b) {
        return Math.pow (a, b);
    }
    
    double potencia (String a, String b) {
        return Math.pow (Double.parseDouble (a), Double.parseDouble(b));

    }

}

// lastclass

class Lct {
    public static void main (String [] args) {
        CalCientifica c1 = new CalCientifica ();
        Scanner Montana = new Scanner (System.in);

        // raizes métodos r

        System.out.print ("\nTestando metodos de raiz.\n");
        
        System.out.print ("\n Digite um numero inteiros: ");
        int a = s.nextint ();
        System.out.print ("Raiz de %d e igual a %2f\n", a, c1.raiz(a));

        // double

        System.out.print ("\nDigite um numero flutuante: ");
        Double b = s.nextDouble();
        System.out.print ("Raiz de %d e igual a %2f\n", a, c1.raiz(b));

        // String
        System.out.print ("\nDigite um numero: ");
        String c = s.nextDouble();
        System.out.print ("Raiz de %d e igual a %2f\n", a, c1.raiz(c));

        // Métodos P
        System.out.print ("\nTeste de metodos de raiz.\n");

        System.out.print ("\nDigite um numero: ");
        Byte d = s.nextByte ();
        Btye e = s.nextByte ();
        System.out.printf ("Potencia de" + d + "elevado a" + e + "e igual a a %2f\n", f,g,c1.potencia (f,g));

        // String
        System.out.print ("\nDigite dois numeros: ");
        String f = Montana.next();
        String g = Montana.next ();
        System.out.print ("Potencia de %d elevado a %.2f\n", h, i, c1.potencia (h, i));

        // int a double b
        System.out.print ("\Digite um numero inteiro e um flutuante: ");

    }
}