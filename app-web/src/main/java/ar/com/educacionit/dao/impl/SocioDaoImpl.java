package ar.com.educacionit.dao.impl;

import ar.com.educacionit.dao.SociosDao;

import ar.com.educacionit.domain.Socios;

public class SocioDaoImpl implements SociosDao {
	
	//create
	public  Socios save(Socios socio) {
		
		String sql = "INSERT INTO SOCIOS(nombre,apellido,email,direccion) VALUES('carlos', 'lopez', 'krloss@gmail.com', 'av siempre viva 46')";
		
		System.out.println("Ejecutando sql:" + sql);
		
		return new Socios(10L, "carlos", "lopez", "krloss@gmail.com", "av siempre viva 46", 1l);
			
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
	
	
	//read by id
	public Socios getOne(Long id) {

		String sql = "SELECT * FROM SOCIOS WHERE ID = " +id;
		System.out.println("Ejecutando sql:" + sql);
	
		return new Socios(id,"richard", "niño", "richardmtz710@gmail.com", "chapinero 52", 1l);
		
	}

	public void delete(Long id) {
		String sql = "DELETE FROM socios WHERE id = " + id;
		System.out.println(sql);
	}

	public void update(Socios entity) {
		String sql = "UPDATE socios" + 
		"SET direccion = '"+entity.getDireccion()+"', apellido = '"+entity.getApellido()+"+', paises_id = "+entity.getPaisIid()+"" +
		"where id = 1";
		System.out.println(sql);
	}

	

}
