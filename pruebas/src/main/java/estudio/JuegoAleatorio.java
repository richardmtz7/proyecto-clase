package estudio;

import java.util.Random;

public class JuegoAleatorio {

	public static void main(String[] args) {
		
		Random r = new Random();
		int i=0;
		while(i < 20) {
			i++;
			System.out.println(r.nextInt(100) +",");
		}
	}

}
