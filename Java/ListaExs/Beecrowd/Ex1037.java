import java.io.IOException;
import java.util.Scanner;
 
public class Exercicio1037 {
 
    public static void main(String[] args) throws IOException {
 
      double A;

      Scanner ler = new Scanner(System.in);

      A = ler.nextFloat();

      if (A >= 0 && A <= 25) {

        System.out.printf("Intervalo [0,25]\n");
      }
      else if (A > 25 && A <= 50) {

        System.out.printf("Intervalo (25,50]\n");
      }
      else if (A > 50 && A <= 75) {

        System.out.printf("Intervalo (50,75]\n");
    }
    else if (A > 75 && A <=100) {

        System.out.printf("Intervalo (75,100]\n");
    }
      else {

          System.out.printf("Fora de intervalo\n");
      }

    }
 
}