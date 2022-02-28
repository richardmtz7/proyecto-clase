package dominio;

public class Helicoptero extends Voladores {
	
	private String color;
	private String marca;
	private int modelo;
	
	public Helicoptero(String nombre, double velocidad, String color, String marca, int modelo) {
		super(nombre, velocidad);
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
	
	@Override
	public void volar() {
		System.out.println("Permiso de aterrizar");
	}
	@Override
	public String toString() {
		return "Helicoptero [color=" + color + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
}
