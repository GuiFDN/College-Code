import javax.swing.JOptionPane;

public class SomaDoisNumeros{
    public static void main (String [] args) {
        //definição das variáveis e seus nomes
        
        double primeiroValor;
        double segundoValor;
        double resultado;
        // Aqui o usuário vai inserir os números que ele quer calcular
        
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog ("Digite o segundo valor"));
        
        //A variável resultado irá conter o resultado da operação 
        
        resultado = primeiroValor + segundoValor;
         //Aqui aparecera um popup mostrando o resultado da conta
        
         JOptionPane.showMessageDialog (null, "O resultado da soma de " + primeiroValor + " + " + segundoValor + " e " + resultado);
    }
}