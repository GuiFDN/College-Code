import javax.swing.JOptionPane;
public class Fatorial {
    public static void main (String [] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog ("Digite o n"));
        int mult = 1;
        for (int i=2;  i <= n; i++) {
            mult *= i;
            //mult *= i; pode ficar depois de mult = 1;, tudo em uma linha de código

        }
        JOptionPane.showMessageDialog (null, "fatorial de " + n + " = " + mult, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }   
}
//se é divisor, verificar resto :|.