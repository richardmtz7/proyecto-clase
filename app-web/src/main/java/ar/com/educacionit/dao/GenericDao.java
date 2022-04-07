package ar.com.educacionit.dao;


public interface GenericDao<T> {
	
	public T save(T entity);
	
	public T getOne(Long id);
	
	public void delete(Long id);
	
	public void update(T entity);
	
	public T[] findAll();
}
