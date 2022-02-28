package dominio;

public class Ovni extends Voladores{
	
	private String color;
	private String marca;
	private Integer modelo;
	public Ovni(String nombre, double velocidad, String color, String marca, Integer modelo) {
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
	public Integer getModelo() {
		return modelo;
	}
	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public void volar() {
		System.out.println("No puede aterrizar");		
	}
	@Override
	public String toString() {
		return "Ovni [color=" + color + ", marca=" + marca + ", modelo=" + modelo + "]";
	}	
	
}



