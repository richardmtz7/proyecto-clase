package capitulo3;

import java.util.Scanner;

public class RaizCuadrada {
	
	
	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		double num = teclado.nextDouble();
		
		if(num >= 0) {
			System.out.println("La raiz cuadra de " + num + " es:" + Math.sqrt(num));
			
		}else {
			System.out.println("Para calcular la raiz de un numero, este debe ser positivo");
		}
	}
	
}
