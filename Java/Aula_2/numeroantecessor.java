import javax.swing.JOptionPane;

public class numeroantecessor {
    public static void main (String args []) {
        double numero;
        double resultado;
        numero = Double.parseDouble (JOptionPane.showInputDialog("Insira um numero inteiro"));
        resultado = numero - 1;
        JOptionPane.showMessageDialog (null, "O antecessor de " + numero + " e " + resultado);

    }
}