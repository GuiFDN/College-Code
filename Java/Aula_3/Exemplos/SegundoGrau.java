import javax.swing.JOptionPane;

public class SegundoGrau {
    public static void main (String args []) {
    //variaveis
    double a, b, c; //coeficiente da equação
    double delta; //determinantes
    double x1, x2; //raízes
    //entrada de dados
    a = Double.parseDouble (JOptionPane.showInputDialog("Digite o coeficiente a"));
    b = Double.parseDouble (JOptionPane.showInputDialog ("Digite o coeficiente b"));
    c = Double.parseDouble (JOptionPane.showInputDialog ("Digite o coeficiente c"));

    if (a != 0) {
        delta = b*b - 4 * a * c;
        if (delta >= 0) {

        }
        else {
            JOptionPane.showMessageDialog (null, "Nao e raiz real");
        }
    }
    else {
        JOptionPane.showMessageDialog (null, "Nao e equacao do 2o grau");
        
    }
    if (b >= 0) {

    }
    else {

    }

    }

}
