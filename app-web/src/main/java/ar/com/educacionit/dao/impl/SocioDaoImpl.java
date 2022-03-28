package ar.com.educacionit.dao.impl;

import ar.com.educacionit.dao.ICrud;
import ar.com.educacionit.domain.Socios;

public class SocioDaoImpl implements ICrud {
	
	//create
	public  Socios create(Socios socio) {
		
		
		
		String sql = "INSERT INTO SOCIOS(nombre, apellido, email, direccion) VALUES('richard', 'niño', 'richardmtz710@gmail.com', 'chapinero 52', 1l)";
		
		System.out.println("Ejecutando base de datos" + sql);
		
		return new Socios(10L,"richard", "niño", "richardmtz710@gmail.com", "chapinero 52", 1l);
			
		
	}
	
	//read por id

	public Socios findById(Long id) {
		
		String sql = "SELECT * FROM SOCIOS WHERE ID = " +id;
		System.out.println("Ejecutando sql:" + sql);
		return new Socios(id,"richard", "niño", "richardmtz710@gmail.com", "chapinero 52", 1l);
	}
	
	//search
	public Socios[] findAll() {
		
		String sql = "EJECUTANDO sql: SELECT * FROM SOCIOS";
		System.out.println(sql);
		Socios socio1 = new Socios(1l,"richard", "niño", "richardmtz710@gmail.com", "chapinero 52", 1l);
		Socios socio2 = new Socios(2l,"richard", "niño", "richardmtz710@gmail.com", "chapinero 52", 1l);
		Socios socio3 = new Socios(3l,"richard", "niño", "richardmtz710@gmail.com", "chapinero 52", 1l);
		
		return new Socios[] {socio1,socio2,socio3};
		
	}
	

}
