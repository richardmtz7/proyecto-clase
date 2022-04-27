package domain.co.services.Impl;

import domain.co.Alumno;
import domain.co.dao.Impl.AlumnoDaoImpl;
import domain.co.services.AlumnoServices;

public class AlumnoServicesImpl extends AbstracBaseService<Alumno> implements AlumnoServices{
	
	public AlumnoServicesImpl() {
		super(new AlumnoDaoImpl());
	}

}
