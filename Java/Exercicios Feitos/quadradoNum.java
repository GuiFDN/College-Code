import javax.swing.JOptionPane;

public class quadradonum {
    public static void main (String args []) {
    double num1, num2, num3, num4;
    double quadrado;

    num1 = Double.parseDouble(JOptionPane.showInputDialog ("Insira um numero"));
    num2 = Double.parseDouble(JOptionPane.showInputDialog ("Insira um numero"));
    num3 = Double.parseDouble(JOptionPane.showInputDialog ("Insira um numero"));
    num4 = Double.parseDouble(JOptionPane.showInputDialog ("Insira um numero"));

    quadrado = (num1 * num1) + (num2 * num2) + (num3 + num3) + (num4 * num4);
    System.out.println (quadrado);
    }
}