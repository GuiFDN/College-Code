import javax.swing.JOptionPane;

public class Ex05{

    public static void main (String [] args) {

        int valor, notas200, resto1, notas100, resto2, notas50, resto3, notas20, resto4, notas10, resto5, notas5, resto6, notas2, resto7, notas1;
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor total: "));

        notas200 = valor / 200;
        resto1 = valor % 200;
        
        notas100 = resto1 / 100;
        resto2 = resto1 % 100;
       
        notas50 = resto2 / 50;
        resto3 = resto2 % 50;
       
        notas20 = resto3 / 20;
        resto4 = resto3 % 20;
        
        notas10 = resto4 / 10;
        resto5 = resto4 % 10;
        
        notas5 = resto5 / 5;
        resto6 = resto5 % 5;
        
        notas2 = resto6 /2;
        resto7 = resto6 % 2;

        notas1 = resto7 /1;

        JOptionPane.showMessageDialog(null, notas200 + " notas de 200 \n" + notas100 + " notas de 100 \n" + notas50 + " notas de 50 \n" + notas20 + " notas de 20 \n" + notas10 + " notas de 10 \n" + notas5 + " notas de 5 \n" + notas2+ " notas de 2 \n" + notas1 + " notas de 1 \n");
    }
}