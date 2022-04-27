package domain.co.services.Impl;

import domain.co.Materia;
import domain.co.dao.MateriaDao;
import domain.co.dao.Impl.MateriaDaoImpl;
import domain.co.services.MateriaServices;

public class MateriaServiceImpl extends AbstracBaseService<Materia> implements MateriaServices {
	
	public MateriaServiceImpl() {
		super(new MateriaDaoImpl());
	}

}
