import java.io.IOException;
import java.util.Scanner;
 
public class Ex1035 {
 
    public static void main(String[] args) throws IOException {

        int A, B, C, D;

        Scanner ler = new Scanner(System.in);

        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();
        D = ler.nextInt();


    
        if (B > C && D > A && (C + D)  >  (A + B) && C >= 0 && D >= 0) {

            System.out.printf("Valores aceitos\n");
        } 
        else {

            System.out.printf("Valores nao aceitos\n");
        }
    }
 
}