import javax.swing.JOptionPane;
public class PodeDirigirTernario {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos vocêm tem?"));
        
        String podeDirigir;
        
        podeDirigir = idade >= 18 ? "Sim, você pode dirigir" : "Não, você não pode dirigir por enquanto";
        JOptionPane.showMessageDialog(null, podeDirigir);
     }
}
