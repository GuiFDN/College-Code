import javax.swing.JOptionPane;

public class Ex_1 {
    public static void main (String [] args) {

        String nome = "nome";

        nome = JOptionPane.showInputDialog(null, "Digite o seu nome e sobrenome");
        String [] BananaSplit = nome.split("\\s+");

        JOptionPane.showMessageDialog(null, "Seu nome e " + BananaSplit[0] + " e seu sobrenome e " + BananaSplit[1]);
    }
}
