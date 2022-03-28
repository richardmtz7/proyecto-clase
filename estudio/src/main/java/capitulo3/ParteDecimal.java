package capitulo3;

import java.util.Scanner;

public class ParteDecimal {
	
	/*
	 * Averiguar si un número real introducido por teclado tiene o no parte
fraccionaria (utilícese el método Math.round() que aparece descrito en el
capítulo 1, o si no, búscalo en Internet)
	 */
	
	private double num;

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}
	
	public static boolean tieneDecimales(double num) {
		boolean decimales;
		
		if(num == Math.round(num)) {
			
			decimales = false;		
			
		}else {
			decimales = true;
		}
		return decimales;
	}
	
	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		double num = tc.nextDouble();
		
		System.out.println(tieneDecimales(num));
		
	}
	
}
