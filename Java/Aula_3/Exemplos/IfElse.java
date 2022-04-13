import javax.swing.JOptionPane;

public class IfElse {
    public static void main (String args[]){
        //variável
        double nota;
        
        //Inserir nota na variáveç
        nota = Double.parseDouble (JOptionPane.showInputDialog ("Digite a nota"));

        //estrutura if simples
        //se, if é usado como -> "Se nota for maior que 70, aulo é aprovado"
        if (nota >= 70) {
            JOptionPane.showMessageDialog (null, "Aprovado");
        }
            
            //estrutura else
            //se não, se nota for menor que 70, aulo é reprovado
            else {
                JOptionPane.showMessageDialog (null, "Reprovado");
            }
    }
}