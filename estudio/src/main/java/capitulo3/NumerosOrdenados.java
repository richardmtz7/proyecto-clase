package capitulo3;

import java.util.Scanner;

public class NumerosOrdenados {
	
	/*
	 * Leer tres números por teclado, X, Y y Z, y decidir si están ordenados de
menor a mayor. Complétalo con otro método que nos diga si los números,
además de estar ordenados, son consecutivos.
	 */
	
	private static float x;
	private static float y;
	private static float z;
	
	NumerosOrdenados(){
		x=0;
		y=0;
		z=0;
	}
	
	NumerosOrdenados(float a, float b, float c){
		x = a;
		y = b;
		z = c;	
	}
	
	public void setNumeros(float a, float b, float c) {
		x = a;
		y = b;
		z = c;
	}
	
	public static boolean ordenNumeros(){
		boolean resul;
		
		if((x < y) && (y < z)) {
			resul = true;
		}else {
			resul = false;
		}
		return resul;
	}
	
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		float x = tc.nextFloat();
		System.out.println("Ingrese el segundo numero");
		float y = tc.nextFloat();
		System.out.println("Ingrese el tercer numero");
		float z = tc.nextFloat();
		
		System.out.println(ordenNumeros());;
		
		
	}
}
