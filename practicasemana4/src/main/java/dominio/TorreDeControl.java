package dominio;

public class TorreDeControl {
	
	private int operadores;
	private String ubicacion;
	private int numAngar;
	private Voladores[] volador;
	
	
	public TorreDeControl(int operadores, String ubicacion, int numAngar, Voladores[] volador) {
		super();
		this.operadores = operadores;
		this.ubicacion = ubicacion;
		this.numAngar = numAngar;
		this.volador = volador;
	}

	public int getOperadores() {
		return operadores;
	}

	public void setOperadores(int operadores) {
		this.operadores = operadores;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getNumAngar() {
		return numAngar;
	}

	public void setNumAngar(int numAngar) {
		this.numAngar = numAngar;
	}

	public Voladores[] getVolador() {
		return volador;
	}

	public void setVolador(Voladores[] volador) {
		this.volador = volador;
	}

	@Override
	public String toString() {
		return "TorreDeControl [operadores=" + operadores + ", ubicacion=" + ubicacion + ", numAngar=" + numAngar
				+ ", volador=" + volador + "]";
	}
	
	public void aterrizar() {
		for(Voladores v : volador) {
			System.out.print(v.getClass().getSimpleName() + ": ");
			
			v.volar();
			
		}
	}
}
