package domain.co.dao.Impl;

import domain.co.Materia;
import domain.co.dao.MateriaDao;

public class MateriaDaoImpl extends JdbcBase<Materia> implements MateriaDao{
		
	public MateriaDaoImpl() {
		super("Materia");
	}
	

}
