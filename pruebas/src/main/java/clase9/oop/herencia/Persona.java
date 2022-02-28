package clase9.oop.herencia;

public class Persona {
	private String nombre;
	protected String apellido;
	public String colorPelo;
	
	
	
	public Persona(String nombre, String apellido, String colorPelo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.colorPelo = colorPelo;
	
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getColorPelo() {
		return colorPelo;
	}
	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}
	
	public void detalle() {
		System.out.println(this.toString());
		
		//si se necesita mandar el detalle a un archivo y no a la consola 
		
	}
	
	
	//metodos del Object, pero persona le cambia el comportamiento 
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", colorPelo=" + colorPelo + "]";
	}
	
	
}
