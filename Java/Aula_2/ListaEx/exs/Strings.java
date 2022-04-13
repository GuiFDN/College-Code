import javax.swing.JOptionPane;
public class Strings{
    public static void main(String[] args) {
        String teste = "HeLLo, WoooOrlllD";
        String minusculas = teste.toLowerCase();
        String maiusculas = teste.toUpperCase();
        JOptionPane.showMessageDialog(null, String.format ("Maiúsculas: %s\n Minúsculas: %s", maiusculas, minusculas));
 }
}