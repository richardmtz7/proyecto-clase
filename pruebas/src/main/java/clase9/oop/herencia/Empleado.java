package clase9.oop.herencia;

public class Empleado extends Persona {
	//atributo propio del empleado 
	private Integer id;
	
	
	public Empleado(String nombre, String apellido, String colorPelo, Integer id) {
		//antes de nacer el empleado debe nacer la persona
		
		super(nombre, apellido, colorPelo);
		
		// se pueden setear los atributos
		this.id=id;
		
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
}
