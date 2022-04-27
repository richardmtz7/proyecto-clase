package domain.co.dao.Impl;

import java.lang.reflect.ParameterizedType;

import domain.co.dao.Menu;

public class JdbcBase<T> implements Menu<T>{
	
	protected String tabla; 
	protected Class<T> clazz;
	
	
	
public JdbcBase (String tablaDelHijo) {
		
		this.tabla = tablaDelHijo;
		//api reflection de java
		this.clazz = (Class<T>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		
	}
	public T save(T entity) {
		
		
		return null;
	}

	public T getOne(Long id) {
		String sql = "SELECT * FROM "+ this.tabla + " WHERE ID = " +id;
		System.out.println("EJECUTANDO SQL: SELECT * FROM " + this.tabla + " WHERE ID = " +id);
		T entity;
		
		try {
			entity = this.clazz.newInstance();
		} catch (Exception e) {
			entity = null;
		}	
		return entity;
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void update(T entity) {
		// TODO Auto-generated method stub
		
	}

	public T[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}


