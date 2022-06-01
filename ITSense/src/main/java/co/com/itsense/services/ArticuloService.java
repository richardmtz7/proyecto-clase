package co.com.itsense.services;

import java.util.List;

import co.com.itsense.models.Articulo;


public interface ArticuloService {
	
	
	public List<Articulo> listarArticulo();
	
	public void guardar(Articulo articulo);
	
	public void eliminar(Articulo articulo);
	
	public Articulo encontrarArticulo(Articulo articulo);
	
    
    }
	
