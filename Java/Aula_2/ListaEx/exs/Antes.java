package Aula_2.ListaEx.exs;

import java.util.Scanner;
public class Antes {
    public static void main(String[] args) {
        Scanner messi = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num = messi.nextInt();
        int Antes = num - 1;
        System.out.println(String.format
        ("O antecessor de %d eh %d", num, Antes));
        messi.close();
    }
}
