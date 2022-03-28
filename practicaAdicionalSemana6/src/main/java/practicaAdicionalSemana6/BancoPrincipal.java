package practicaAdicionalSemana6;

public class BancoPrincipal {
	
	private String nombre;
	private String ubicacion;
	private int cantEmpleados;
	private int cantSucursales;
	private int cantClientes;
	private String sucursal;	
	private String tipoCuenta;
	
	
	public int getCantClientes() {
		return cantClientes;
	}
	public void setCantClientes(int cantClientes) {
		this.cantClientes = cantClientes;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getCantEmpleados() {
		return cantEmpleados;
	}
	public void setCantEmpleados(int cantEmpleados) {
		this.cantEmpleados = cantEmpleados;
	}
	public int getCantSucursales() {
		return cantSucursales;
	}
	public void setCantSucursales(int cantSucursales) {
		this.cantSucursales = cantSucursales;
	}
	
	
	
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public BancoPrincipal(String nombre, String ubicacion, int cantEmpleados, int cantSucursales, String tipoCuenta) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.cantEmpleados = cantEmpleados;
		this.cantSucursales = cantSucursales;
		this.tipoCuenta = tipoCuenta;
	}
	
	
	@Override
	public String toString() {
		return "BancoPrincipal [nombre=" + nombre + ", ubicacion=" + ubicacion + ", cantEmpleados=" + cantEmpleados
				+ ", cantSucursales=" + cantSucursales + "]";
	}
	
	
	
	
}
