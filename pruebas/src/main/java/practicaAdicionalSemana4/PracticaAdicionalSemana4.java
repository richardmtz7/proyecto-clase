package practicaAdicionalSemana4;

import java.util.Scanner;

public class PracticaAdicionalSemana4 {
	
	
	/*
	 * "Crear un branch con el nombre practica-adicional-semana4
	La idea es desarrollar un pequeño programa para incorporar los conceptos de clases, 
	atributos, métodos, clases abstractas, interfaces, composición, agregación.
	-Existe una torre de control donde operadores pueden determinar 
	ciertos voladores que pueden aterrizar en la pista
	Los voladores son, avion, helicoptero, superman, ovni.
	Los atributos que comparten son : nombre, (agregar otros de ser necesario)
	Cada volador tiene atributos particulares (decidir los que crean convenientes).	
	Ej: avion puede tener cantidad de asientos, el helicoptero puede tener color, marca, modelo etc.
	En la pista solo podrán aterrizar aquellos voladores que cumplan con la interfaz Aterrizable.
	Escribir las clases e interfaces, además de las relaciones de herencias 
	necesarias para poder resolverlo."
	 */
	
	
	

	

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
	
		String tipo = null;
		String color;
		String empresaVolador;
		Integer cantAsientos = null;
		Integer modelo = null;

		voladores(tipo, modelo, teclado);
		
	}
	
	//Ingresando datos del volador a aterrizar
	public static void voladores(String tipo, Integer modelo, Scanner teclado ) {
		System.out.println("La torre de control necesita que ingrese el tipo de volador");
		tipo = teclado.next();
		System.out.println("Ingrese el modelo del volador");
		modelo= teclado.nextInt();
		
		if(tipo=="avion"  && modelo >= 2005 ) {
			System.out.println("Aterrizable");	
		}else {
			System.out.println("No puede aterrizar");
		}
		
		
		}
	
	

}
		




