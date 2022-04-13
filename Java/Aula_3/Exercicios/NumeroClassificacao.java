import javax.swing.JOptionPane;

public class NumeroClassificacao {
    public static void main (String args []) {
        int num;
        num = Integer.parseInt (JOptionPane.showInputDialog ("Digite um numero"));
        
        if (num >= 1) {
             JOptionPane.showMessageDialog (null, "Esse numero e positivo");
        }
        else if (num == 0) {
             JOptionPane.showMessageDialog (null, "Esse numero e neutro");
        }
        else if (num <= -1) {
             JOptionPane.showMessageDialog (null, "Esse numero e negativo");

        }
    }
}