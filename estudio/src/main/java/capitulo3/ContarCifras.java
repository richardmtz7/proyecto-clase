package capitulo3;

import java.util.Scanner;

public class ContarCifras {
	
	
	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num = tc.nextInt();
		
		
		
		if(num >= 1 && num <= 9) {
			do {
				Math.abs(num);
				
			}while(num < 0);
			System.out.println("El numero tiene 1 cifra");	
		}
		
		if(num >=10 && num <=99) {
			do {
				Math.abs(num);
				
			}while(num < 0);
			System.out.println("El numero tiene 2 cifras");
		}
		
		if(num >= 100 && num <= 999) {
			do {
				Math.abs(num);
				
			}while(num < 0);
			System.out.println("El numero tiene 3 cifras");
		}
		
		if(num >= 1000 && num <= 9999) {
			do {
				Math.abs(num);
				
			}while(num < 0);
			System.out.println("El numero tiene 4 cifras");
		}
	}
	
	
}
