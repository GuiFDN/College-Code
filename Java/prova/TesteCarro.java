import javax.swing.JOptionPane;

public class TesteCarro {
    public static void main (String [] args) {

        Carros carro1 = new Carros(); {
        
        String Modelo = JOptionPane.showInputDialog("Digite o modelo do veiculo");
        String Cor = JOptionPane.showInputDialog("Digite a cor do veiculo");
        int opcao = Integer.parseInt (JOptionPane.showInputDialog("1-ligar carro\n2-desligar carro"));

        carro1.setModelo(Modelo);
        carro1.setCor(Cor);
        carro1.exibirMensagen();
        

        if (opcao == 1) {
            carro1.ligar();
        }
        else {
            carro1.desligar();
        }

        }

        Carros carro2 = new Carros(); {
        
        String Modelo = JOptionPane.showInputDialog("Digite o modelo do veiculo");
        String Cor = JOptionPane.showInputDialog("Digite a cor do veiculo");

        carro2.setModelo(Modelo);
        carro2.setCor(Cor);
        carro2.exibirMensagen();

        carro2.ligar();
        carro2.desligar();
        }
    }
}