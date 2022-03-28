package capitulo3;

import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("INGRESE UN NUMERO");
		
		double num = teclado.nextDouble();
		
		if(num > 0) {
			System.out.println("El numero es positivo");
			
			
		}
		if(num < 0) {
			System.out.println("El numero es negativo");
		}else {
			System.out.println("El numero es cero");
		}
		
	}

}
