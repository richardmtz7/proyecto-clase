package programas_de_estudio;

import java.util.Scanner;

public class ConvertidorDeUnidades {

	/*
	 * Escribe en Java una clase Temperatura que convierta de grados Celsius a
	 *Farenheit y viceversa. Para ello crea dos métodos:
	 *double celsiusToFarenheit(double)
	 *double farenheitToCelsius(double)
	 *recuerda que, para convertir de una unidad a otra, la fórmula adecuada es:
	 *de Farenheit a Celsius: C = (F – 32) / 1,8
	 *de Celsius a Farenheit: F = (1,8) x C + 32
	 *escribe también un método main() para poder probar los métodos anteriores a
	 *partir de un número introducido por el usuario del programa.
	 */
	
	
	 public static double celsiusToFarenheit (double F, double C) {
		double CF=0;
		 CF=(1.8)*(C+32);
		 System.out.println("La conversio de celsius a farenheit es: " + CF);
		 return CF;
	}
	 public static double farenheitToCelsius (double F, double C) {
		
		 double FC=0;
		 FC=(F-32)/1.8;
		System.out.println("La conversio de farenheit a celsius es: " + FC);
		 return FC;
	}
	
	
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingrese la temperatura en Farenheit");
	double F = teclado.nextDouble();
	System.out.println("Ingrese la temperatura en Celsius");
	double C = teclado.nextDouble();
	
	celsiusToFarenheit(F, C);
	farenheitToCelsius(F, C);
		
	}

}
