package dominio;

public abstract class Voladores {
	protected String nombre;
	protected double velocidad;
	
	

	public Voladores(String nombre, double velocidad) {
		super();
		this.nombre = nombre;
		this.velocidad = velocidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	public abstract void volar();
	
}
