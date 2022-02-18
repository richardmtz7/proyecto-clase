package ar.com.educacionit.domain;

public class Marcas {
	
	private Long id;
	private String marca;
	private Long habilitado;
	private String codigo;
	
	
	public Marcas(Long id, String marca, Long habilitado, String codigo) {
		this.id = id;
		this.marca = marca;
		this.habilitado = habilitado;
		this.codigo = codigo;
	}
	
	
	public Marcas(String marca, Long habilitado, String codigo) {
		this.marca = marca;
		this.habilitado = habilitado;
		this.codigo = codigo;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Long getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(Long habilitado) {
		this.habilitado = habilitado;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		return "Marca [id=" + id + ", marca=" + marca + ", habilitado=" + habilitado + ", codigo=" + codigo + "]";
	}
	
	
}
