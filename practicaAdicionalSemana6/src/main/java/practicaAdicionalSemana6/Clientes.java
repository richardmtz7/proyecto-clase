package practicaAdicionalSemana6;

public class Clientes {
	
	private String nombre;
	private String ciudad;
	private String calle;
	private float cuenta;
	private String asesor;
	
	public Clientes(String nombre, String ciudad, String calle, float cuenta, String asesor) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.calle = calle;
		this.cuenta = cuenta;
		this.asesor = asesor;
	}
	
	
	

	public String getAsesor() {
		return asesor;
	}




	public void setAsesor(String asesor) {
		this.asesor = asesor;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public float getCuenta() {
		return cuenta;
	}

	public void setCuenta(float cuenta) {
		this.cuenta = cuenta;
	}
	
	
	
	
	
	
	
	
}
