import javax.swing.JOptionPane;

public class TesteSobrecarga {
    class Calculadora;
    public static void main (String args []) {
        Calculadora c = new Calculadora();
        System.out.println ("soma de 2 inteiros: " + c.soma (2, 3));
        System.out.println ("soma de 3 inteiros: " + c.soma (1, 2, 3));
        System.out.println ("soma de 2 reais: " + c.soma (2.4, 5.7));

        String numeroA = JOptionPane.showInputDialog ("digite o primeiro numero: ");
        String numeroB = JOptionPane.showInputDialog ("digite o segundo numero: ");

        JOptionPane.showMessageDialog (null, "soma das strings: " + String.format ("%.2f", c.soma (numeroA, numeroB)));
    }
}