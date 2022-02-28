package dominio;

public class Avion extends Voladores {
	
	private String marca;
	private int modelo;
	private String color;
	
	
	public Avion(String nombre, double velocidad, String marca, int modelo, String color) {
		super(nombre, velocidad);
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	
	@Override
	public void volar() {
		System.out.println("Tiene acceso para aterriar");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Avion [marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
