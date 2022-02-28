package estudio;

import javax.swing.JOptionPane;

public class If {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Ingrese su edad");
		int edad = Integer.parseInt(input);
		if(edad>=18) {
			JOptionPane.showMessageDialog(null,"Mayor de edad");
			
		}else {
			JOptionPane.showMessageDialog(null, "No es mayor de edad");
		}
		
	}

}
