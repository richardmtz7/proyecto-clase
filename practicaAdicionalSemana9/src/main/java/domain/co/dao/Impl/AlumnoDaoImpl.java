package domain.co.dao.Impl;

import domain.co.Alumno;
import domain.co.dao.AlumnosDao;

public class AlumnoDaoImpl extends JdbcBase<Alumno> implements AlumnosDao {
	public AlumnoDaoImpl() {
		super("Alumnos");
	}
}
