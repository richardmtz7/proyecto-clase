package ar.com.educacionit.domain;

import ar.com.educacionit.dao.impl.SocioDaoImpl;

public class FindAllSociosTest {

	public static void main(String[] args) {
		
		//se crea la implementacion que permite acceder a la db (crudl)
		
		SocioDaoImpl socioImpl = new SocioDaoImpl();
		
		Socios[] vectorDeSocio = socioImpl.findAll();
		
		for(Socios socio : vectorDeSocio) {
			
			System.out.println(socio);
		}
		
	}

}
