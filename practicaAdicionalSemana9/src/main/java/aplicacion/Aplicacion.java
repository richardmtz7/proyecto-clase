package aplicacion;

import domain.co.Alumno;
import domain.co.Materia;
import domain.co.services.AlumnoServices;
import domain.co.services.MateriaServices;
import domain.co.services.Impl.AlumnoServicesImpl;
import domain.co.services.Impl.MateriaServiceImpl;

public class Aplicacion {

	public static void main(String[] args) {
		AlumnoServices services = new AlumnoServicesImpl();
		Alumno alumno = services.getOne(1l);
		alumno.setNombre("Richard");
		alumno.setApellido("Niño");
		alumno.setId(1);
		System.out.println(alumno);
		
		MateriaServices service = new MateriaServiceImpl();
		Materia materia = service.getOne(1l);
		materia.setCurso("Calculo");
		materia.setTurno(1);
		materia.setId(1);
		System.out.println(materia);
	}

}
