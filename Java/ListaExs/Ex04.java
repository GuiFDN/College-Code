import javax.swing.JOptionPane;

public class Ex04 {
    public static void main (String args []) {
        int numA, numB, resultado;

        numA = Integer.parseInt (JOptionPane.showInputDialog("Digite um numero inteiro: "));
        numB = Integer.parseInt (JOptionPane.showInputDialog("Digite um numero inteiro: "));
        resultado = numA + numB;
        JOptionPane.showMessageDialog (null , "Soma: " + resultado);

    }
}