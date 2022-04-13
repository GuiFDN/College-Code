import javax.swing.JOptionPane;

public class dolar {
    public static void main (String [] args) {
        double cotacaodolar;
        double quantdolar;
        double resultado;
        cotacaodolar = Double.parseDouble (JOptionPane.showInputDialog("Insira a cotacao de dolar atual"));
        quantdolar = Double.parseDouble (JOptionPane.showInputDialog("Insira a quantidade de dolar que voce tem"));
        resultado = cotacaodolar * quantdolar;
        JOptionPane.showMessageDialog(null, "Com a cotacao atual, voce tera " + resultado + " reais ao converter os dolares");

    }
}