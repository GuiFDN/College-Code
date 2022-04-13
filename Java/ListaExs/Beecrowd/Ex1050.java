import java.io.IOException;
import java.util.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex1050 {
 
    public static void main(String[] args){
 
		//1050
		//beesad

		//use scanner
		
		int DDD;
		Scanner sc = new Scanner(System.in);
		DDD = sc.nextInt();

		//61 - Brasilia
		//71 - Salvador
		//11 - Sao Paulo
		//21 - Rio De Janeiro
		//32 - Juiz de Fora
		//19 - Campinas
		//27 - Vitoria
		//31 - Belo Horizonte

		if(DDD == 61) {
			System.out.println("Brasilia");
		}else if(DDD == 71) {
			System.out.println("Salvador");
		}else if(DDD == 11) {
			System.out.println("Sao Paulo");
		}else if(DDD == 21) {
			System.out.println("Rio de Janeiro");
		}else if(DDD == 32) {
			System.out.println("Juiz de Fora");
		}else if(DDD == 19) {
			System.out.println("Campinas");
		}else if(DDD == 27) {
			System.out.println("Vitoria");
		}else if(DDD == 31) {
			System.out.println("Belo Horizonte");
		}else{
			System.out.println("DDD nao cadastrado");
		}
 
    }
 
}