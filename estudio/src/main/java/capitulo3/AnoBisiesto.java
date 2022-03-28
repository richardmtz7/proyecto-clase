package capitulo3;

import java.util.Scanner;

public class AnoBisiesto {
	
	/*
	 * Determinar si un año es bisiesto o no. Los años bisiestos son múltiplos de 4;
	utilícese el operador módulo. ¡Pero hay más excepciones! Los múltiplos de
	100 no son bisiestos, aunque sean múltiplos de 4. Pero los múltiplos de 400
	sí, aunque sean múltiplos de 100. Qué follón. La Tierra es muy maleducada
	al no ajustarse a los patrones de tiempo humanos.
	Resumiendo: un año es bisiesto si es divisible entre 4, a menos que sea
	divisible entre 100. Sin embargo, si un año es divisible entre 100 y además es
	divisible entre 400, también resulta bisiesto.
	Ahora, prográmalo, a ver qué sale.
	 */
	public static boolean esBisiesto(int a) {
	    
		boolean bisiesto = false;

		if (a % 4   == 0) bisiesto = true;
		if (a % 100 == 0) bisiesto = false;
		if (a % 400 == 0) bisiesto = true;
		

		return bisiesto;
	    
	}
	
	
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Ingrese el año");
		int a = tc.nextInt();
		esBisiesto(a);
	}

	
	
}
