package Aula_8.Calculadora_Aula_Um;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Calculadora c = new Calculadora(); //construtor padrão
		/*
		int x = c.soma(12, 13);
		System.out.println("soma = " + x);
		System.out.println("subtracao = " + c.subtracao(x, 10));
		
		Calculadora s = new Calculadora();
		int j = s.soma(2, c.soma(1, 2));
		*/
		Scanner scanner1 = new Scanner(System.in);
		//Scanner scanner2 = new Scanner(System.in); isso não deveria funcionar
		int opcao;
		do {
		    do {
		        System.out.println ("Digite\n1 - soma\n2 - sutracao\n" + 
		        "3 - multiplicacao\n4 - divisao\n5 - sair");
		        opcao = scanner1.nextInt();
		    } while (opcao < 1 || opcao > 5);
    		if (opcao < 5) {
    		    System.out.println ("digite o primeiro valor");
    		    int a = scanner1.nextInt();
    		    System.out.println ("digite o segundo valor");
    		    int b = scanner1.nextInt();
    		    switch(opcao) {
    		        case 1:
    		            System.out.println("soma = " + c.soma(a, b));
    		            break;
    		        case 2:
    		            System.out.println("subtracao = " + c.subtracao(a, b));
    		            break;
    		        case 3:
    		            System.out.println("multiplicacao = " + c.multiplicacao(a, b));
    		            break;
    		        case 4:
    		            if (b == 0) {
    		                System.out.println("nao existe divisao por zero");
    		            }
    		            else {
    		                System.out.println("divisao = " + c.divisao(a, b));
    		            }
    		            break;
    		    }
    		}
    		else {
    		    System.out.println("Ate breve!");
    		}
	    } while (opcao != 5);
	}
}