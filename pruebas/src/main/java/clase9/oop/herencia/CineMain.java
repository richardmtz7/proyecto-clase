package clase9.oop.herencia;

public class CineMain {

	public static void main(String[] args) {
		
		Persona persona= new Persona("persona1","apellido1", "negro");
		Empleado empleado = new Empleado("empleado1", "apellidoemp1", "rojo", 1);
		Efectivo efectivo= new Efectivo ("nombre efectivo", "apellido efectivo","rubio", 1);
		Contratado contratado = new Contratado ("nombre contratado", "apellido contratado", "azul",1, 6);
		
		Director director = new Director("nombre director", "apellido director", "negro", 10);
		
		//todas las personas pueden ir al cine
		
		Persona[] personas=new Persona[5];
		personas[0]= persona;
		personas[1]=empleado;
		personas[2]=efectivo;
		personas[3]=contratado;
		personas[4]=director; 
		
		//recorrer las personas que entran al cine y quiero saber si es un director
		for( Persona aux: personas  ) {
			
			//con aux se tiene acceso a todos los metodos publicos de persona
			aux.detalle();
			
			
			
			if(aux instanceof Director) {
				//toma el director que esta dentro de la persona 
				Director d=(Director)aux;
				System.out.println("Director: "+ d.getEmACargo() + " va a una silla especial");
			}
			
		}
		
		
	}

}
