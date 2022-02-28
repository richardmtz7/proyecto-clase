package dominio;

public class Superman extends Voladores{
	private String personaDisfrazada;
	private int edad;
	public Superman(String nombre, double velocidad, String personaDisfrazada, int edad) {
		super(nombre, velocidad);
		this.personaDisfrazada = personaDisfrazada;
		this.edad = edad;
	}
	public String getPersonaDisfrazada() {
		return personaDisfrazada;
	}
	public void setPersonaDisfrazada(String personaDisfrazada) {
		this.personaDisfrazada = personaDisfrazada;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public void volar() {
		System.out.println("No puede aterrizar");		
	}
	@Override
	public String toString() {
		return "Superman [personaDisfrazada=" + personaDisfrazada + ", edad=" + edad + "]";
	}
	
	
}
