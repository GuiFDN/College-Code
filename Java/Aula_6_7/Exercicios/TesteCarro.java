import javax.swing.JOptionPane;

public class TesteCarro {
    public static void main (String [] args) {
        Carro c1 = new Carro("ABC1234");
       // System.out.println ("Carro 1:\nplaca: " + c1.getPlaca() + "\nmodelo: "  + c1.getModelo() + "\nano: " + c1.getAnoFabricacao());

        String modelo = JOptionPane.showInputDialog("Digite o modelo");
        c1.setModelo(modelo);

        int anoFabricacao = Integer.parseInt (JOptionPane.showInputDialog("Digite o ano de fabricacao"));
        c1.setAnoFabricacao(anoFabricacao);
        System.out.println ("Carro 1 com as novas informacoes: \nplaca: " + c1.getPlaca () + "\nmodelo" + c1.getModelo () + "\nano: " + c1.getAnoFabricacao());
        
        //Carro c2 = new Carro();
        //System.out.println ("Carro 2 com construtor padrao: \nplaca " + c2.getPlaca() + "\nmodelo" + c2.getModelo() + "\nAnoFabricacao" + c2.getAnoFabricacao());

        String placa = JOptionPane.showInputDialog("Digite a placa do carro novo");

        modelo = JOptionPane.showInputDialog ("Digite o modelo do carro novo");

        anoFabricacao = Integer.parseInt (JOptionPane.showInputDialog("Digite o ano do carro novo"));

        Carro carroNovo = new Carro(placa, modelo, anoFabricacao);
        System.out.println ("Carro novo com as seguintes informacoes: \nplaca: " + carroNovo.getPlaca () + "\nmodelo" + carroNovo.getModelo () + "\nano: " + carroNovo.getAnoFabricacao());        
    }
    
}