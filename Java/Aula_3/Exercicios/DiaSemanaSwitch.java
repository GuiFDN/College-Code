import javax.swing.JOptionPane;

public class DiaSemanaSwitch {
    public static void main (String args []){
        int intDia;
        //String é classe
        String strDia;
        //JOptionPane sempre devolve uma String
        strDia = JOptionPane.showInputDialog (null, "Digite um valor de 1 a 7");
        //Transforma essa String em inteiro, classe Integer, classe JOptionPane
        intDia = Integer.parseInt (strDia);
       
        switch (intDia) {
            case 1:
               JOptionPane.showMessageDialog(null, "Domingo", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);
               
               break;
            case 2:
               JOptionPane.showMessageDialog(null, "Segunda", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);
               
               break;
            case 3:
               JOptionPane.showMessageDialog(null, "Terca", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);
               
               break;
            case 4:
               JOptionPane.showMessageDialog(null, "Quarta", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);
               
               break;
            case 5:
               JOptionPane.showMessageDialog(null, "Quinta", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);
               
               break;
            case 6:
               JOptionPane.showMessageDialog(null, "Sexta", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);
               
               break;
            case 7:
               JOptionPane.showMessageDialog(null, "Sabado", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);
               
               break;
             default:
               JOptionPane.showMessageDialog(null, "A semana tem somente 7dias", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}