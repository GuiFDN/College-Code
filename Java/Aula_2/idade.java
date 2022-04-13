import javax.swing.JOptionPane;

public class idade {
    public static void main (String args []) {
        double idade;
        double resultado;
        idade = Double.parseDouble (JOptionPane.showInputDialog("Insira a sua idade em anos"));
        resultado = idade * 365;
        JOptionPane.showMessageDialog (null, "A sua idade em dias " + resultado);

    }
}