package clase9.oop.herencia;

public class Director extends Persona {
	private Integer emACargo;

	public Director(String nombre, String apellido, String colorPelo, Integer emACargo) {
		super(nombre, apellido, colorPelo);
		this.emACargo = emACargo;
	}

	public Integer getEmACargo() {
		return emACargo;
	}

	public void setEmACargo(Integer emACargo) {
		this.emACargo = emACargo;
	}
	
	
	
	
}
