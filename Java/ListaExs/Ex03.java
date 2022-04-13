import javax.swing.JOptionPane;

public class Ex03 {
    public static void main (String args []) {
        double notaA, notaB, notaC,pesototal, media;
        
        notaA = Double.parseDouble (JOptionPane.showInputDialog ("Digite a nota A"));
        notaB = Double.parseDouble (JOptionPane.showInputDialog ("Digite a nota B"));
        notaC = Double.parseDouble (JOptionPane.showInputDialog ("Digite a nota C"));
        pesototal = (notaA * 2) + (notaB * 3) + (notaC * 5);
        media = pesototal / 10;
        
        JOptionPane.showMessageDialog (null , "A nota com peso e: " + media);
    }
}
