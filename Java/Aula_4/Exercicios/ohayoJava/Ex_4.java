import javax.swing.JOptionPane;

//Escreva um programa que lê uma string composta por duas palavras separadas por um
//espaço em branco. Seu programa deve exibir o comprimento de cada palavra.

public class Ex_4 {
    public static void main (String [] args) {

        String s1, s2;

        s1 = JOptionPane.showInputDialog ("Digite uma palavra");
        s2 = JOptionPane.showInputDialog ("Digite uma outra palavra");

        int comprimento1 = s1.length();
        int comprimento2 = s2.length();
        JOptionPane.showMessageDialog (null, s1 + " tem " + comprimento1 + " caracteres , " + s2 + " tem " + comprimento2 + " caracteres ");
    }
    
}
