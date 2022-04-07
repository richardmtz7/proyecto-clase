package ar.com.educacionit.domain;

import ar.com.educacionit.dao.impl.SocioDaoImpl;
import ar.com.educacionit.services.SociosService;
import ar.com.educacionit.services.impl.SociosServiceImpl;

public class SociosTest {

	public static void main(String[] args) {
		
		String nombre = "juan";
		String apellido = "perez";
		String dni = "1234567";
		String email = "richardmtz@gmail.com";
		String direccion = "calle 13";
		Long pais = 1l;
		
		SociosService service = new SociosServiceImpl();
		Socios socio = new Socios(nombre, apellido, email, direccion, pais);
		service.save(socio);
		
	}

}
