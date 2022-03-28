package practicaAdicionalSemana6;

public class Sucursal1 extends BancoPrincipal{

	private String id_cliente;
	private String ciudad_cliente;
	private String nombre_cliente;
	private String calle_cliente;
	String[] datosCliente;
	
	public Sucursal1(String nombre, String ubicacion, int cantEmpleados, int cantSucursales, String tipoCuenta) {
		super(nombre, ubicacion, cantEmpleados, cantSucursales, tipoCuenta);
	}


	public Sucursal1(String nombre, String ubicacion, int cantEmpleados, int cantSucursales, String tipoCuenta,
			String id_cliente, String ciudad_cliente, String nombre_cliente, String calle_cliente,
			String[] datosCliente) {
		super(nombre, ubicacion, cantEmpleados, cantSucursales, tipoCuenta);
		this.id_cliente = id_cliente;
		this.ciudad_cliente = ciudad_cliente;
		this.nombre_cliente = nombre_cliente;
		this.calle_cliente = calle_cliente;
		this.datosCliente = datosCliente;
	}





	public String getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}


	public String getCiudad_cliente() {
		return ciudad_cliente;
	}


	public void setCiudad_cliente(String ciudad_cliente) {
		this.ciudad_cliente = ciudad_cliente;
	}


	public String getNombre_cliente() {
		return nombre_cliente;
	}


	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}


	public String getCalle_cliente() {
		return calle_cliente;
	}


	public void setCalle_cliente(String calle_cliente) {
		this.calle_cliente = calle_cliente;
	}

	
	

}
