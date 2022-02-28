package estudio;

public class CicloFor {

	public static void main(String[] args) {
		
		
		//Ejemplo de for con un array
		int [] numeros = {1,2,3,4,5,6,7,8,9};
		
		for(int i=0; i<numeros.length ;i++) {
			System.out.println("El array es: "+ numeros[i]);
		}
		System.out.println("----------------------------------------------");
		//Ejemplo de un for clasico
		for(int i=0; i<10;i++) {
			System.out.println(i);
			
		}
		System.out.println("----------------------------------------------");
		
		int [] numbers = {1,2,3,4,5};
		for(int Dato : numbers) {
			System.out.println(Dato);
		}
	}
}
