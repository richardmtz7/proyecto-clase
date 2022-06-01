package co.com.itsense.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="articulos")
public class Articulo implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(unique=true, nullable = false)
	private Long idArticulo;
	private String titulo;
	private String codigo;
	private Long stock;
	
	
	/**
	 * 	//constructor sin id > insert
	public Articulo(String titulo, String codigo, Long stock, Long categoriasId) {
		super();
		this.titulo = titulo;
		this.codigo = codigo;
		this.stock = stock;
		this.categoriasId = categoriasId;
	}
	
	//constructor con id: cuando obtenga el dato de la db

	public Articulo(Long id, String titulo, String codigo, Long stock, Long categoriasId) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.codigo = codigo;
		this.stock = stock;
		this.categoriasId = categoriasId;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Long getStock() {
		return stock;
	}
	public void setStock(Long stock) {
		this.stock = stock;
	}
	
	public Long getCategoriasId() {
		return categoriasId;
	}
	public void setCategoriasId(Long categoriasId) {
		this.categoriasId = categoriasId;
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", titulo=" + titulo + ", codigo=" + codigo
				+  ", stock=" + stock +  ", categoriasId="
				+ categoriasId + "]";
	}
	 */
	


	
}
