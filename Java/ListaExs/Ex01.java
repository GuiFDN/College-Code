import javax.swing.*;

public class Ex01{

 public static void main(String[] args) {
 	//Calculando a distância entre dois pontos

 	double x1, x2, y1, y2, calc;

 	JOptionPane.showMessageDialog(null, "Bem vindo, este aplicativo vai calcular a distancia entre dois pontos baseando se em\n\n Ponto 1 : (x1, y1)\n Ponto 2 : (x2, y2)");

 	x1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de X1\n\n"));
 	x2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de X2\n\n"));
 	y1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de Y1\n\n"));
 	y2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de Y2\n\n"));

 	calc = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

 	JOptionPane.showMessageDialog(null, "A distancia entre os pontos" +"\n\n   Ponto 1 : (" + String.format("%.2f",x1) + ") (" + String.format("%.2f",y1) + ")\n   Ponto 2 : (" + String.format("%.2f",x2) + ") (" + String.format("%.2f",y2) + ")\n\n A Distancia eh de : \n" + String.format("%.2f",calc));

 }

}