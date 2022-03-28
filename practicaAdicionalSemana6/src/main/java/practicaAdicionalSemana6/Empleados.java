package practicaAdicionalSemana6;

public class Empleados {
	
	private int idEmpleado;
	private String nombreEmpleado;
	private String sucursalEmpleado;
	private String clienteEmpleado;
	private String fechaIncorporacion;
	protected Administracion[] datosEmpleado;
	
	
	
	
	
	public Empleados(int idEmpleado, String nombreEmpleado, String sucursalEmpleado, String clienteEmpleado,
			String fechaIncorporacion, Administracion[] datosEmpleados) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.sucursalEmpleado = sucursalEmpleado;
		this.clienteEmpleado = clienteEmpleado;
		this.fechaIncorporacion = fechaIncorporacion;
		this.datosEmpleado = datosEmpleados;
	}
	public Empleados(int idEmpleado, String nombreEmpleado, String sucursalEmpleado, String clienteEmpleado) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.sucursalEmpleado = sucursalEmpleado;
		this.clienteEmpleado = clienteEmpleado;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public String getSucursalEmpleado() {
		return sucursalEmpleado;
	}
	public void setSucursalEmpleado(String sucursalEmpleado) {
		this.sucursalEmpleado = sucursalEmpleado;
	}
	public String getClienteEmpleado() {
		return clienteEmpleado;
	}
	public void setClienteEmpleado(String clienteEmpleado) {
		this.clienteEmpleado = clienteEmpleado;
	}
	public String getFechaIncorporacion() {
		return fechaIncorporacion;
	}
	public void setFechaIncorporacion(String fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}
	public Administracion[] getDatosEmpleado() {
		return datosEmpleado;
	}
	public void setDatosEmpleado(Administracion[] datosEmpleado) {
		this.datosEmpleado = datosEmpleado;
	}
	
}
