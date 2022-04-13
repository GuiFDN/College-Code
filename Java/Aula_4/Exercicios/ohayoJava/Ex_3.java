import javax.swing.JOptionPane;

public class Ex_3 {
    public static void main (String [] args) {
        String str;
        int a, b;

        str = JOptionPane.showInputDialog (null, "Digite uma string");
        a = Integer.parseInt (JOptionPane.showInputDialog (null, "Digite um numero"));
        b = Integer.parseInt (JOptionPane.showInputDialog (null, "Digite um numero"));

        JOptionPane.showMessageDialog (null, str.substring(a, b));
    }
    
}