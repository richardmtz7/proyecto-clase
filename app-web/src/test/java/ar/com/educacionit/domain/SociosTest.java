package ar.com.educacionit.domain;

import ar.com.educacionit.dao.impl.SocioDaoImpl;

public class SociosTest {

	public static void main(String[] args) {
		
		String nombre = "juan";
		String apellido = "perez";
		String dni = "1234567";
		String email = "richardmtz@gmail.com";
		String direccion = "calle 13";
		Long pais = 1l;
		
		//uso el constructor de la clase socios
		
		
		
		SocioDaoImpl socioImpl = new SocioDaoImpl();
		
		Socios socio = socioImpl.create(new Socios(10L,"richard", "niño", "richardmtz710@gmail.com", "chapinero 52", 1l));
		
		System.out.println("se ha creado el socio id: " + socio.getId());
		
		Socios otroSocio = socioImpl.findById(5l);
		
		if(otroSocio!= null) {
			System.out.println("Se ha creado el socio id: " + otroSocio.getId());
			
		}else {
			System.out.println("Se ha encontrado al socio: " +  otroSocio);
		}
		
		
		
	}

}
