import javax.swing.JOptionPane;

public class TesteIf {
    public static void main (String args []) {
        double nota;
        nota = Double.parseDouble (JOptionPane.showInputDialog ("Digite a nota"));
        
        if (nota >= 90) {
            JOptionPane.showMessageDialog (null, "Parabens");
            JOptionPane.showMessageDialog (null, "Conceito A");
        }
        else if (nota >=80) {
            JOptionPane.showMessageDialog (null, "B");
        }
        else if (nota >= 70) {
            JOptionPane.showMessageDialog (null, "C");
        }
        else {
            JOptionPane.showMessageDialog (null, "estudar mais");
        }
}