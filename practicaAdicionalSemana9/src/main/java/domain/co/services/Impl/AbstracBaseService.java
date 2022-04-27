package domain.co.services.Impl;

import domain.co.dao.Menu;
import domain.co.services.MenuServices;

public class AbstracBaseService<T> implements MenuServices<T> {

protected Menu<T> menuDao;
	
	public AbstracBaseService(Menu<T> daoDelHijo) {
		this.menuDao = daoDelHijo;
	}

	public T save(T entity) {
		return menuDao.save(entity);
	}

	public T getOne(Long id) {
		
		return menuDao.getOne(id);
	}

	public void delete(Long id) {
		menuDao.delete(id);
		
	}

	public void update(T entity) {
		menuDao.update(entity);
	}

	public T[] findAll() {

		return menuDao.findAll();
	}
}
