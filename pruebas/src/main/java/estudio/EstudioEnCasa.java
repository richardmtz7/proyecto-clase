package estudio;

import javax.swing.JOptionPane;

public class EstudioEnCasa {
	
	
	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"introduce valor", 0)); 
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"introduce valor", 0)); 
		int resultado= numero1+numero2;
		JOptionPane.showMessageDialog(null, resultado);
	}

}
