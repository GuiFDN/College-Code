import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        Scanner messi = new Scanner(System.in);
        
        System.out.print("Informe a cor do carro cueio: ");
        String cor1 = messi.nextLine();
        System.out.print("\nInforme a cor do carro Raul: ");
        String cor2 = messi.nextLine();
        System.out.println("\nInforme o modelo do carro cueio: ");
        String modelo1 = messi.nextLine();
        System.out.println("\nInforme o modelo do carro Raul: ");
        String modelo2 = messi.nextLine();
        
        //String cor1 = "Azul";
        Carro cueio = new Carro(cor1, modelo1);
        Carro Raul = new Carro(cor2, modelo2);

        cueio.exibirModelo(cueio.getModelo());
        cueio.exibirCor(cueio.getCor());

        Raul.exibirModelo(Raul.getModelo());
        Raul.exibirCor(Raul.getCor());

        messi.close();
    }
}
