//-----------------------------------------------FirstClassCalcula(FCC)

import java.until.Scanner;

class Fcc{

    private int a;
    private int b;

    public Fcc() {}
    public Fcc(int a,int b){
        this.a = a;
        this.b = b;
    }
    
    //-----------------------------------------------Raízes
    double raiz(int a){
        return(int) Math.sqrt(a);
    }

    double raiz(double a){
        return(double) Math.sqrt(a)
    }

    double raiz(String a){
        return Math.sqrt(Double.parseDouble(a));
    }

    //-----------------------------------------------Potência
    double potencia(byte a, byte b){
        return Math.pow(a , b);
    }

    double potencia(int a,int b){
        return Math.pow((int)a, b);
    }

    double potencia(String a,Stirng b){
        return Math.pow(Double.parseDouble(a), Double.parseDouble(b));
    }
}

//-----------------------------------------------LastClassTest(LCT)

class Lct{
    public static void main(String[] args){
        CalculaCient c1 = new CalculaCient();
        Scanner s = new Scanner(System.in);
        //---------------------------------------MétodosR
        System.out.print("\nTestando metodos de raiz.\n");
        
        System.out.print("\nDigite um numero inteiro: ");
        int a = s.nextInt();
        System.out.print("Raiz de %d e igual a %.2f\n", a, c1.raiz(a));

        //---------------------------------------Double
        System.out.print("\nDigite um numero flutuante: ");
        Double b = s.nextDouble();
        System.out.print("Raiz de %.2f eh igual a %.2f\n", b, C1.raiz(b))

        //---------------------------------------String
        System.out.print("\nDigite um numero: ");
        String c = s.nextDouble();
        System.out.print("Raiz de %s eh igual a %.2f\n", c, c1.raiz(c))

        //--------------------------------------MétodosP
        System.out.print("\nTeste de metodos de raiz.\n");
        
        System.out.print("\nDigite dois numeros: ");
        Byte d = s.nextByte();
        Byte e = s.nextByte();
        System.out.print("Potencia de" + d + "elevado a" + e + "e igual a %2f\n", f,g,c1.potencia(f,g));

        //--------------------------------------String
        System.out.print("\nDigite dois numeros: ");
        String f = s.next();
        String g = s.next();
        System.out.print("Potencia de %d elevado a %.2f\n", h, i, c1.potencia(h, i));

        s.close();
    }
}