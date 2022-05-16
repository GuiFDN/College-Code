class Teste {

    public static void main (String [] args) {

        CalCientifica C1 = newCalCientifica ();
        Scanner Montana = new Scanner (System.in);

        // Métodos de Raíz

        System.out.print ("\nTestando os metodos de raiz.\n");

        // Raiz com Parâmetro int

        System.out.print ("\nDigite um numero inteiro: ");
        int a = Montana.nextInt ();
        System.out.print ("Raiz de %d e igual a %.1\n", a, C1.raiz (a));

        // Raiz com Parâmetro Double

        System.out.print ("\nDigite um numero: ");
        Double b = Montana.next();
        System.out.print ("Raiz de %s e igual a %.1f\n", b, C1.raiz (b));

        // Raiz com Parâmetro String

        System.out.print ("\nDigite um numero: ");
        String c = Montana.next();
        System.out.print ("Raiz de %s e igual a %.1f\n", c, C1.raiz (c));

        // Métodos de potência

        System.out.print("\nTestando os metodos de potencia.\n");

        // Potência com Byte

        System.out.print("\nDigite dois numeros: ");
        Byte d = Montana.nextByte(); 
        Byte e = Montana.nextByte();

        System.out.printf("Potencia de " + d + " elevado a " + e + " e igual a %.1f\n", C1.potencia(d, e));

        // Potência com String

        System.out.print("\nDigite dois numeros: ");
        String f = Montana.next();
        String g = Montana.next();
        System.out.printf("Potencia de %s elevado a %s ehigual a %.1f\n", f, g, C1.potencia(f, g));
        
        //Potência com parâmetros Int A e Double B
        
        System.out.print("\nDigite um numero inteiro e um flutuante: ");
        int h = Montana.nextInt();
        Double i = Montana.nextDouble(); 
        System.out.print("Potencia de %d elevado a %.1f eh igual a %.1f\n", h, i, C1.potencia(h, i));

        Montana.close();
    }
}