import javax.swing.JOptionPane;

public class quadradonumero {
    public static void main (String [] args) {
        double numero1;
        double numero2;
        double numero3;
        double numero4;
        double resultado;
        numero1 = Double.parseDouble (JOptionPane.showInputDialog("Insira um numero"));
        numero2 = Double.parseDouble (JOptionPane.showInputDialog("Insira um numero"));
        numero3 = Double.parseDouble (JOptionPane.showInputDialog("Insira um numero"));
        numero4 = Double.parseDouble (JOptionPane.showInputDialog("Insira um numero"));
        resultado = numero1 * 2 + numero2 * 2 + numero3 * 2 + numero4 * 2;
        JOptionPane.showMessageDialog(null, "O quadrado desses numeros e " + resultado);
    }