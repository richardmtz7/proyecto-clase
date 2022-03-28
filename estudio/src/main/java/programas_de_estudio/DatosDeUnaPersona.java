package programas_de_estudio;

public class DatosDeUnaPersona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private char sexo;
	
	
	
	
	
	public DatosDeUnaPersona(String nombre, String apellido, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		String s;
		if(sexo=='M') {
			s="Masculino";
			System.out.println("El sexo es: Masculino");
			
		}
		if(sexo=='F') {
			System.out.println("Femenino");
		}
		if(sexo!='F' && sexo!='M') {
			System.out.println("Desconocido");
		}
		
		return sexo;
	}
	public void setSexo(char s ) {
		sexo=s;
		
	}
	@Override
	public String toString() {
		return "Datos De Una Persona: [Nombre=" + nombre + ", Apellido=" + apellido + ", Edad=" + edad + ", Sexo=" + sexo
				+ "]";
	}
	
	
	
	


}
