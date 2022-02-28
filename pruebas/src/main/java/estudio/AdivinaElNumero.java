package estudio;

import java.util.Random;

import javax.swing.JOptionPane;

public class AdivinaElNumero {

	public static void main(String[] args) {
		Random r= new Random();
		int respuesta = r.nextInt(99); //genera un numero del o al 100 porque random comienza en cero
		int i=0;
		int adivinador = input("Adivina el numero del 0 al 100");
		while(respuesta!=adivinador) {
			i++; 
			if(adivinador<respuesta) {
				adivinador=input("El numero es mas grande, intente nuevamente");
			}else {
				adivinador=input("El numero es mas pequeño, intente nuevamente");
			}
		}
		JOptionPane.showMessageDialog(null, "Felicitaciones adivinaste con " + i + " intentos fallidos");

	}

	private static int input(String text) {
		return Integer.parseInt(JOptionPane.showInputDialog(text));
	}

}
