import javax.swing.JOptionPane;

public class Ex_2 {
    public static void main (String args []) {

        String senha = JOptionPane.showInputDialog ("Digite uma senha");
        
        if (senha.length() == 4) {
            if (senha.charAt(0)== 'a' || senha.charAt(0) == 'A') {
                //é impar é false, continuar varrendo a senha até achar impar
                boolean contemImpar= false;
                for (int posicao = 1; posicao < senha.length() && !contemImpar; posicao++) {
                    //extrair numero
                    int numero = Integer.parseInt(senha.substring (posicao,posicao+1));
                    if (numero % 2 == 1) {
                        contemImpar = true;
                    }

                }
                if (contemImpar) {
                    JOptionPane.showMessageDialog (null, "Bem-vindo", "Senha valida", JOptionPane.INFORMATION_MESSAGE);

                }
                else {
                    JOptionPane.showMessageDialog (null, "Nao ha numeros impares", "senha invalida", JOptionPane.WARNING_MESSAGE);

                }
            }
            else {
                JOptionPane.showMessageDialog (null,"Senha nao inicia com a/A", "senha invalida", JOptionPane.WARNING_MESSAGE);

            }
        }
        else {
            JOptionPane.showMessageDialog (null, "Tamanho nao e 4", "Senha invalida", JOptionPane.WARNING_MESSAGE);
        }
    }
}