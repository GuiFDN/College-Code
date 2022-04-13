import javax.swing.JOptionPane;

public class eleitores {
    public static void main (String args []) {
        double eleitores, brancos, nulos, validos;
        double percBrancos, percNulos, percValidos;
       
        eleitores = Double.parseDouble (JOptionPane.showInputDialog ("Insira o total de eleitores"));
        brancos = Double.parseDouble (JOptionPane.showInputDialog ("Insira o total de votos brancos"));
        nulos = Double.parseDouble (JOptionPane.showInputDialog ("Insira o total de votos nulos"));
        validos = Double.parseDouble (JOptionPane.showInputDialog ("Insira o total de votos validos"));
        
        percValidos = ((double)validos / eleitores) * 100;
        percBrancos = ((double) brancos / eleitores) * 100;
        percNulos = ((double) nulos/ eleitores) * 100;

       Double.parseDouble (JOptionPane.showMessageDialog(null, percValidos, percBrancos, percNulos));

    }
}