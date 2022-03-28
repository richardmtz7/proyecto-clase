package capitulo3;

import java.util.Scanner;

public class Resta {
	/*Leídos dos números por teclado, llamémosles A y B, calcular y mostrar la
	resta del mayor menos el menor. Por ejemplo, si A = 8 y B = 3, el resultado
	debe ser A – B, es decir, 5. Pero si A = 4 y B = 7, el resultado debe ser B – A,
	es decir, 3. 
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		double numA = teclado.nextDouble() ;
		System.out.println("Ingrese el segundo numero");
		double numB = teclado.nextDouble();
		
		if(numA > numB) {
			double resta = numA - numB;
			System.out.println("La resta de los dos numeros es: " + resta);
			
		}
		if(numA < numB) {
			double resta1 = numB - numA;
			System.out.println("La resta de los dos numeros es: " + resta1);
		}
		
		
	}
	
	
}
