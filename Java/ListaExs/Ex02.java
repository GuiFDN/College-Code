import javax.swing.*;

public class Ex02{


	public static void main(String[] args) {
		double raio, pi, area;

		pi = Math.PI;
		raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Determine o raio do seu circulo"));

		area = pi * Math.pow((raio),2);

		JOptionPane.showMessageDialog(null,"A Area do seu circulo eh: \n\n" + String.format("%.2f",area));

	}


}